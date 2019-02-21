package com.orange.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orange.entity.PmtXtype;
import com.orange.service.BusService;

@RestController
public class BusController {

	@Resource
	private BusService busService;
	
	@RequestMapping("/say")
	public String say(){
		return "spring boot test";
	}
	
	@RequestMapping("/printXtype")
	public void printXtype(){
		PmtXtype item = new PmtXtype();
		List<PmtXtype> xtypes = busService.getXtype(item);
		for (PmtXtype pmtXtype : xtypes) {
			System.out.println(pmtXtype.getXtype()+"---------"+pmtXtype.getXtypename());
		}
	}
	
}
