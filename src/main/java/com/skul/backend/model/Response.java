package com.skul.backend.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Response implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6215823338843239124L;

	private String msg;
	
	private BigDecimal value;
	
	private String code;
	
	private List<Object> lobj = new ArrayList<Object>();
	
	public Response(){
		this.msg = "";
		this.code= "200";
	}
	
	

	public List<Object> getLobj() {
		return lobj;
	}



	public void setLobj(List<Object> lobj) {
		this.lobj = lobj;
	}



	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}
