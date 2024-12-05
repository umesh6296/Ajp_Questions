package Class_Question;

public class FindArea {
    //Find area of square
    public void area(int s){
        System.out.println("Area of square is "+s*s);
    }
    //Find area of  rectangle
    public void area(int l, int b){
        System.out.println("Area of rectangle is "+l*b);
    }
    //Find area of circle
    public void area(double r){

        System.out.println("Area of circle is "+(3.14*r*r));
    }
    //Find area of triangle
    public void area(double b,double h){
        System.out.println("Area of triangle is "+(0.5*b*h));
    }

    public static void main(String[] args) {

            FindArea obj=new FindArea();
            obj.area(9);
            obj.area(10,20);
            obj.area(10.05);
            obj.area(5,10.0);

    }

}
