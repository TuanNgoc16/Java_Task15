 abstract public class Shape {
    String color;
    public Shape(String color){
        this.color=color;
    }

     @Override
     public String toString() {
         return " ,color='" + color + '\''

                 ;
     }
      abstract public double getArea();
}
