/**
 * 
 */
package com.jit.z.log.service;

import java.util.Map;

import com.jit.z.log.po.Log;

/**
 * @author liudingbang
 *
 *2017年6月1日下午2:28:04
 */
public interface LogService {
	public Map<String,Object> findAll(int page,int rows);
	public void addLog(Log log);

}
