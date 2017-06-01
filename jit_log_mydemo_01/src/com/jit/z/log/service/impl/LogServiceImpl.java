/**
 * 
 */
package com.jit.z.log.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jit.z.log.mapper.LogMapper;
import com.jit.z.log.po.Log;
import com.jit.z.log.service.LogService;

/**
 * @author liudingbang
 *
 *2017年6月1日下午2:29:57
 */
@Service
public class LogServiceImpl implements LogService {
	@Autowired
	LogMapper logMapper;

	/* (non-Javadoc)
	 * @see com.jit.z.log.service.LogService#findAll(int, int)
	 */
	@Override
	public Map<String, Object> findAll(int page, int rows) {
		PageHelper.startPage(page,rows);
		System.out.println(page);
		System.out.println(rows);
		List<Log> list = logMapper.findAll();
		PageInfo<Log> pageInfo = new PageInfo<Log>(list);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("page", pageInfo.getPages());
		map.put("rows", pageInfo.getList());
		map.put("start", pageInfo.getStartRow());
		map.put("total", pageInfo.getTotal());
		return map;
	}

	/* (non-Javadoc)
	 * @see com.jit.z.log.service.LogService#addStudent(com.jit.z.log.po.Log)
	 */
	@Override
	public void addLog(Log log) {
		logMapper.addLog(log);

	}

}
