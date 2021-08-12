package factorymethod;

public interface Factory {
	default Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
	Product createProduct(String owner);
	void registerProduct(Product p);
}
