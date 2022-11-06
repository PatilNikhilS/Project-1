package user;

//links package product details
import product_Details.Product;

public class Seller extends user {
	private Product[] productListed;

	@Override
	public Boolean verifyUser() {
		return true;
	}

	public Product[] getProductListed() {
		return productListed;
	}

	public void setProductListed(Product[] productListed) {
		this.productListed = productListed;
	}
}
