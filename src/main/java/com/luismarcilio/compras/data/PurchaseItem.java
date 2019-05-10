package com.luismarcilio.compras.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class PurchaseItem {
	@Column(name="ID")
	@Id
	Integer id;
	
    @ManyToOne(optional=false) 
    @JoinColumn(name="PURCHASE_ID", nullable=false, updatable=false)
	Purchase purchase;

    @ManyToOne(optional=false) 
    @JoinColumn(name="PRODUCT_ID", nullable=false, updatable=false)
	Product product;

    @ManyToOne(optional=false) 
    @JoinColumn(name="UNITY_ID", nullable=false, updatable=false)
	Unity unity;
    
    @Column(name="UNITY_VALUE")
    Double unityValue;
    
    @Column(name="UNITS")
    Double units;
    
    @Column(name="TOTAL_VALUE")
    Double totalValue;
       	
}
