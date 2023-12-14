public class Car extends Vehicle{
    private String model;
    public Car(String brand, int year, String model){
        super(brand, year);
        this.model = model;
    }
    @Override
    public String toString() {
        return String.format("%s %s (%d)", this.brand, this.model, this.year);
    }
    public void displayInfo(){
        System.out.println(String.format("Марка: %s, модель: %s, год выпуска: %d", brand, model, year));
    }
}
