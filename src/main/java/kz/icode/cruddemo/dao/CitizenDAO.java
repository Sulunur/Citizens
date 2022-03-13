package kz.icode.cruddemo.dao;

import java.util.List;

import kz.icode.cruddemo.entity.Citizen;

public interface CitizenDAO {

	public List<Citizen> findAll();
	
	public Citizen findById(int theId);
	
	public void save(Citizen theCitizen);
	
	public void deleteById(int theId);

}
