
public class Retangulo extends FiguraGeometrica{
    /* private int identificador;*/

    public Retangulo(double largura, double comprimento){
        super("RETÂNGULO", largura, comprimento, largura, comprimento);
        this.setbase(largura);
        this.setAltura(comprimento);
        /* this.identificador=id; */
    };

    public void enquadrar(){
        double novoLadoTamanho = Math.rint(this.getbase() + this.getAltura()/2);
        this.setAltura(novoLadoTamanho);
        this.setbase(novoLadoTamanho);    
    }



}
