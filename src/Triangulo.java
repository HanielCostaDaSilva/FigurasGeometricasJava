public class Triangulo extends FiguraGeometrica {
	double hipotenusa;


    public Triangulo(double base,double lado1, double lado2){
        super("TRIANGULO",base,lado1,lado2);

        if (base== lado1 && lado1==lado2){
            this.setFormaNome(getFormaNome()+ " EQUILATERO");
        }else if((base==lado1 || base== lado2) || lado2==lado1) {
        	this.setFormaNome(getFormaNome()+ " ISOCELES");
        }else{
        	this.setFormaNome(getFormaNome()+ " RETANGULO");
        	hipotenusa=Math.max(base, Math.max(lado1, lado2));
            
        };
        this.setbase(base);
        this.calcularAltura();
        
    };

    private void calcularAltura(){
        
        if (this.getFormaNome().equalsIgnoreCase("TRIANGULO EQUILATERO") || this.getFormaNome().equalsIgnoreCase("TRIANGULO ISOCELES")){
    
            double baseCalculo= Math.pow(this.getbase()/2,2);
            double ladoCalculo= Math.pow(this.getLado(2),2);
            this.setAltura(Math.sqrt(baseCalculo + ladoCalculo ));
        }
        else{
            double maiorCateto=0.0;
            int count=0;
            
            while(count<3){
                double lado=this.getLado(count);

                if (lado==this.hipotenusa) continue;

                maiorCateto= Math.max(maiorCateto, this.getLado(count));
            }
            this.setAltura(maiorCateto);
        }
    };
    
    @Override
    public Double calcularArea(){    
        return (this.getAltura() * this.getbase())/2 ;
    }

    
}
