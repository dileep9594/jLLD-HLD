package lld.factory;

public class ShapeFactory {

     public shape getShape(String input) {
        switch (input) {
            case "circle" :
                 return new circle() ;
            case "square" :
                 return new square() ;
            case "triangle" :
                 return new Rectengale() ;
            default:
                return null;
        }
     }
}