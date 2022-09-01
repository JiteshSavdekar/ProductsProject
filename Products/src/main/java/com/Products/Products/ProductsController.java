package com.Products.Products;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductsController {

	@Autowired
	ProductsServies li;
	
	@GetMapping(path="/Getproductslist")
	public List<ProductsPoJoFile> getData() {
		List<ProductsPoJoFile>products =new ArrayList<ProductsPoJoFile>();
		products=li.getData();
		return products;
	}
	
	@PostMapping("/PostProducts")
	public ProductsPoJoFile saveproducat(@RequestBody ProductsPoJoFile products)
	{
		return li.saveProductsPoJoFileDataToDB(products);
	}
	
	@GetMapping("/GetOneIdProducts/{id}")
	public ProductsPoJoFile  GetById(@PathVariable int id) {
		return li.fetchProductsDataById(id).get();
	}
	
	@DeleteMapping("/DeleteProducts/{id}")
	public String DeleteById(@PathVariable int id) {
		return li.deleteProductsDataById(id);
	}
}
