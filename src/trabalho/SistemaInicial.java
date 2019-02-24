package trabalho;

import javax.swing.JOptionPane;
import models.Funcionario;
import models.UsuarioCPF;

public class SistemaInicial{
    
    public static void main(String[] args) {
        String nome;
        UsuarioCPF u = new UsuarioCPF();
        Funcionario usuario = new Funcionario();
        nome = JOptionPane.showInputDialog(null,"Digite o seu nome:");
        usuario.setNome(nome);
        JOptionPane.showMessageDialog(null, usuario.getNome());
        
        
                
}
}


