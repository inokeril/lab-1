package samusevich.group10.var8;

import java.util.ArrayList;

public class MainApplication {

    // Конструктор класса отсутствует!!!
    // Главный метод главного класса

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {

        // Определение ссылок на продукты завтрака

        Food[] breakfast = new Food[20];

        int appleAm=0,cheeseAm=0,chewingGumAm=0;


        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;

        Apple apple=new Apple(null);
        ChewingGum chewingGum=new ChewingGum(null);
        Cheese cheese=new Cheese();

        breakfast[0]=new Apple("Big");
        breakfast[1]=new Cheese();
        breakfast[2]=new ChewingGum("Mint");


        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            if (parts[0].equals("Mint")) {
                breakfast[itemsSoFar] = new ChewingGum(parts[1]);
            }

            itemsSoFar++;
        }




        System.out.println("amount of products");

       for (int i = 0; i < 20; i++) {
            if (breakfast[i] != null) {
                if (breakfast[i].equals(apple)) {
                    appleAm++;
                } else if (breakfast[i].equals(cheese)) {
                    cheeseAm++;
                } else if (breakfast[i].equals(chewingGum)) {
                    chewingGumAm++;
                }
            } else break;
        }
        System.out.println("Amount of apples is " + appleAm + ", Amount of cheese is " + cheeseAm + ", Amount of gum is " + chewingGumAm + "");

// Перебор всех элементов массива
        for (Food item: breakfast)
            if (item!=null)
// Если элемент не null – употребить продукт
                item.consume();
            else
// Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не
// использованы все

                break;
        System.out.println("Всего хорошего!");
    }
}



