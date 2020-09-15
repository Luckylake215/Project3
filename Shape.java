public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(String color,boolean filled) {
        this.color = color;
        this.filled = false;
    }
    public Shape(){}
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
