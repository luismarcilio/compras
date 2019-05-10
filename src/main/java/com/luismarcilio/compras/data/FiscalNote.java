package com.luismarcilio.compras.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class FiscalNote {
	@Column(name="ID")
	@Id
	Integer id;
	
	@Column(name="NUMBER")
	String number;
	
	@Column(name="SERIES")
	String series;
	
    @ManyToOne(optional=false) 
    @JoinColumn(name="COMPANY_ID", nullable=false, updatable=false)
	Company company;

    @Column(name="DATE")
    Date date;

}
