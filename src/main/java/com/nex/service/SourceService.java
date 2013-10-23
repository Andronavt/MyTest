package com.nex.service;

import java.util.List;

import com.nex.domain.IpV4Address;

public interface SourceService {

	public List<IpV4Address> getIpV4ListFromSource(int sourceId);
}
