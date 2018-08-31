/*
 * MIT License - Copyright (c) 2018 Francielle da Silva Nunes, Luís Fernando Ávila
 * Criada em 25 ago 2018
 */
package br.com.iftm.lfa.controller;

import javax.swing.JOptionPane;

/**
 * Classe criada para resolução do exercício correspondente a letra E A
 * linguagem não possui ocorrência de cadeia baba.
 *
 * @author Luís Fernando de Ávila
 */
public class E {

    public E(char[] cadeia) {
        Boolean erro = false;
        int Q = 1;
        if (cadeia.equals("")) {
            Q = 1;
        } else {
            for (char c : cadeia) {
                switch (Q) {
                    case 1:
                        if (c == 'a') {
                            Q = 1;
                        } else if (c == 'b') {
                            Q = 2;
                        } else {
                            erro = true;
                        }
                        break;
                    case 2:
                        if (c == 'a') {
                            Q = 3;
                        } else if (c == 'b') {
                            Q = 2;
                        } else {
                            erro = true;
                        }
                        break;
                    case 3:
                        if (c == 'a') {
                            Q = 1;
                        } else if (c == 'b') {
                            Q = 4;
                        } else {
                            erro = true;
                        }
                        break;
                    case 4:
                        if (c == 'a') {
                            Q = 5;
                        } else if (c == 'b') {
                            Q = 1;
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
        }

        if (erro || (Q != 1 && Q != 2 && Q != 3 && Q != 4)) {
            JOptionPane.showMessageDialog(null, "Sentença não reconhecida");
        } else {
            JOptionPane.showMessageDialog(null, "Sentença reconhecida");
        }

    }
}
