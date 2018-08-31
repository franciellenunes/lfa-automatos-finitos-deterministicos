/*
 * MIT License - Copyright (c) 2018 Francielle da Silva Nunes, Luís Fernando Ávila
 * Criada em 25 ago 2018
 */
package br.com.iftm.lfa.controller;

import javax.swing.JOptionPane;

/**
 * Classe criada para resolução do exercício correspondente a letra F A
 * linguagem possui ocorrência par de a's seguida por ocorrência impar de b's
 *
 * @author Francielle da Silva Nunes
 */
public class F {

    public F(char[] cadeia) {
        Boolean erro = false;
        int Q = 1;
        if (cadeia.equals("")) {
            erro = true;
        } else {
            for (char c : cadeia) {
                switch (Q) {
                    case 1:
                        if (c == 'a') {
                            Q = 2;
                        } else if (c == 'b') {
                            Q = 7;
                        } else {
                            erro = true;
                        }
                        break;
                    case 2:
                        if (c == 'a') {
                            Q = 3;
                        } else if (c == 'b') {
                            Q = 7;
                        } else {
                            erro = true;
                        }
                        break;
                    case 3:
                        if (c == 'a') {
                            Q = 2;
                        } else if (c == 'b') {
                            Q = 4;
                        } else {
                            erro = true;
                        }
                        break;
                    case 4:
                        if (c == 'a') {
                            Q = 7;
                        } else if (c == 'b') {
                            Q = 5;
                        } else {
                            erro = true;
                        }
                        break;
                    case 5:
                        if (c == 'a') {
                            Q = 7;
                        } else if (c == 'b') {
                            Q = 6;
                        } else {
                            erro = true;
                        }
                        break;
                    case 6:
                        if (c == 'a') {
                            Q = 7;
                        } else if (c == 'b') {
                            Q = 5;
                        } else {
                            erro = true;
                        }
                        break;
                    case 7:
                        erro = true;
                        break;
                    default:
                        break;
                }
            }
        }

        if (erro || (Q != 4 && Q != 6)) {
            JOptionPane.showMessageDialog(null, "Sentença não reconhecida");
        } else {
            JOptionPane.showMessageDialog(null, "Sentença reconhecida");
        }
        
    }
}
