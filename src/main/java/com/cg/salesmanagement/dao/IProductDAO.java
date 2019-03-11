package com.cg.salesmanagement.dao;

import com.cg.salesmanagement.bean.Product;

public interface IProductDAO {
	Product getProductDetails(int ProductCode);
	boolean insertSalesDetails(Product product);
	
	
}
