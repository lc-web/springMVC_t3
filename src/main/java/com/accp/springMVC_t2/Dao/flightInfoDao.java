package com.accp.springMVC_t2.Dao;

import org.apache.ibatis.annotations.Param;

import com.accp.springMVC_t2.pojo.flightInfo;

public interface flightInfoDao {

	
	public flightInfo queryById(@Param("flightId")String flightId);
}
