package com.mycompany.exercicio_if_3;
import  javax.swing.JOptionPane;
public class Exercicio_IF_3 {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("insira um numero: "));
        if ( (numero %10) == 0 ){
            JOptionPane.showMessageDialog(null,"é multiplo de 10!");
        }
        else{
            if ( (numero %2) == 0 ){
                JOptionPane.showMessageDialog(null,"É múltiplo de 2 !");
            }else{
                if ( (numero %5) == 0 ){
                    JOptionPane.showMessageDialog(null," é multiplo de 5!");
                }else{
                    JOptionPane.showMessageDialog(null," não é multiplo desses!");
                    }
                }
            } 
        }
    }
