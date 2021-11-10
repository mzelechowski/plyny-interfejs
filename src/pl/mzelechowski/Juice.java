package pl.mzelechowski;

public class Juice implements Liquid {
    @Override
    public String  smell() {
        return "Like fresh mornign";
    }

    @Override
    public String taste() {

        return "Like peaches";
    }

    @Override
    public String color() {

        return "Its orange";
    }

}
