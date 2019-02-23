package trabalho;

import javax.swing.JOptionPane;

public class Funcionario {
    //atributos
    private String nome;
    private String cpf;
    private String cptps;
    private String salario;
    private double desconto;
    private long numcpf;   
    
    //MÉTODOS
    public void ImprimeDados(){
             
        Funcionario F1 = new Funcionario();//chamando classe Funcionário
        
        nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
        System.out.println("******Dados Funcionário******");
        System.out.println("nome: "+nome);
        
        cpf = JOptionPane.showInputDialog("Digite o cpf do funcionário");
        numcpf = Long.parseLong(cpf);
        System.out.println("cpf: "+cpf);
        F1.SalarioLiquido();
        
    }
    public void SalarioLiquido(){
        
        double valor;
        
        salario = JOptionPane.showInputDialog("Digite o seu salário:");
        desconto = Double.parseDouble(salario);
        valor =  desconto;

        if(desconto<= 1693.72){
             desconto = desconto*0.08;
        }
        if((desconto>=1693.73)&&(desconto<=2822.90)){
            desconto = desconto*0.09;
        }
        if(desconto>=2822.91){
            desconto = desconto * 0.11;
        }
        desconto = valor - desconto;
        
        
        System.out.println("cpts: "+desconto);
    }
}