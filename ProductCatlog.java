package OnlineShopping;

public class Product {
	
	private String product;
	private int quantity;
	private double price;
 
	
	public Product()
	{
		product = "";
		quantity = 0;
		price = 0.0;
	}
	public String getProduct()
	{
	return product;
	}
	public double getPrice()
	{
	return price;
	}
	public int getQuantity()
	{
	return quantity;
	}
 
	public Product(String inProduct, int inQuant, double inPrice)
	{
		product = new String(inProduct);
		quantity = inQuant;
		price = inPrice;
	}
	
	public boolean equals(Product item)
	{
		
		boolean result = false;
		if (this.product.equalsIgnoreCase(item.getProduct()) && this.price == item.getPrice())
			result = true;
		else
			result = false;
 
		return result;
	}
 
	public String toString()
	{
				String result="";
 
		return result;
	}
}

}
