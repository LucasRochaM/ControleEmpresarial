
package com.mycompany.concessionariaunitau;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome da concessionária", "AppConcessionária", JOptionPane.QUESTION_MESSAGE);
        String id = JOptionPane.showInputDialog(null, "Informe o seu id", "AppConcessionária", JOptionPane.QUESTION_MESSAGE);
        String empresa = JOptionPane.showInputDialog(null, "Informe o nome da empresa", "AppConcessionária", JOptionPane.QUESTION_MESSAGE);
        String nomeConcessionaria = JOptionPane.showInputDialog(null, "Informe o nome da concessionária", "AppConcessionária", JOptionPane.QUESTION_MESSAGE);
        
        
        JOptionPane.showMessageDialog(null,Concessionaria.dados(),"Dados", JOptionPane.INFORMATION_MESSAGE);
    }
}
