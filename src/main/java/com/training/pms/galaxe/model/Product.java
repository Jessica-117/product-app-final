package com.training.pms.galaxe.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Table(name="freshproducts")
@Component
@Data
public class Product {
	@Id
	private int productId;
	private String productName;
	private int quantity;
	private int price;
	
}
