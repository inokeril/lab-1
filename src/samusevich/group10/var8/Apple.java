package samusevich.group10.var8;

import java.util.Objects;

public class Apple extends Food {
    private String size;

    public Apple(String size) {
        super("Apple");
        this.size = size;
    }


    public void consume() {
        System.out.println(this + "was eaten");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return super.toString() + " Size '" + size.toUpperCase() + "'";
    }
}
