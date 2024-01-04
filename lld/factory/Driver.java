package lld.factory;

public class Driver {
    
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        shape shapeObj = shapeFactory.getShape("square"); ;
        shapeObj.draw();
    }
}
