public class TestShape {
    public static void main(String[] args){
        Circle circle=new Circle(5,"white");
        System.out.println(circle);
        Rectangle rectangle= new Rectangle(5, 4) {
            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        System.out.println(rectangle);
    }
}
