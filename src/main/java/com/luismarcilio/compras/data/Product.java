package com.luismarcilio.compras.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Product {
	@Column(name="ID")
	@Id
	Integer id;
	
    @Column(name="NAME")
    String name;


	@ManyToOne(optional=false) 
    @JoinColumn(name="UNITY_ID", nullable=false, updatable=false)
	Unity unity;

}
