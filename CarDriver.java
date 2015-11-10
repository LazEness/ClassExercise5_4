
import java.util.Scanner;

import javax.swing.JOptionPane;
public class CarDriver {
	

	public static void main(String[] args) {
	Car car1 = new Car();
	Car car2 = new Car("red", 500);
	Car car3 = new Car();
	Car car4 = new Car();
	Scanner keyboard = new Scanner(System.in);
	String color1 = JOptionPane.showInputDialog(null, "Please Enter the color of car one.");
	car1.setColor(color1);
	int horsePower = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the horse power of car one."));
	car1.setHorsePower(horsePower);
	int engineSize1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the engine size of car one."));
	car1.setEngineSize(engineSize1);
	String make1 = JOptionPane.showInputDialog(null, "Please enter the make of car one.");
	car1.setMake(make1);
	JOptionPane.showMessageDialog(null, "Here are the details of your first car: " + car1.toString());
	JOptionPane.showMessageDialog(null, "The second care is " + car2.getColor() + " and the horse power is " + car2.getHorsePower()
			+ ". Please enter the engine size of the second car.");
	int engineSize2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the engine size of the second car."));
	car2.setEngineSize(engineSize2);
	String make2 = JOptionPane.showInputDialog(null, "Please enter the make of the second car.");
	car2.setMake(make2);
	JOptionPane.showMessageDialog(null, "Here are the details of your second car: " + car2.toString());
	String color3 = JOptionPane.showInputDialog(null, "Please Enter the color of car three.");
	car3.setColor(color3);
	int horsePower3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the horse power of car three."));
	car3.setHorsePower(horsePower3);
	int engineSize3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the engine size of car three."));
	car3.setEngineSize(engineSize3);
	String make3 = JOptionPane.showInputDialog(null, "Please enter the make of car three.");
	car3.setMake(make3);
	JOptionPane.showMessageDialog(null, "Here are the details of your third car: " + car3.toString());
	car4.setColor(color3);
	car4.setMake(make3);
	car4.setHorsePower(horsePower3);
	car4.setEngineSize(engineSize3);
	JOptionPane.showMessageDialog(null, "I created a new car, let's check if they have the same features.");
	JOptionPane.showMessageDialog(null, "The color of car four is the same as car three: " + car3.colorEquals(car4));
	JOptionPane.showMessageDialog(null, "The make of car four is the same as car three: " + car3.makeEquals(car4));
	JOptionPane.showMessageDialog(null, "The horse power of car four is the same as car three: " + car3.horsePowerEquals(car4));
	JOptionPane.showMessageDialog(null, "The engine size of car four is the same as car three: " + car3.engineSizeEquals(car4));
	JOptionPane.showMessageDialog(null, "We have made " + Car.getCount() + " cars.");
	}

}
