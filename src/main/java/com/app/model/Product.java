package com.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

	@Id
	private String Id;  // MongoDb Internally Uses the "UUID" to create the "hexadecimal" primary key.
	                    //So datatype must be "String"

	private Integer prodId;
	private String prodName;
	private double prodcost;
	
	public Product() {
		super();
	}

	/**Constructor not having id**/
	public Product(Integer prodId, String prodName, double prodcost) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodcost = prodcost;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getProdcost() {
		return prodcost;
	}

	public void setProdcost(double prodcost) {
		this.prodcost = prodcost;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", prodId=" + prodId + ", prodName=" + prodName + ", prodcost=" + prodcost + "]";
	}

}
