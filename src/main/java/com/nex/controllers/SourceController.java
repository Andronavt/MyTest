package com.nex.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nex.domain.Source;
import com.nex.service.SourceService;

@Controller
public class SourceController {

	private static final int SOURCE_TEST = 1;

	@Autowired
	private SourceService souService;

	@RequestMapping("/")
	public String listIpV4(Map<String, Object> map) {
		map.put("ip", new Source());
		map.put("ipList", souService.getIpV4ListFromSource(SOURCE_TEST));
		return "ip";
	}
	
	@RequestMapping("/test")
	public String listIp(Map<String, Object> map) {
		map.put("ip", new Source());
		map.put("ipList", souService.getIpV4ListFromSource(SOURCE_TEST));
		return "test";
	}
}
