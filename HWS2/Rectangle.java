package HWS2;

public class Rectangle {
    private double width;
    private double height;


    public Rectangle(){
        width = height = 1;
    }
    
    // public Rectangle(double rt){
    //     width = height = rt;
    // }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    void setWidth(double width){
        this.width = width;
    }

    void setHeight(double height){
        this.height = height;
    }

    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }

    void show_rectangle(){
        System.out.println("Ширина = " + width);
        System.out.println("Высота = " + height);
    }
    void calculateArea(){
        System.out.println("Площадь = " + width * height);
    }
    void calculatePerimete(){
        System.out.println(("Периметр = " + (2 * (width + height))));
    }
}


