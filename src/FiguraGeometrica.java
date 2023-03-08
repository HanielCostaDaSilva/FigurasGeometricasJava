import java.util.ArrayList;
import java.util.List;

public class FiguraGeometrica{
   
    public ArrayList<Double> lados = new ArrayList<Double>(); 
    
    private String formaNome;
    private Double base=0.0;
    private Double altura=0.0;
    private Double area;

    public FiguraGeometrica( String Nome, Double...lados){
        
        this.formaNome=Nome;

        for(Double i : lados ){
            this.lados.add(i);
        };
    };

    /**
     * @return String return the formaNome
     */
    public String getFormaNome() {
        return formaNome;
    }

    /**
     * @return Double return the base
     */
    public Double getbase() {
        return base;
    }

    public void setbase(Double base) {
        this.base = base;
        this.area=this.calcularArea();
    }

    /**
     * @return Double return the altura
     */
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
        this.area=this.calcularArea();
    }

    /**
     * @return Double return the area
     */
    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public void setLado(int posicao, Double NovoLado){
        this.lados.set(posicao, NovoLado);
    }

    public Double calcularPerimetro(){
        Double soma = lados.stream().reduce((double) 0, Double::sum);
        return soma;
    };

    public Double calcularArea(){
        return this.altura * this.base;
    };
    
    public Double calcularDiagonal(){
        double cateto1=Math.pow(this.altura, 2);
        double cateto2= Math.pow(this.base, 2);
        return Math.sqrt((cateto1+cateto2)); 
    };

    public Boolean checarIgualdade(FiguraGeometrica outra){
        return this.area == outra.area;
    }

    public String toString() {
        return "Forma: "+ this.formaNome +"\n Base: "+ this.base +"\n Altura: "+ this.altura + "\n Área: "+ this.area;
    }

}
