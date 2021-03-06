package com.nex.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.nex.domain.IpV4Address;
import com.nex.domain.IpV6Address;
import com.nex.domain.NotValidIp;
import com.nex.domain.Source;

@Repository
public class SourceDaoImpl implements SourceDao {

	@PersistenceContext(name = "primary")
	private EntityManager entityManager;

	public SourceDaoImpl() {

	}

	@Override
	public List<IpV4Address> getIpV4ListFromSource(int sourceId) {
		List<IpV4Address> list = new ArrayList<IpV4Address>(entityManager.find(
				Source.class, sourceId).getIpv4Set());
		return list;
	}

	@Override
	public List<IpV6Address> getIpV6ListFromSource(int sourceId) {
		List<IpV6Address> list = new ArrayList<IpV6Address>(entityManager.find(
				Source.class, sourceId).getIpv6Set());
		return list;
	}

	@Override
	public List<NotValidIp> getNotValidIpFromSource(int sourceId) {
		List<NotValidIp> list = new ArrayList<NotValidIp>(entityManager.find(
				Source.class, sourceId).getNotValidSet());
		return list;
	}

	@Override
	public List<IpV4Address> getFirstIpV4ListFromSource(int sourceId,
			int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IpV6Address> getFirstIpV6ListFromSource(int sourceId,
			int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NotValidIp> getFirstNotValidIpListFromSource(int sourceId,
			int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIpV4Address(String ip, int sourceId) {
		Source tempSource = entityManager.find(Source.class, sourceId);
		IpV4Address tempIp = new IpV4Address(ip, new Date());
		tempSource.addIpToV4Set(tempIp);
		entityManager.persist(tempSource);
	}

	@Override
	public void setIpV6Address(String ip, int sourceId) {
		Source tempSource = entityManager.find(Source.class, sourceId);
		IpV6Address tempIp = new IpV6Address(ip, new Date());
		tempSource.addIpToV6Set(tempIp);
		entityManager.persist(tempSource);

	}

}
