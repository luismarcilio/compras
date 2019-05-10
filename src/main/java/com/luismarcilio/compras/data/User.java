package com.luismarcilio.compras.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity

public class User {
	@Column(name="ID")
	@Id
	Integer id;
	
	@Column(name="EMAIL")
	String email;
	
	@Column(name="NAME")
	String name;

	@Column(name="TAX_ID")
	String taxId;

	@Column(name="PASSWORD")
	String password;
    
}
