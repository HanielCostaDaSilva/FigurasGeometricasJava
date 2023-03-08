public class Teste {
   
    public static void main(String[] args){

        Retangulo ret= new Retangulo(56.5,77.4);
        
        System.out.println(ret);
        System.out.println("Diagonal do Retângulo: " + ret.calcularDiagonal());
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.println("Perimêtro do Retângulo: " + ret.calcularPerimetro());
        
        ret.enquadrar();
        System.out.println(ret);
    };
    
}
