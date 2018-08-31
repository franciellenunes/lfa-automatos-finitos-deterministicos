/*
 * MIT License - Copyright (c) 2018 Francielle da Silva Nunes, Luís Fernando Ávila
 * Criada em 25 ago 2018
 */
package br.com.iftm.lfa.controller;

import javax.swing.JOptionPane;

/**
 * Classe criada para resolução do exercício correspondente a letra D A
 * linguagem possui no máximo uma ocorrência da cadeia baba
 *
 * @author Francielle da Silva Nunes
 */
public class D {

    public D(char[] cadeia) {
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
                            Q = 6;
                        } else {
                            erro = true;
                        }
                        break;
                    case 6:
                        if (c == 'a') {
                            Q = 7;
                        } else if (c == 'b') {
                            Q = 6;
                        } else {
                            erro = true;
                        }
                        break;
                    case 7:
                        if (c == 'a') {
                            Q = 5;
                        } else if (c == 'b') {
                            Q = 8;
                        } else {
                            erro = true;
                        }
                        break;
                    case 8:
                        if (c == 'a') {
                            Q = 10;
                        } else if (c == 'b') {
                            Q = 9;
                        } else {
                            erro = true;
                        }
                        break;
                    case 9:
                        if (c == 'a') {
                            Q = 7;
                        } else if (c == 'b') {
                            Q = 9;
                        } else {
                            erro = true;
                        }
                        break;
                    case 10:
                        erro = true;
                        break;
                    default:
                        break;
                }
            }
        }

        if (erro || (Q == 10)) {
            JOptionPane.showMessageDialog(null, "Sentença não reconhecida");
        } else {
            JOptionPane.showMessageDialog(null, "Sentença reconhecida");
        }

    }
}
