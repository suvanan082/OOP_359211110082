package ooplab7;
//1.car brand
//2.car color
//3.car engine size
//4.max speed
//5.country of origin

public class SuperCar {
    private String brand ;
    private String color;
    private String size;
    private String max;
    private String origin;

    public SuperCar(){}
    //Constructor by own
    public SuperCar(String brand,String c,String s,String m,String o){
        //assign data to properties
        this.brand=brand;
        this.color=c;
        this.size=s;
        this.max=m;
        this.origin=o;

    }//student



    @Override
    public String toString() {
        return "SuperCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", max='" + max + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

}//class

