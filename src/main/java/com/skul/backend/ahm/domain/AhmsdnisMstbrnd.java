package com.skul.backend.ahm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * The persistent class for the AHMSDNIS_MSTBRND database table.
 * 
 */
@Entity
@Table(name="AHMSDNIS_MSTBRND")
@NamedQuery(name="AhmsdnisMstbrnd.findAll", query="SELECT a FROM AhmsdnisMstbrnd a")
public class AhmsdnisMstbrnd implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private String vbrndcd;

	private String vbrndnm;

	private String vbrndtyp;

	private String vurlbrnd;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date dbgneff;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date dlasteff;
	
	private String vcrea;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date dcrea;

	private String vmodi;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date dmodi;

	
	public AhmsdnisMstbrnd() {
	}

	public String getVbrndcd() {
		return this.vbrndcd;
	}

	public void setVbrndcd(String vbrndcd) {
		this.vbrndcd = vbrndcd;
	}

	public Date getDbgneff() {
		return this.dbgneff;
	}

	public void setDbgneff(Date dbgneff) {
		this.dbgneff = dbgneff;
	}

	public Date getDcrea() {
		return this.dcrea;
	}

	public void setDcrea(Date dcrea) {
		this.dcrea = dcrea;
	}

	public Date getDlasteff() {
		return this.dlasteff;
	}

	public void setDlasteff(Date dlasteff) {
		this.dlasteff = dlasteff;
	}

	public Date getDmodi() {
		return this.dmodi;
	}

	public void setDmodi(Date dmodi) {
		this.dmodi = dmodi;
	}

	public String getVbrndnm() {
		return this.vbrndnm;
	}

	public void setVbrndnm(String vbrndnm) {
		this.vbrndnm = vbrndnm;
	}

	public String getVbrndtyp() {
		return this.vbrndtyp;
	}

	public void setVbrndtyp(String vbrndtyp) {
		this.vbrndtyp = vbrndtyp;
	}

	public String getVcrea() {
		return this.vcrea;
	}

	public void setVcrea(String vcrea) {
		this.vcrea = vcrea;
	}

	public String getVmodi() {
		return this.vmodi;
	}

	public void setVmodi(String vmodi) {
		this.vmodi = vmodi;
	}

	public String getVurlbrnd() {
		return this.vurlbrnd;
	}

	public void setVurlbrnd(String vurlbrnd) {
		this.vurlbrnd = vurlbrnd;
	}

}