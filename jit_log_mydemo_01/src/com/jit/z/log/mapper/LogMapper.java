/**
 * 
 */
package com.jit.z.log.mapper;

import java.util.List;

import com.jit.z.log.po.Log;


/**
 * @author liudingbang
 *
 *2017年6月1日下午2:22:02
 */
public interface LogMapper {
	public List<Log> findAll();
	public void addLog(Log log);

}
