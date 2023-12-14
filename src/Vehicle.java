public class Vehicle {
    String brand;
    int year;
    public Vehicle (String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public void displayInfo(){
        System.out.println(String.format("Марка: %s, год выпуска: %d", brand, year));
    }
}
