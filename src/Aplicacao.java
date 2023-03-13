public class Aplicacao {
   
    public static void main(String[] args){

        Quadrilatero ret= new Quadrilatero(5.5,7.4);
        
        System.out.println(ret);
        System.out.println("Diagonal do Retângulo: " + ret.calcularDiagonal());
        System.out.println("\n*/*/*/*/*/*/*/*/*/*/*/*/*/\n");
        System.out.println("Perimêtro do Retângulo: " + ret.calcularPerimetro());
        
        ret.enquadrar();
        System.out.println(ret);
        System.out.println("\n*/*/*/*/*/*/*/*/*/*/*/*/*/\n");

        Triangulo triEqui= new Triangulo(4, 4, 4); // Triangulo equilateo
        System.out.println(triEqui);
        System.out.println("\n*/*/*/*/*/*/*/*/*/*/*/*/*/\n");

        Triangulo triIso= new Triangulo(5, 6, 6); // Triangulo isoceles
        System.out.println(triIso);
        System.out.println("\n*/*/*/*/*/*/*/*/*/*/*/*/*/\n");

        Triangulo triRet= new Triangulo(7, 8, 9); // Triangulo retangulo
        System.out.println(triRet);
    };
    
}
