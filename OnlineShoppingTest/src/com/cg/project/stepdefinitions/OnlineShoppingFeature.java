package com.cg.project.stepdefinitions;



import static org.junit.Assert.assertEquals;

import java.util.List;


import org.junit.Assert;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.cg.project.beans.Product;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class OnlineShoppingFeature {
	
	private TestRestTemplate restTemplate;
	private ResponseEntity<String> responseEntity;
	private ResponseEntity<Product> responseEntityProduct;
	private ResponseEntity<List> responseList;

	
	@Before
	public void setUpTestEnv() {
		restTemplate=new TestRestTemplate();
	}
	
	@When("^User give call to'/sayHello' Service$")
	public void user_give_call_to_sayHello_Service() throws Throwable {
		responseEntity=restTemplate.getForEntity("http://localhost:1919/sayHello", String.class);
	   
	}

	@Then("^user should receive service status 'OK' And response message 'Hello World From RestFulwebService'$")
	public void user_should_receive_service_status_OK_And_response_message_Hello_World_From_RestFulwebService() throws Throwable {
	   
	Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	Assert.assertEquals("Hello World fromRestfulWebSerivce", responseEntity.getBody());
	}

	@When("^user submit valid product details$")
	public void user_submit_valid_product_details() throws Throwable {
	    Product product=getProduct();
	    
	    MultiValueMap<String, Object> map=new LinkedMultiValueMap<>();
	    map.add("id", product.getId());
	    map.add("name", product.getName());
	    map.add("description",product.getDescription());
	    map.add("price",Double.toString(product.getPrice()));
	    map.add("manufactureDate", product.getManufactureDate());
	    
	    HttpHeaders headers=new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
	    HttpEntity<MultiValueMap<String, Object>> httpEntity=new HttpEntity<>(map,headers);
	    
	    responseEntityProduct=restTemplate.postForEntity("http://localhost:1919/acceptProductDetails", httpEntity, Product.class);
	    
	}

	@Then("^product detalis successfully added$")
	public void product_detalis_successfully_added() throws Throwable {
		Product expected=getProduct();
		Product actual=responseEntityProduct.getBody();
		
		assertEquals(expected, actual);
	   
	}

	
	
	@When("^user enters product code$")
	public void user_enters_product_code() throws Throwable {
	 
	  responseEntityProduct=restTemplate.getForEntity("http://localhost:1919/viewProductDetails/?id=100",Product.class);
	  
		
	}

	@Then("^product details should be displayed$")
	public void product_details_should_be_displayed() throws Throwable {
		
		Product product=responseEntityProduct.getBody();
		String expected="100";
		String actual=product.getId();
		
		assertEquals(expected, actual);
	}
	
	@When("^user calls 'viewAll' Service$")
	public void user_calls_viewAll_Service() throws Throwable {
	   responseList=restTemplate.getForEntity("http://localhost:1919/viewAll", List.class);
	}

	@Then("^all products should be displayed$")
	public void all_products_should_be_displayed() throws Throwable {
	   
		Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}


private Product getProduct()
	{
		return new Product("100","Samsung","good",15000,"08-08-2018");
	}



}
