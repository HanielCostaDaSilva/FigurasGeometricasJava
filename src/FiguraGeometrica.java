import java.util.ArrayList;
import java.util.List;

public class FiguraGeometrica{
   
    public ArrayList<Double> lados = new ArrayList<Double>(); 
    public Double comprimento;
    public Double altura;

    public FiguraGeometrica(List<Double> lados, Double comprimento, Double altura){

        for(Double i : lados ){
            this.lados.add(i);
        };
        this.comprimento=comprimento;
        this.altura=altura;
    };

    public Double calcularPerimetro(){
        Double soma = lados.stream().reduce((double) 0, Double::sum);
        return soma;
    }
}
