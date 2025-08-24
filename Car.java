package car;

public class Car 
{
	private String brand;
	private String model;
	private double price;
	private double mileage;
	private String ownerName;
	
	
	private static int totalCars=0;
	private static String showroomName ="Civic Cities";
	
	
	public Car(String b,String m,double p,double mil) 
	{	
      brand = b;
      model = m;
      price = p;
      mileage = mil;
      ownerName = "Not Assigned";
      totalCars++;
	}
      
  	public Car(String b,String m,double p,double mil) 
  	{	
        brand = b;
        model = m;
        price = p;
        mileage = mil;
        this.ownerName = owner;
        totalCars++;
        
      
}
	
public String getOwnerName()
{
	 return ownerName;
	 
}

public void setOwnerName(String owner) {
      this.ownerName = owner;
}

public void displayDetails() {
	System.out.println("Brand: "+brand);
    System.out.println("Model: "+model);
	System.out.println("Price: "+price);
	System.out.println("Mileage: "+mileage);
	System.out.println("Owner: "+ownerName);
}



public void updatePrice(double newPrice)
{
	this.price=newPrice;
}
public static void showTotalCars() {
	System.out.println("Total Cars: " +totalCars);
}
public static void showShowroomName()
{
	System.out.println("Showroom:" +showroomName);
}

}