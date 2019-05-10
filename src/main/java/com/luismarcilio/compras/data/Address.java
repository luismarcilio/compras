package com.luismarcilio.compras.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Address {
	@Column(name="ID")
	@Id
	Integer id;
	
	@Column(name="NAME")
	String name;
	
    @ManyToOne(optional=false) 
    @JoinColumn(name="CITY_ID", nullable=false, updatable=false)
    City city;

    @ManyToOne(optional=false) 
    @JoinColumn(name="STATE_ID", nullable=false, updatable=false)
    State state;

    @ManyToOne(optional=false) 
    @JoinColumn(name="COUNTRY_ID", nullable=false, updatable=false)
    Country country;
    
	@Column(name="STREET")
	String street;
	
	@Column(name="NUMBER")
	String number;
	
	@Column(name="COMPLEMENT")
	String complement;
	
	@Column(name="COUNTY")
	String county;
	
	@Column(name="PO_CODE")
	String poCode;
	
}
