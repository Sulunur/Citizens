package kz.icode.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kz.icode.cruddemo.entity.Citizen;
import kz.icode.cruddemo.service.CitizenService;

@Api(tags = "Citizen API", description = CitizenApiInfo.CONTROLLER_DESCRIPTION)
@RestController
@RequestMapping("/api")
public class CitizenRestController {

	private CitizenService citizenService;

	@Autowired
	public CitizenRestController(CitizenService theCitizenService) {
		citizenService = theCitizenService;
	}

	@ApiOperation(CitizenApiInfo.FINDALL_DESCRIPTION)
	@GetMapping("/citizens")
	public List<Citizen> findAll() {
		return citizenService.findAll();
	}

	@ApiOperation(CitizenApiInfo.FINDBYID_DESCRIPTION)
	@GetMapping("/citizens/{citizenId}")
	public Citizen getCitizen(@PathVariable int citizenId) {
		Citizen theCitizen = citizenService.findById(citizenId);

		if (theCitizen == null) {
			throw new RuntimeException("Citizen is not ");
		}
		return theCitizen;
	}

	@ApiOperation(CitizenApiInfo.CREATE_DESCRIPTION)
	@PostMapping("/citizens")
	public Citizen addCitizen(@RequestBody Citizen theCitizen) {
		citizenService.save(theCitizen);
		return theCitizen;
	}

	@ApiOperation(CitizenApiInfo.UPDATE_DESCRIPTION)
	@PutMapping("/citizens")
	public Citizen updateCitizens(@RequestBody Citizen theCitizen) {
		citizenService.save(theCitizen);
		return theCitizen;
	}

	@ApiOperation(CitizenApiInfo.DELETE_DESCRIPTION)
	@DeleteMapping("/citizens/{citizenId}")
	public String deleteCitizen(@PathVariable int citizenId) {
		Citizen tempCitizen = citizenService.findById(citizenId);

		if (tempCitizen == null) {
			throw new RuntimeException("Citizen id not found - " + citizenId);
		}

		citizenService.deleteById(citizenId);
		return "Deleted citizen id - " + citizenId;
	}

}
