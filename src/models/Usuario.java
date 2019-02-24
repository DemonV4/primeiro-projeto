package models;

public abstract class Usuario {
    private String nome;
    private String senha;
    private String email;
    private String tipoSangue;
    private double peso;
    private double altura;
    private String sexo;
    
    // set e eget nome
    public void setNome(String nome){
        this.nome = nome; //this  puxa a variavel dessa classe
    }
    public String getNome(){
        return this.nome; 
    }
    
    //set e get Senha
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return this.senha;
    }
    
    //set get email
    public void setemail(String email){
        this.email = email;
    }
    public String getemail(){
        return this.email;
    }
    
    //set get tipoSangue
    public void settipoSangue(String tipoSangue){
        this.tipoSangue = tipoSangue;
    }
    public String gettipoSangue(){
        return this.tipoSangue;
    }
    
    //set get Peso
    public void setpeso(double peso){
        this.peso = peso;
    }
    public double getpeso(){
        return this.peso;
    } 
    //set get Altura
    public void setaltura(double altura){
        this.altura = altura;
    }
    public double getaltura(){
        return this.altura;
    }
    
    //set get sexo
    public void setsexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getsexo() {
        return sexo;
    }

    
    
}
