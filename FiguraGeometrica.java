package figurageometrica;

import javax.swing.JOptionPane;


public class FiguraGeometrica {


    public static void main(String[] args) {
        //variaveis  
        Calculo b = new Calculo(24);//chamando classe calculo
        Calculo c = new Calculo(25,25);
        Calculo e = new Calculo(25,20);
        Calculo d = new Calculo(30,20,40);
        
        b.imprimeFigura();
        c.imprimeFigura();
        d.imprimeFigura();
        e.imprimeFigura();
    }
    
}
