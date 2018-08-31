/*
 * MIT License - Copyright (c) 2018 Francielle da Silva Nunes, Luís Fernando Ávila
 * Criada em 25 ago 2018
 */
package br.com.iftm.lfa.controller;

import javax.swing.JOptionPane;

/**
 * Classe criada para resolução do exercício correspondente a letra A A
 * linguagem começa com a e termina com b.
 *
 * @author Luís Fernando de Ávila
 */
public class A {

    public A(char[] cadeia) {
        Boolean erro = false;
        int Q = 1;
        if (cadeia.equals("")) {
            erro = true;
        } else {
            for (char c : cadeia) {
                switch (Q) {
                    case 1:
                        if (c != 'a') {
                            erro = true;
                        } else {
                            Q = 2;
                        }
                        break;
                    case 2:
                        if (c == 'a') {
                            Q = 2;
                        } else if (c == 'b') {
                            Q = 3;
                        } else {
                            erro = true;
                        }
                        break;
                    case 3:
                        if (c == 'a') {
                            Q = 2;
                        } else if (c == 'b') {
                            Q = 3;
                        } else {
                            erro = true;
                        }
                        break;
                    default:
                        break;
                }
            }
        }

        if (erro || Q != 3) {
            JOptionPane.showMessageDialog(null, "Sentença não reconhecida");
        } else {
            JOptionPane.showMessageDialog(null, "Sentença reconhecida");
        }
        
    }
}
