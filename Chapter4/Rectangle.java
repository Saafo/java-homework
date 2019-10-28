public class Rectangle
{
    float length = 1.0f;
    float width = 1.0f;
    Rectangle(){}
    Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    public float getLength(){
        return this.length;
    }
    public void setLength(float length){
        this.length = length;
    }
    public float getWidth(){
        return this.width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return (this.length + this.width)*2;
    }
    public String toString(){
        System.out.printf("Rectangle[length = %f,width = %f]\n",this.length,this.width);
        return "";
    }
    public static void main(String []args){
        Rectangle r = new Rectangle(3,2);
        System.out.printf("Length: %f\n", r.getLength());
        System.out.printf("Width: %f\n", r.getWidth());
        r.setLength(5);
        r.setWidth(4);
        System.out.printf("Area :%f\n", r.getArea());
        System.out.printf("Perimeter :%f\n", r.getPerimeter());
        r.toString();
    }
}