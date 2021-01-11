public class Vehicle {
    private int numberOfWheels;
    private String color;

    // constructor ex. new Vehicle()
    public Vehicle () {
    }

    // constructor ex. new Vehicle("someColor")
    public Vehicle (String color) {
        this.color = color;
    }

    // constructor ex. new Vehicle("someColor", 4)
    public Vehicle (String color, int num) {
        this.color = color;
        this.numberOfWheels = num;
    }
    

    // getter
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // setter
    public void setNumberOfWheels(int num) {
        numberOfWheels = num;
    }

    // getter
    public String getColor() {
        return color;
    }

    // setter
    public void setColor(String color) {
        this.color = color;
    }
}