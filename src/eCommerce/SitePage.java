package eCommerce;

import java.util.Scanner;

import user.*;
import orders.*;
import product_Details.*;

public class SitePage {

	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Welcome to ShopBazar ");
		System.out.println("Which user are you 1. Buyer  2. Seller  3. Admin");
		// user input
		Scanner input = new Scanner(System.in);
		int inputUser = input.nextInt();
		String typeOfUser;

		if (inputUser == 1) {
			typeOfUser = "Buyer";
			buyer current = new buyer();
			System.out.println("What is your user id -");
			input.nextLine();
			current.setUserID(input.nextLine());
			System.out.println("What is your password - ");
			input.nextLine();
			current.setPassword(input.nextLine());
			if (current.verifyUser() == true) {
				System.out.println("User Verified");
				while (true) {
					System.out.println("Do you want to 1. View Products 2. View Cart 3.Contacts Us 4.Exit  ");
					inputUser = input.nextInt();

					if (inputUser == 1) {
						System.out.println("What category you like to chose 1.Clothes 2.Electronics 3.Furniture");
						inputUser = input.nextInt();
						if (inputUser == 1) {
							System.out.println(" Clothes");
							Catalogue Clothes = new Catalogue();
							Product[] allClothes = Clothes.getTypeofClothes();
							for (int i = 0; i < allClothes.length; i++) {
								System.out.println(allClothes[i].getProductId() + " " + allClothes[i].getProductName()
										+ " " + allClothes[i].getProductCost());
							}
							System.out.println("Do You Want To Add Any Product To The Cart Y/N");
							input.nextLine();
							String addToCart = input.nextLine();
							Product[] cartProduct = new Product[1];
							if (addToCart.equals("Y")) {
								System.out.println("Input the product Id which you want to Add to Cart");
								String productId = input.nextLine();
								for (int i = 0; i < allClothes.length; i++) {
									if (allClothes[i].getProductId().equals(productId)) {
										cartProduct[0] = allClothes[i];
									}
								}
								Cart cart = new Cart();
								cart.setCartId("1");
								cart.setListOfProduct(cartProduct);
								current.setCart(cart);
								System.out.println("Product is Successfully Add to the cart.");
							}
						} else if (inputUser == 2) {
							System.out.println("Electronics");
							Catalogue Electronics = new Catalogue();
							Product[] allElectronics = Electronics.getTypeofElectronics();
							for (int i = 0; i < allElectronics.length; i++) {
								System.out.println(
										allElectronics[i].getProductId() + " " + allElectronics[i].getProductName()
												+ " " + allElectronics[i].getProductCost());
							}
							System.out.println("Do You Want To Add Any Product To The Cart Y/N");
							input.nextLine();
							String addToCart = input.nextLine();
							Product[] cartProduct = new Product[1];
							if (addToCart.equals("Y")) {
								System.out.println("Input the product Id which you want to Add to Cart");
								String productId = input.nextLine();
								for (int i = 0; i < allElectronics.length; i++) {
									if (allElectronics[i].getProductId().equals(productId)) {
										cartProduct[0] = allElectronics[i];
									}
								}
								Cart cart = new Cart();
								cart.setCartId("1");
								cart.setListOfProduct(cartProduct);
								current.setCart(cart);
								System.out.println("Product is Successfully Add to the cart.");
							}
						} else if (inputUser == 3) {
							System.out.println("Furniture");
							Catalogue Furniture = new Catalogue();
							Product[] allFurniture = Furniture.getTypeofFurniture();
							for (int i = 0; i < allFurniture.length; i++) {
								System.out.println(allFurniture[i].getProductId() + " "
										+ allFurniture[i].getProductName() + " " + allFurniture[i].getProductCost());
							}
							System.out.println("Do You Want To Add Any Product To The Cart Y/N");
							input.nextLine();
							String addToCart = input.nextLine();
							Product[] cartProduct = new Product[1];
							if (addToCart.equals("Y")) {
								System.out.println("Input the product Id which you want to Add to Cart");
								String productId = input.nextLine();
								for (int i = 0; i < allFurniture.length; i++) {
									if (allFurniture[i].getProductId().equals(productId)) {
										cartProduct[0] = allFurniture[i];
									}
								}
								Cart cart = new Cart();
								cart.setCartId("1");
								cart.setListOfProduct(cartProduct);
								current.setCart(cart);
								System.out.println("Product is Successfully Add to the cart.");
							}
						}
					} else if (inputUser == 2) {
						Product[] cartProduct = current.getCart().getListOfProduct();
						System.out.println(current.getCart().getCartId());
						for (int i = 0; i < cartProduct.length; i++) {
							System.out.println(cartProduct[i].getProductId() + " " + cartProduct[i].getProductName()
									+ " " + cartProduct[i].getProductCost());
						}
						System.out.println("Do you want to check out Y/N");
						input.nextLine();
						String checkout = input.nextLine();
						if (checkout.equals("Y")) {
							if (current.getCart().checkOut())
								System.out.println("Your order is placed Successfully");
							System.out.println("Your order Id is MD4746 and will arrive in 5 days");
						}
					} else if (inputUser == 3) {
						System.out.println("To contact us, Please write a Email to Shopbazar@helpdesk.com");
					} else if (inputUser == 4)
						break;
					else {
						System.out.println("invalid Choice, please try again ");
					}
				}
			}
		} else if (inputUser == 2) {
			typeOfUser = "Seller";
			Seller current = new Seller();
			System.out.println("What is your user id -");
			input.nextLine();
			current.setUserID(input.nextLine());
			System.out.println("What is your password - ");
			input.nextLine();
			current.setPassword(input.nextLine());
			if (current.verifyUser() == true) {
				System.out.println("User Verified");

				while (true) {
					System.out.println("Do you want to 1. View Products 2.Contacts Us 3.Exit  ");
					inputUser = input.nextInt();
					if (inputUser == 1) {
						System.out.println("Your listed Product Type 1.Clothes 2.Electronics 3.Furniture ");
						inputUser = input.nextInt();
						if (inputUser == 1) {
							System.out.println(" Clothes");
							Catalogue Clothes = new Catalogue();
							Product[] allClothes = Clothes.getTypeofClothes();
							for (int i = 0; i < allClothes.length; i++) {
								System.out.println(allClothes[i].getProductId() + " " + allClothes[i].getProductName()
										+ " " + allClothes[i].getProductCost());
							}
						} else if (inputUser == 2) {
							System.out.println("Electronics");
							Catalogue Electronics = new Catalogue();
							Product[] allElectronics = Electronics.getTypeofElectronics();
							for (int i = 0; i < allElectronics.length; i++) {
								System.out.println(
										allElectronics[i].getProductId() + " " + allElectronics[i].getProductName()
												+ " " + allElectronics[i].getProductCost());
							}
						} else if (inputUser == 3) {
							System.out.println("Furniture");
							Catalogue Furniture = new Catalogue();
							Product[] allFurniture = Furniture.getTypeofFurniture();
							for (int i = 0; i < allFurniture.length; i++) {
								System.out.println(allFurniture[i].getProductId() + " "
										+ allFurniture[i].getProductName() + " " + allFurniture[i].getProductCost());
							}
						}
					} else if (inputUser == 2) {
						System.out.println("To contact us, Please write a Email to Shopbazar@helpdesk.com");
					} else if (inputUser == 3) {
						break;
					}
				}
			}
		} else if (inputUser == 3) {
			typeOfUser = "Admin";
			System.out.println("Do you want to 1.view all products ");
			inputUser = input.nextInt();

			if (inputUser == 1) {
				System.out.println("All Products");
				Catalogue ListofAllProducts = new Catalogue();
				Product[] allProduct = ListofAllProducts.getListofAllProduct();
				for (int i = 0; i < allProduct.length; i++) {
					System.out.println(allProduct[i].getProductId() + " " + allProduct[i].getProductName() + " "
							+ allProduct[i].getProductCost());
				}
			}

		}

		else {
			System.out.println("Invalid User Input:*****");
		}

	}
}
