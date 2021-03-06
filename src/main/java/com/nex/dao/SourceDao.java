package com.nex.dao;

import java.util.List;

import com.nex.domain.IpV4Address;
import com.nex.domain.IpV6Address;
import com.nex.domain.NotValidIp;

public interface SourceDao {

	public List<IpV4Address> getIpV4ListFromSource(int sourceId);

	public List<IpV6Address> getIpV6ListFromSource(int sourceId);

	public List<NotValidIp> getNotValidIpFromSource(int sourceId);

	public List<IpV4Address> getFirstIpV4ListFromSource(int sourceId,
			int start, int end);

	public List<IpV6Address> getFirstIpV6ListFromSource(int sourceId,
			int start, int end);

	public List<NotValidIp> getFirstNotValidIpListFromSource(int sourceId,
			int count);

	public void setIpV4Address(String ip, int sourceId);

	public void setIpV6Address(String ip, int sourceId);
}
