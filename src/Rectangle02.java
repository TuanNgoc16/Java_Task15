public class Rectangle02 implements Shape02 {
    private  int length,width;
    public Rectangle02(int length, int width){
        this.length=length;
        this.width=width;
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
        @Override
        public double getArea(){
            return length*width;
        }
}
