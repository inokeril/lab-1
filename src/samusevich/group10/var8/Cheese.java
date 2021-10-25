package samusevich.group10.var8;

public class Cheese extends Food {

    public Cheese() {
        super("Cheese");
    }

    @Override
    public void consume() {
        System.out.println(this+"was eaten");

    }

}
