package samusevich.group10.var8 ;


import java.util.Objects;

public class ChewingGum extends Food implements Nutritious{

    //Внутреннее поле привкус
    private  String flavour;

    // Вызвать конструктор предка, передав ему имя класса
    public ChewingGum(String flavour) {
        super("Gum");
        this.flavour = flavour;

    }

    // Переопределить способ употребления жевательной резинки
    public void consume() {
        System.out.println(this + " was eaten");
    }

    //Геттер и Сеттер для доступа к полю
    public String getFlavour() {
        return flavour;
    }
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }


    //Переопределенный метод toString возвращает вкус и калории продукта
    @Override
    public String toString() {
        return super.toString() + " with taste '" + flavour.toUpperCase() + "',"+"calories: "+calculateCalories()+" -";
    }

    //Переопределенный метод расчета калорий в зависимости значений параметров
    @Override
    public double calculateCalories() {
        double calories=0.0;
        if (flavour.equals("Mint")){
            calories=300.4;
        } else if (flavour.equals("watermelon")){
            calories=350.55;
        } else if (flavour.equals("cherry"))
            calories=360.3;
        return calories;
    }
}

