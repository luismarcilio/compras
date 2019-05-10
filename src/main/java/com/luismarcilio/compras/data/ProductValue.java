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
public class ProductValue {

	@Column(name="ID")
	@Id
	Integer id;

	@ManyToOne(optional=false) 
    @JoinColumn(name="COMPANY_ID", nullable=false, updatable=false)
	Company company;

	@ManyToOne(optional=false) 
    @JoinColumn(name="PRODUCT_ID", nullable=false, updatable=false)
	Product product;

    @Column(name="DATE")
    Date date;

    @Column(name="VALUE")
    Double value;
}
