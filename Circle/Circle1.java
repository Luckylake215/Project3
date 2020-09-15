package Circle;

import java.math.*;
public class Circle1 extends Shape1 {
    private double r=0.0;
    private String color="red";
    public Circle1(double r,String color){
        this.r=r;
        this.color=color;

    }
    public Circle1(){}
    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r=r;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    @Override
    public String toString(){
        return "Shape: Circle,r="+this.r+" , color="+this.color;
    }
    @Override
    public double getArea(){
        return Math.PI*r*r;
    }
    @Override
    public double getPerimeter(){
        return Math.PI*r*2;
    }
}

