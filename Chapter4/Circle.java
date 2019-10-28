public class Circle{
    double radius = 1.0;
    Circle(){}
    Circle(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return this.radius*this.radius*Math.PI;
    }
    public double getCircumference()
	{
		return this.radius*2*Math.PI;
	}
	public String toString()
	{
        System.out.printf("Circle[radius=%f]\n",this.radius);
        return "";
	}
    public static void main (String []args)
    {
        Circle c = new Circle(3);
        System.out.printf("radius=%f\n",c.getRadius());
        c.setRadius(5.0);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
        c.toString();
    }
}
