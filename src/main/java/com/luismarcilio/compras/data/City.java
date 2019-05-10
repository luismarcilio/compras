package com.luismarcilio.compras.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class City {
	@Column(name="ID")
	@Id
	Integer id;
	
	@Column(name="NAME")
	String name;

}
