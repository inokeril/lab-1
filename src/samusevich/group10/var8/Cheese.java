package samusevich.group10.var8;

public class Cheese extends Food implements Nutritious{

    // Вызвать конструктор предка, передав ему имя класса
    public Cheese() {
        super("Cheese");
    }

    // Переопределить способ употребления сыра
    @Override
    public void consume() {
        System.out.println(this+" was eaten");

    }


    @Override
    public String toString() {
        return super.toString() +" calories: "+calculateCalories()+" -";
    }

    //Нет параметров конструктора
    @Override
    public double calculateCalories() {
        return 232.1;

    }
}