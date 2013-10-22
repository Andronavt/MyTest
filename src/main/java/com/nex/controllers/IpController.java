package com.nex.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nex.domain.IpV4Address;
import com.nex.service.IpService;

@Controller
public class IpController {

	@Autowired
	private IpService ipService;

	@RequestMapping("/")
	public String listUser(Map<String, Object> map) {
		map.put("ip", new IpV4Address());
		map.put("ipList", ipService.listIp());
		return "ip";
	}
}
