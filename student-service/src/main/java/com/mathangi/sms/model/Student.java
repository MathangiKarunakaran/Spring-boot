package com.mathangi.sms.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private Integer id;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)// to save
	private Address address;
	
	
	//@OneToMany(mappedBy = "student")
	//@JoinColumn(name="id") //physical mapping
	
	//@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "fk_telephone")
	@OneToMany(mappedBy="student", cascade=CascadeType.ALL)
	List<Telephone> telephones;
	
	
	public List<Telephone> getTelephones() {
		return telephones;
	}
	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
