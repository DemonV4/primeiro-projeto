package trabalho;

import javax.swing.JOptionPane;

public class Trabalho {

    public static void main(String[] args) {
        //ATRIBUIÇAO DE VARIAVEIS
        int escolha = 1;
        String continua;
         
        Funcionario Func = new Funcionario();//Chamando a classe Funcionariao
  
        while(escolha !=0){
            Func.ImprimeDados();
            continua = JOptionPane.showInputDialog("Efetuar outro Cálculo? < 0= Sair/ 1= Continuar >");
            escolha = Integer.parseInt(continua);
        }
        System.exit(0);
        
             
    }
    
}
