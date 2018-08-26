/*
/*
 * MIT License - Copyright (c) 2018 Francielle da Silva Nunes, Luís Fernando Ávila
 * Criada em 25 ago 2018
 */
package br.com.iftm.lfa.controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe criada para resolução do exercício correspondente a letra J 
 * Linguagem é um número inteiro, um número decimal ou um número representado em
 * notação científica
 *
 * @author Francielle da Silva Nunes
 */
public class J {

    public J(char[] cadeia) {

        List<Character> digitos = new ArrayList<Character>();
        for (int i = 0; i <= 9; i++) {
            digitos.add((char) (i + '0'));
        }

        Boolean erro = false;
        int Q = 1;
        for (char c : cadeia) {
            switch (Q) {
                case 1:
                    if (c == '+' || c == '-') {
                        Q = 2;
                    } else {
                        Q = 9;
                        erro = true;
                    }
                    break;
                case 2:
                    if (digitos.contains(c)) {
                        Q = 3;
                    } else {
                        Q = 9;
                        erro = true;
                    }
                    break;
                case 3:
                    if (digitos.contains(c)) {
                        Q = 3;
                    } else if (c == ',') {
                        Q = 4;
                    } else {
                        Q = 9;
                        erro = true;
                    }
                    break;
                case 4:
                    if (digitos.contains(c)) {
                        Q = 5;
                    } else {
                        Q = 9;
                        erro = true;
                    }
                    break;
                case 5:
                    if (digitos.contains(c)) {
                        Q = 5;
                    } else if (c == 'e') {
                        Q = 6;
                    } else {
                        Q = 9;
                        erro = true;
                    }
                    break;
                case 6:
                    if (c == '+' || c == '-') {
                        Q = 7;
                    } else {
                        Q = 9;
                        erro = true;
                    }
                    break;
                case 7:
                    if (digitos.contains(c)) {
                        Q = 8;
                    } else {
                        Q = 9;
                        erro = true;
                    }
                    break;
                case 8:
                    if (digitos.contains(c)) {
                        Q = 8;
                    } else {
                        Q = 9;
                        erro = true;
                    }
                    break;
                case 9:
                    erro = true;
                    break;
                default:
                    break;
            }
        }
        if (erro || (Q != 3 && Q != 5 && Q != 8)) {
            JOptionPane.showMessageDialog(null, "Sentença não reconhecida");
        } else {
            JOptionPane.showMessageDialog(null, "Sentença reconhecida");
        }

    }
}
