package kz.icode.cruddemo.service;

import java.util.List;

import kz.icode.cruddemo.dto.CitizenDto;
import kz.icode.cruddemo.entity.Citizen;

public interface CitizenService {
	public List<Citizen> findAll();

	public Citizen findById(int theId);

	public void save(Citizen theCitizen);

	public void deleteById(int theId);
}
