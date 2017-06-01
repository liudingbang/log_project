/**
 * 
 */
package com.jit.z.log.po;

import java.util.Date;

/**
 * @author liudingbang
 *
 *2017年6月1日下午2:20:51
 */
public class Log {
	private int userOL_id;// 序号
	private String userOL_context;// 操作名称
	private Date userOL_date;// 操作时间
	private String userOL_result;// 操作结果
	private String userOL_user;// 操作人
	/**
	 * @return the userOL_id
	 */
	public int getUserOL_id() {
		return userOL_id;
	}
	/**
	 * @param userOL_id the userOL_id to set
	 */
	public void setUserOL_id(int userOL_id) {
		this.userOL_id = userOL_id;
	}
	/**
	 * @return the userOL_context
	 */
	public String getUserOL_context() {
		return userOL_context;
	}
	/**
	 * @param userOL_context the userOL_context to set
	 */
	public void setUserOL_context(String userOL_context) {
		this.userOL_context = userOL_context;
	}
	/**
	 * @return the userOL_date
	 */
	public Date getUserOL_date() {
		return userOL_date;
	}
	/**
	 * @param l the userOL_date to set
	 */
	public void setUserOL_date(Date l) {
		this.userOL_date = l;
	}
	/**
	 * @return the userOL_result
	 */
	public String getUserOL_result() {
		return userOL_result;
	}
	/**
	 * @param userOL_result the userOL_result to set
	 */
	public void setUserOL_result(String userOL_result) {
		this.userOL_result = userOL_result;
	}
	/**
	 * @return the userOL_user
	 */
	public String getUserOL_user() {
		return userOL_user;
	}
	/**
	 * @param userOL_user the userOL_user to set
	 */
	public void setUserOL_user(String userOL_user) {
		this.userOL_user = userOL_user;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Log [userOL_id=" + userOL_id + ", userOL_context=" + userOL_context + ", userOL_date=" + userOL_date
				+ ", userOL_result=" + userOL_result + ", userOL_user=" + userOL_user + "]";
	}
	

}
