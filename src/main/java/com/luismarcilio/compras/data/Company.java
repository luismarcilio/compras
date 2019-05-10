package com.luismarcilio.compras.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Company {
	@Column(name="ID")
	@Id
	Integer id;	
	@Column(name="NAME")
	String name;
	@Column(name="TAX_IDENTIFICATION")
	String taxIdentification;
    @ManyToOne(optional=false) 
    @JoinColumn(name="ADDRESS_ID", nullable=false, updatable=false)
    Address address;
	

}
