package user;

import orders.Cart;

public class buyer extends user {
	private Cart cart;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Boolean verifyUser() {

		return true;
	}
	
}
