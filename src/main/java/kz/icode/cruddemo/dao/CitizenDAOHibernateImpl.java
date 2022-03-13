package kz.icode.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import kz.icode.cruddemo.entity.Citizen;

@Repository
public class CitizenDAOHibernateImpl implements CitizenDAO {

	private EntityManager entityManager;

	@Autowired
	public CitizenDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
//	@Transactional
	public List<Citizen> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);

		Query<Citizen> theQuery = currentSession.createQuery("from Citizen", Citizen.class);

		List<Citizen> citizens = theQuery.getResultList();

		return citizens;
	}

	@Override
	public Citizen findById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);

		Citizen theCitizen = currentSession.get(Citizen.class, theId);

		return theCitizen;
	}

	@Override
	public void save(Citizen theCitizen) {
		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(theCitizen);
	}

	@Override
	public void deleteById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);

		Query theQuery = currentSession.createQuery("delete from Citizen where id=:citizenId");
		theQuery.setParameter("citizenId", theId);
		theQuery.executeUpdate();

	}
}
