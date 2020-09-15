package Circle;

public abstract class Shape1 {
    protected String color;
    protected boolean filled;
    public Shape1(String color,boolean filled) {
        this.color = color;
        this.filled = false;
    }
    public Shape1(){}
    public String getColor(){return color;}
    public void setColor(String color){this.color=color;}
    public boolean isFilled(){return filled;}
    public void setFilled(boolean filled){this.filled=filled;}
    @Override
    public String toString(){return "Color="+color;}
    public double getArea(){return 0;}
    public double getPerimetr(){return 0;}

    public abstract double getPerimeter();
}

