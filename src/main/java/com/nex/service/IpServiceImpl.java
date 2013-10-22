package com.nex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nex.dao.IpDao;
import com.nex.domain.IpV4Address;

@Service
public class IpServiceImpl implements IpService {

	@Autowired
	private IpDao ipDao;

	@Transactional
	public List<IpV4Address> listIp() {
		return ipDao.listIp();
	}

}
