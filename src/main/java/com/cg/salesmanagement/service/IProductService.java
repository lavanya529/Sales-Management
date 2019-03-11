package com.cg.salesmanagement.service;

import com.cg.salesmanagement.bean.Product;

public interface IProductService {

	Product getProductDetails(int ProductCode);
	boolean insertSalesDetails(Product product);
}
