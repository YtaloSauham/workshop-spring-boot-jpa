 package com.backend.apirestbackendspringboot.resources;

 import com.backend.apirestbackendspringboot.entities.Order;
 import com.backend.apirestbackendspringboot.services.OrderServices;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

 import java.util.List;
 @RestController
@RequestMapping(value ="/orders")


public class OrderResource {

	 @Autowired
	 private OrderServices service;
	@GetMapping	
	
	public ResponseEntity<List<Order>> findAllOrders(){
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	 public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return  ResponseEntity.ok().body(obj);
	}

}
