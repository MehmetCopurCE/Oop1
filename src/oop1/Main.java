package oop1;

public class Main {

	public static void main(String[] args) {
		

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinasi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitInStock(3);
		product1.setImageUrl("bilmemne1.jpg");
		
		
		//System.out.println(product1.discount);
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinasi");
		product2.setUnitPrice(7500);
		product2.setDiscount(7);
		product2.setUnitInStock(3);
		product2.setImageUrl("bilmemne2.jpg");
		
		Product product3 = new Product();
		product3.setName("Smeg Kahve Makinasi");
		product3.setUnitPrice(7500);
		product3.setDiscount(7);
		product3.setUnitInStock(3);
		product3.setImageUrl("bilmemne3.jpg");
		
		Product[] products = {product1, product2, product3};	
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setPhone("05222222222");
		individualCustomer.setFirstName("Mehmet");
		individualCustomer.setLastName("Çopur");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("11111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
				 
	}

}
