package org.learn.rest.cxf;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class JAXRSClient {

	public static void main(String[] args) {
		String baseAddress = "http://localhost:8080/ws/rest";

		List<Object> providerList = new ArrayList<Object>();
		providerList.add(new JacksonJsonProvider());

		ProductService productService = JAXRSClientFactory.create(baseAddress, ProductService.class, providerList);
		List<Product> productList = productService.retrieveAllProducts();
		for (Product product : productList) {
			System.out.println(product);
		}
	}

}
