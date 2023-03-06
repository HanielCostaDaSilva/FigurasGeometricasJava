import java.lang.reflect.Constructor;

public class Teste {
   
    public static void main(String[] args){
    
        Retangulo ret= new Retangulo(1,2.3,4);
        System.out.println(ret.calcularDiagonal());
        System.out.println(ret);
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/");

        ret.enquadrar();
        System.out.println(ret);
    };
    
}
