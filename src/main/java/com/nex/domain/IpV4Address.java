package com.nex.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "[ipv4_addresses]", schema = "dbo")
public class IpV4Address {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;

	@Column(name = "address")
	private String address;

	@Column(name = "date_added")
	private Date date_added;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate_added() {
		return date_added;
	}

	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}

}
