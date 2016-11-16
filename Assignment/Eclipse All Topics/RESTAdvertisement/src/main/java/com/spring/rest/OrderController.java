package com.spring.rest;

import javax.websocket.server.PathParam;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.Order;

@RestController
@RequestMapping("/xoriant")
public class OrderController {

@RequestMapping(value="/order", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
public Order createNewOrder(@RequestBody Order order) {
	System.out.println("New order created!!"+order);
	order.setId(333);
	return order;
}
	
@RequestMapping(headers={"auth_token"}, value="/order/{orderId}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)	
public Order getOrder(@PathVariable(value="orderId") int orderId, String auth_token) {
	
	Order order = new Order("Chair purchase", 30000);
	order.setId(orderId);
	System.out.println(auth_token);
	return order;
}
	
@RequestMapping(value="/hello", method=RequestMethod.GET)
public String sayHello(@RequestParam(value="name", defaultValue="Anand") String name) {
	return "Hello " + name;
}


}
