package models;


import java.time.LocalDate;

public class Order {

	private Long id;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private String status;
	private Customer customer;
	

}
