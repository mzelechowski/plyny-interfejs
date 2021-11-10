package pl.mzelechowski;

public class Acid implements Liquid {
    @Override
    public String smell() {
        return "Oh, my butterfly leg. It's stinkkly";
    }

    @Override
    public String taste() {

        return "You hurt yourself";
    }

    @Override
    public String color() {

        return "Its green. Nice color";
    }

}
