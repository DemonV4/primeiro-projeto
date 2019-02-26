
package figurageometrica;

public class Calculo{
    private double lado1;
    private double lado2;
    private double lado3;
    private String figura;

    public Calculo(double lado1){
        this.lado1= lado1;
        figura="Circulo"; 
        
    }
    public Calculo(double lado1,double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
        if(lado1==lado2){
            figura="Quadrado";
        }
        else{
            figura="Retângulo";
        }
    }
    public Calculo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        figura="Triangulo";
    }
    public  void imprimeFigura(){    
        
        double area=0;
        
        if(figura.equals("Circulo")){
            area=3.14*lado1;
        }
        if(figura.equals("Quadrado")){
            area=lado1*lado1;
        }
        if(figura.equals("Retângulo")){
            area = lado1*lado2;
        }
        if(figura.equals("Triangulo")){
            area=lado1;
        }
        System.out.println("A área do "+figura+" é: "+area);
    }
    //abrindo geterr e seter
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }
    //finalizando getter e seter
    
    
}
