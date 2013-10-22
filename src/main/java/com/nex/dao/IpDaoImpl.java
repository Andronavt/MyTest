package com.nex.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.nex.domain.IpV4Address;

@Repository
public class IpDaoImpl implements IpDao {

	// @Autowired
	// private SessionFactory sessionFactory;
	@PersistenceContext(name = "primary")
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<IpV4Address> listIp() {
		// return sessionFactory.getCurrentSession()
		// .createQuery("from IpV4Address").list();
		return entityManager.createQuery("from IpV4Address").getResultList();
	}

}
