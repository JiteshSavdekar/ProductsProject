package com.Products.Products;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class ProductsPoJoFile {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	int id;
	String FullName;
	String ProductName;
	double Price;
	public ProductsPoJoFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductsPoJoFile(int id, String fullName, String productName, double price) {
		super();
		this.id = id;
		FullName = fullName;
		ProductName = productName;
		Price = price;
	}
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="FullName")
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	@Column(name="ProductName")
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	@Column(name="Price")
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "ProductsPoJoFile [id=" + id + ", FullName=" + FullName + ", ProductName=" + ProductName + ", Price="
				+ Price + "]";
	}

}
