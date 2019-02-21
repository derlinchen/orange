package com.orange.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.orange.dao.BusDao;
import com.orange.entity.PmtXtype;
import com.orange.service.BusService;

@Service
public class BusServiceImp implements BusService {

	@Resource
	private BusDao busDao;
	
	@Override
	public List<PmtXtype> getXtype(PmtXtype item) {
		List<PmtXtype> xtypes = busDao.getXtype(item);
		return xtypes;
	}

}
