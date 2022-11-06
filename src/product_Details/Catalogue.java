package product_Details;

public class Catalogue {
	//For All 
	private Product[] listofAllProduct;

	public Product[] getListofAllProduct() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("T-Shirt");
		product1.setProductCost("3500");
		
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("Shirt");
		product2.setProductCost("4500");
		
		Product product3 = new Product();
		product3.setProductId("3");
		product3.setProductName("TV");
		product3.setProductCost("54151");
		
		Product product4 = new Product();
		product4.setProductId("4");
		product4.setProductName("Fridge");
		product4.setProductCost("17800");
		
		Product product5 = new Product();
		product5.setProductId("5");
		product5.setProductName("Chair");
		product5.setProductCost("7580");
		
		Product product6 = new Product();
		product6.setProductId("6");
		product6.setProductName("Table");
		product6.setProductCost("11500");
		
		listofAllProduct = new Product[6];
		
		listofAllProduct[0]=product1;
		listofAllProduct[1]=product2;
		listofAllProduct[2]=product3;
		listofAllProduct[3]=product4;
		listofAllProduct[4]=product5;
		listofAllProduct[5]=product6;
		return listofAllProduct;
	}

	public void setListofAllProduct(Product[] listofAllProduct) {
		this.listofAllProduct = listofAllProduct;
	}
	//For option 1
    private Product[] typeofClothes;

	public Product[] getTypeofClothes() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("T-Shirt");
		product1.setProductCost("3500");
		
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("Shirt");
		product2.setProductCost("4500");
		
		typeofClothes= new Product[2];
		
		typeofClothes[0]=product1;
		typeofClothes[1]=product2;
		return typeofClothes;
	}

	public void setTypeofClothes(Product[] typeofClothes) {
		this.typeofClothes = typeofClothes;
	}
	
	//For option 2
    private Product[] typeofElectronics;
    
  //For option 3
    private Product[] typeofFurniture;

	public Product[] getTypeofElectronics() {
		Product product3 = new Product();
		product3.setProductId("3");
		product3.setProductName("TV");
		product3.setProductCost("54151");
		
		Product product4 = new Product();
		product4.setProductId("4");
		product4.setProductName("Fridge");
		product4.setProductCost("17800");
		
		typeofElectronics= new Product[2];
		
		typeofElectronics[0]=product3;
		typeofElectronics[1]=product4;
		return typeofElectronics;
	}

	public void setTypeofElectronics(Product[] typeofElectronics) {
		this.typeofElectronics = typeofElectronics;
	}

	public Product[] getTypeofFurniture() {
		Product product5 = new Product();
		product5.setProductId("5");
		product5.setProductName("Chair");
		product5.setProductCost("7580");
		
		Product product6 = new Product();
		product6.setProductId("6");
		product6.setProductName("Table");
		product6.setProductCost("11500");
		
		typeofFurniture= new Product[2];
		
		typeofFurniture[0]=product5;
		typeofFurniture[1]=product6;
		return typeofFurniture;
	}

	public void setTypeofFurniture(Product[] typeofFurniture) {
		this.typeofFurniture = typeofFurniture;
	}
}
