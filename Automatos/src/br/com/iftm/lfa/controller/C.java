/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iftm.lfa.controller;

import javax.swing.JOptionPane;

/**
 * Classe criada para resolução do exercício correspondente a letra C A
 * linguagem possui baba como prefixo e abab como sufixo.
 *
 * @author Luís Fernando de Ávila
 */
public class C {

    public C(char[] cadeia) {
        Boolean erro = false;
        int Q = 1;
        for (char c : cadeia) {
            switch (Q) {
                case 1:
                    if (c != 'b') {
                        erro = true;
                    } else {
                        Q = 2;
                    }
                    break;
                case 2:
                    if (c != 'a') {
                        erro = true;
                    } else {
                        Q = 3;
                    }
                    break;
                case 3:
                    if (c != 'b') {
                        erro = true;
                    } else {
                        Q = 4;
                    }
                    break;
                case 4:
                    if (c != 'a') {
                        erro = true;
                    } else {
                        Q = 5;
                    }
                    break;
                case 5:
                    if (c == 'a') {
                        Q = 6;
                    } else if (c == 'b') {
                        Q = 10;
                    } else {
                        erro = true;
                    }
                    break;
                case 6:
                    if (c == 'a') {
                        Q = 7;
                    } else if (c == 'b') {
                        Q = 8;
                    } else {
                        erro = true;
                    }
                    break;
                case 7:
                    if (c == 'a') {
                        Q = 7;
                    } else if (c == 'b') {
                        Q = 8;
                    } else {
                        erro = true;
                    }
                    break;
                case 8:
                    if (c == 'a') {
                        Q = 5;
                    } else if (c == 'b') {
                        Q = 11;
                    } else {
                        erro = true;
                    }
                    break;
                case 10:
                    if (c == 'a') {
                        Q = 5;
                    } else if (c == 'b') {
                        Q = 7;
                    } else {
                        erro = true;
                    }
                    break;
                case 11:
                    if (c == 'a') {
                        Q = 7;
                    } else if (c == 'b') {
                        Q = 11;
                    } else {
                        erro = true;
                    }
                    break;
            }

        }
        if (erro || Q != 10) {
            JOptionPane.showMessageDialog(null, "Sentença não reconhecida");
        } else {
            JOptionPane.showMessageDialog(null, "Sentença reconhecida");
        }
    }
}
