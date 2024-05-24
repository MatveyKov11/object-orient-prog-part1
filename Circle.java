public class Circle {
    double radius;
    String color;
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
    public double perimeter(){
        return 2*Math.PI*this.radius;
    }
    public String toString(){
        return "Радиус круга: " + radius + ", его цвет: " + color + ", площадь: "
                + this.area() + ", периметр: " + this.perimeter();
    }
}