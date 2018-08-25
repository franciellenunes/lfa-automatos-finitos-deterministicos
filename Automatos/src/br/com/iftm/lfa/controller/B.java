/*
 * MIT License - Copyright (c) 2018 Francielle da Silva Nunes, Luís Fernando Ávila
 * Criada em 25 ago 2018
 */
package br.com.iftm.lfa.controller;

import javax.swing.JOptionPane;

/**
 * Classe criada para resolução do exercício correspondente a letra B
 * A linguagem possui aaa como subcadeia
 *
 * @author Francielle da Silva Nunes
 */
public class B {

    public B(char[] cadeia) {
        Boolean erro = false;
        int Q = 1;
        for (char c : cadeia) {
            switch (Q) {
                case 1:
                    if (c == 'a') {
                        Q = 2;
                    } else if (c == 'b') {
                        Q = 1;
                    } else {
                        erro = true;
                    }
                    break;
                case 2:
                    if (c == 'a') {
                        Q = 3;
                    } else if (c == 'b') {
                        Q = 1;
                    } else {
                        erro = true;
                    }
                    break;
                case 3:
                    if (c == 'a') {
                        Q = 4;
                    } else if (c == 'b') {
                        Q = 1;
                    } else {
                        erro = true;
                    }
                    break;
                case 4:
                    if (c == 'a') {
                        Q = 4;
                    } else if (c == 'b') {
                        Q = 5;
                    } else {
                        erro = true;
                    }
                    break;
                case 5:
                    if (c == 'a') {
                        Q = 5;
                    } else if (c == 'b') {
                        Q = 5;
                    } else {
                        erro = true;
                    }
                    break;
                default:
                    break;
            }
        }

        if (erro || (Q != 4 && Q != 5)) {
            JOptionPane.showMessageDialog(null, "Sentença não reconhecida");
        } else {
            JOptionPane.showMessageDialog(null, "Sentença reconhecida");
        }

    }
}
