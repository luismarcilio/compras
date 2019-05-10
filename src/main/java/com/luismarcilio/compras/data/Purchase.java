package com.luismarcilio.compras.data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Purchase {
	@Column(name="ID")
	@Id
	Integer id;

	@ManyToOne(optional=false) 
	@JoinColumn(name="COMPANY_ID", nullable=false, updatable=false)
	Company company;

	@ManyToOne(optional=false) 
	@JoinColumn(name="USER_ID", nullable=false, updatable=false)
	User user;

	@ManyToOne(optional=false) 
	@JoinColumn(name="FISCAL_NOTE_ID", nullable=false, updatable=false)
	FiscalNote fiscalNote;

	@Column(name="TOTAL_AMOUNT")
	Double totalAmount;	
	
	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	private List<PurchaseItem> purchaseItemList;
}
