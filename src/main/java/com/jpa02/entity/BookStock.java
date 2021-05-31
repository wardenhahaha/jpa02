package com.jpa02.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "book_stock")
//@EntityListeners(AuditingEntityListener.class)
public class BookStock{

	@Override
	public String toString() {
		return "BookStock [isbn=" + isbn + ", stock=" + stock + "]";
	}

	@Id
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="stock")
	private String stock;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}
	
	
}
