package product_Details;

public class Category {
	private String CategoryName;
	private Category[] subCategories;

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public Category[] getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(Category[] subCategories) {
		this.subCategories = subCategories;
	}

}
