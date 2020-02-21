package com.accp.springMVC_t2.Biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.springMVC_t2.Dao.flightInfoDao;
import com.accp.springMVC_t2.pojo.flightInfo;

@Service("flightInfoBiz")
public class flightInfoBiz  {

	@Resource
	private flightInfoDao fli;
	
	public flightInfo queryById(String flightId) {
		// TODO Auto-generated method stub
		return fli.queryById(flightId);
	}

}
