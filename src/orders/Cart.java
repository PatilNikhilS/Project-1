package orders;

//connecting package product details to cart
import product_Details.Product;

public class Cart {
	private String CartId;
	public String getCartId() {
		return CartId;
	}

	public void setCartId(String cartId) {
		CartId = cartId;
	}

	private Product[] listOfProduct;

	public Product[] getListOfProduct() {
		return listOfProduct;
	}

	public void setListOfProduct(Product[] listOfProduct) {
		this.listOfProduct = listOfProduct;
	}
	public Boolean checkOut() {
		return true;
	}

}
