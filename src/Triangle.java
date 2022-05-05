public class Triangle extends Shape {
    private int base;
    public  int height;
    public  Triangle ( String color ,int base, int height){
        super(color);
        this.base=base;
        this.height=height;
    }
    @Override
    public double getArea(){
        return base*height;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
