package OOPS;

public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();  

        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    int getTip() {
        return this.tip;
    }

    void setTip (int Tip) {
        this.tip = Tip;
    }
}

