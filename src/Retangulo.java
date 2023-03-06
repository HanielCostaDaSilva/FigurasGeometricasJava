public class Retangulo {

    public int identificador;
    public double largura;
    public double comprimento;

    public Retangulo(int id, double lar, double comp){
        this.identificador=id;
        this.largura=lar;
        this.comprimento=comp;
    }

    public double calcularArea() {
        return this.largura * this.comprimento;
    };

    public double calcularDiagonal(){
        double cateto1=Math.pow(this.largura, 2);
        double cateto2= Math.pow(this.comprimento, 2);
        return Math.sqrt((cateto1+cateto2)); 
    };

    public void enquadrar(){
        double novoLadoTamanho = (this.largura + this.comprimento)/2;
        this.largura = this.comprimento = novoLadoTamanho;
    }

    public String toString() {
        return " id: "+this.identificador+"\n largura: "+ this.largura +"\n comprimento: "+ this.comprimento + "\n Área: "+ this.calcularArea();
    }

}
