package samusevich.group10.var8 ;


import java.util.Objects;

public class ChewingGum extends Food{

    private String flavour;


    public ChewingGum(String flavour) {
        super("Gum");
        this.flavour = flavour;

    }
    public void consume() {
        System.out.println(this + "was eaten");
    }

    public String getFlavour() {
        return flavour;
    }
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return super.toString() + " With taste '" + flavour.toUpperCase() + "'";
    }
}


