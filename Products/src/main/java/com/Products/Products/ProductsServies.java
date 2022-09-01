package com.Products.Products;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductsServies {

	@Autowired
	ProductsReposertry Jr;
	
	
public List<ProductsPoJoFile> getData() {
		
		return Jr.findAll();
	}

public ProductsPoJoFile saveProductsPoJoFileDataToDB(ProductsPoJoFile products)
{
	return Jr.save(products);
	
}

public Optional<ProductsPoJoFile> fetchProductsDataById(int id) 
{ 
	return Jr.findById(id);
	
}

public String deleteProductsDataById(int id) 
{ 
	String result;
	try {
		Jr.deleteById(id);
		result="Products Succesfilly Deleted";
	}
	catch (Exception e)
	{
		result="Products Not Deleted";
	}
	return result;
}

}
