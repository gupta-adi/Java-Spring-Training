package com.training.prodsvc;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{

	List<Product> prodList = new ArrayList<>();
	
	@Override
	public String getProdInfo() {
		return "Retriving Product Info";
	}

	@Override
	public void addProduct(Product prod) {
		prodList.add(prod);
		
	}

}
