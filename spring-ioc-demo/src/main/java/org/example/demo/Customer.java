package org.example.demo;

public class Customer {

	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	public Customer() {
		super();
	}
	
	public void init()
	{
		System.out.println("customer object is initializing");
	}
	public Customer(int customerId, String firstName, String lastName, String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	
	
	public void destroy()
	{
		System.out.println("under destroy");
	}
}
