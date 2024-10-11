class Car{

//private properties of a car
private String color;
private double price;
private char size;

//car constructor
Car(String color,double price, char size){
    setColor(color);
    setPrice(price);
    setSize(Character.toUpperCase(size));
}

//get method for the color
public String getColor(){
    return color;
}

//get method for the price
public double getPrice(){
    return price;
}

//get method for the size
public char getSize(){
    return size;
}

//setting the color of the car
public void setColor(String color){
    this.color = color;
}

//setting the price of the car
public void setPrice(double price){
    if (price >= 0 ){
        this.price = price;
    } 
    else {
        System.out.print("Price cannot be negative");
    }
}

//setting the size of the car
public void setSize(char size){
    char upperSize = Character.toUpperCase(size);
    if (upperSize == 'S' || upperSize == 'M' || upperSize == 'L' ){
        this.size = size;
    } 
    else {
        System.out.print("Size input not acceptable.");
    }
}

//set to string method
public String toString(){
    String sizeDescriptor;
    switch (size){
        case 'S':
        sizeDescriptor = "small";
        break;

        case 'M':
        sizeDescriptor = "medium";
        break;

        case 'L':
        sizeDescriptor = "large";
        break;

        default:
        sizeDescriptor = "unknown"; 
        break;
    }
    return "Car (" + color + ") - P" + String.format("%.2f",price) + " - " + sizeDescriptor;
}
public static void main(String[] args) {
    Car redCar = new Car("red", 19999.85,'m');
    Car blueCar = new Car("blue",50000,'S');

    System.out.println(redCar);
    System.out.println(blueCar);
    
}
}
