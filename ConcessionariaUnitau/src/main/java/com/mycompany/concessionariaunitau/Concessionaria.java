
package com.mycompany.concessionariaunitau;


public class Concessionaria {
    private int codigo;
    private String nomeConcessionaria;
    private Funcionarios func;

    public Concessionaria(String nomeConcessionaria, Funcionarios func) {
        
        codigo = ((int)(Math.random()*100+1));
        this.nomeConcessionaria = nomeConcessionaria;
        this.func = func;
    }

    public Funcionarios getFunc() {
        return func;
    }

    public void setFunc(Funcionarios func) {
        this.func = func;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeConcessionaria() {
        return nomeConcessionaria;
    }

    public void setNomeConcessionaria(String nomeConcessionaria) {
        this.nomeConcessionaria = nomeConcessionaria;
    }
    
   
    public String dados() {
        return "Funcionário: "+func+
                "\nCódigo: "+codigo+
                "\nNome da concessionária: "+nomeConcessionaria;
                
                       
    }
   
    }
    

