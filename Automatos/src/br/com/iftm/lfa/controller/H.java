/*
 * MIT License - Copyright (c) 2018 Francielle da Silva Nunes, Luís Fernando Ávila
 * Criada em 25 ago 2018
 */
package br.com.iftm.lfa.controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe criada para resolução do exercício correspondente a letra H A
 * linguagem inicia-se com 0 e a soma de todos os seus dígitos é par Ou
 * inicia-se com 1 e a soma de todos os seus dígitos é ímpar
 *
 * @author Francielle da Silva Nunes
 */
public class H {

    public H(char[] cadeia) {

        List<Character> digitos = new ArrayList<Character>();
        for (int i = 0; i <= 9; i++) {
            digitos.add((char) (i + '0'));
        }

        List<Character> pares = new ArrayList<Character>();
        for (int i = 0; i < 9; i += 2) {
            pares.add((char) (i + '0'));
        }

        List<Character> impares = new ArrayList<Character>();
        for (int i = 1; i <= 9; i += 2) {
            impares.add((char) (i + '0'));
        }

        Boolean erro = false;
        int Q = 1;
        if (cadeia.equals("")) {
            erro = true;
        } else {
            for (char c : cadeia) {
                switch (Q) {
                    case 1:
                        if (c == '0' || c == '1') {
                            Q = 2;
                        } else {
                            erro = true;
                        }
                        break;
                    case 2:
                        if (pares.contains(c)) {
                            Q = 2;
                        } else if (impares.contains(c)) {
                            Q = 3;
                        } else {
                            erro = true;
                        }
                        break;
                    case 3:
                        if (pares.contains(c)) {
                            Q = 3;
                        } else if (impares.contains(c)) {
                            Q = 2;
                        } else {
                            erro = true;
                        }
                        break;
                    case 4:
                        erro = true;
                    default:
                        break;
                }
            }
        }
        if (erro || (Q != 2)) {
            JOptionPane.showMessageDialog(null, "Sentença não reconhecida");
        } else {
            JOptionPane.showMessageDialog(null, "Sentença reconhecida");
        }

    }
}
