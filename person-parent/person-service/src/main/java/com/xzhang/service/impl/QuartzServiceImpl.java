package com.xzhang.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xzhang.dao.QuartzMapper;
import com.xzhang.model.InstmtQuartz;
import com.xzhang.service.IQuartzService;

@Service("quartzService")
public class QuartzServiceImpl implements IQuartzService {

	
	private QuartzMapper quartzMapper;
	
	public QuartzMapper getQuartzMapper() {
		return quartzMapper;
	}
	@Autowired
	public void setQuartzMapper(QuartzMapper quartzMapper) {
		this.quartzMapper = quartzMapper;
	}



	@Override
	public List<InstmtQuartz> getInstmtQuartzList(Map<String, Object> map) {
		return quartzMapper.getInstmtQuartzList(map);
	}
	
	@Override
	public InstmtQuartz getQuartzByid(String id) {
		return quartzMapper.getQuartzByid(id);
	}
	
	@Override
	public void delQuartzByid(String id) {
		quartzMapper.delQuartzByid(id);
	}
	
	@Override
	public void insertQuartz(InstmtQuartz quartz) {
		quartzMapper.insertQuartz(quartz);
	}
	
	@Override
	public void updateQuartzByid(InstmtQuartz quartz) {
		quartzMapper.updateQuartzByid(quartz);
	}
	

}
