package com.Cucumber_normal.pom;

public class PagaObjectManager {
	
	private Login l;

	public Login getL() {
		l=new Login();
		return l;
	}
	
	private Products p;
	
	public Products getP() {
		p= new Products();
		return p;
	}
    
	private Cart_delete c;

    public Cart_delete getC() {
	c =new Cart_delete();
	return c;
    }
    
    private Payment pa;
    
    public Payment getPA() {
    	pa =new Payment();
    	return pa;
    }
    
    private Address a;
    
    public Address GetA() {
    	a=new Address();
    	return a;
    }
}
