package orders;

import user.buyer;
import user.user;

public class Orders {
	private String orderId;
	private buyer user;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public buyer getUser() {
		return user;
	}

	public void setUser(buyer user) {
		this.user = user;
	}


}
