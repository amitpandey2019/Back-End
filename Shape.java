public class Shape {
    protected void display(){
        System.out.println("Display-base");
    }
}
//Circle.java
public class Circle extends Shape{<
< access - modifier > void display(){
System.out.println("Display-derived");
}
}
