public class Car {
	private String color;
	private int horsePower;
	private int engineSize;
	private String make;
	private static int count;
	
	public Car(){
		this.color = "";
		this.horsePower = 0;
		this.engineSize = 0;
		this.make = "";
		this.count++;
	}
	public Car(String color){
		this.color = color;
		this.horsePower = 0;
		this.engineSize = 0;
		this.make = "";
		this.count++;
	}
	public Car(String color, int horsePower){
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = 0;
		this.make = "";
		this.count++;
	}
	public Car(String color, int horsePower, int engineSize){
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = "";
		this.count++;
	}
	public Car(String color, int horsePower, int engineSize, String make){
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = make;
		this.count++;
	}
	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public int getHorsePower(){
		return this.horsePower;
	}
	public void setHorsePower(int horsePower){
		this.horsePower = horsePower;
	}
	public int getEngineSize(){
		return this.engineSize;
	}
	public void setEngineSize(int engineSize){
		this.engineSize = engineSize;
	}
	public String getMake(){
		return this.make;
	}
	public void setMake(String make){
		this.make = make;
	}
	public static int getCount() {
		return count;
	}
	public boolean makeEquals(Car otherObject){
		return this.make == otherObject.make;
	}
	public boolean colorEquals(Car otherObject){
		return this.color == otherObject.color;
	}
	public boolean horsePowerEquals(Car otherObject){
		return this.horsePower == otherObject.horsePower;
	}
	public boolean engineSizeEquals(Car otherObject){
		return this.engineSize == otherObject.engineSize;
	}
	public String toString(){
		return "Car color is " + this.color + ", the horse power is " + this.horsePower +
				", the engine size is " + this.engineSize + ", and the make is " + this.make + ".";
	}
}
