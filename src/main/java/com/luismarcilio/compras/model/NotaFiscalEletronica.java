package com.luismarcilio.compras.model;

import com.luismarcilio.compras.data.*;

import lombok.Data;

@Data
public class NotaFiscalEletronica {
	private Company company;
	private Address address;
	private FiscalNote fiscalNote;
	private User user;
	private Purchase purchase;

}
