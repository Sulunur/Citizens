package kz.icode.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kz.icode.cruddemo.dao.CitizenDAO;
import kz.icode.cruddemo.dto.CitizenDto;
import kz.icode.cruddemo.entity.Citizen;

@Service
public class CitizenServiceImpl implements CitizenService {

	private CitizenDAO citizenDAO;

	@Autowired
	public CitizenServiceImpl(CitizenDAO theCitizenDAO) {
		citizenDAO = theCitizenDAO;
	}

	@Override
	@Transactional
	public List<Citizen> findAll() {
		return citizenDAO.findAll();
	}

	@Override
	@Transactional
	public Citizen findById(int theId) {
		return citizenDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Citizen theCitizen) {
//		Citizen entity = new Citizen();
//		entity.setSurname(theCitizen.getSurname());
//		entity.setName(theCitizen.getName());
		
		citizenDAO.save(theCitizen);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		citizenDAO.deleteById(theId);
	}
}
