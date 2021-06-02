package com.mycompany.concessionariaunitau;

public class Funcionarios {

    private String nome,id,empresa;
    private int qtdVendas;
    

    public Funcionarios(String nome, String id, String empresa, int qtdVendas) {
        this.nome = nome;
        this.id = id;
        this.empresa = empresa;
        this.qtdVendas = qtdVendas; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public float salario(){
        return salario()*qtdVendas;
    }
    
     @Override
    public String toString(){ //método herdado da classe Object
        return "Nome: "+nome+
                "\nID: " +id+
                "\nEmpresa: "+empresa;
                
    }

    
}
