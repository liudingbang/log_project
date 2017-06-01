/**
 * 
 */
package com.jit.z.log.controller;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jit.z.log.po.Log;
import com.jit.z.log.service.LogService;

/**
 * @author liudingbang
 *
 *2017年6月1日下午2:35:15
 */
@Controller
@RequestMapping("/logController")
public class LogController {
	@Autowired
	LogService logService;
	@RequestMapping("/findAll")
	public @ResponseBody Map<String,Object> findAll(HttpServletRequest request){
		if(request.getParameter("page") == null)
			return null;
		int page = Integer.parseInt(request.getParameter("page"));
		int rows = Integer.parseInt(request.getParameter("rows"));
		
		return logService.findAll(page, rows);
		
	}
	@RequestMapping("/addLog")
	public @ResponseBody Log addLog(HttpServletRequest request){
		Log log =new Log();
		Date date=new Date();
		
		log.setUserOL_context(request.getParameter("userOL_context"));
		log.setUserOL_result(request.getParameter("userOL_result"));
		log.setUserOL_date(date);
		log.setUserOL_user(request.getParameter("userOL_user"));
		try{
			logService.addLog(log);
			return log;
		}catch (Exception e) {
			return null;
		}
	}

}
