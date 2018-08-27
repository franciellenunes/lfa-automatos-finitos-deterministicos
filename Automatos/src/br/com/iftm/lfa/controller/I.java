/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iftm.lfa.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe criada para resolução do exercício correspondente a letra G A
 * linguagem inicia-se com uma letra, possuindo a seguir qualquer combinação de
 * letras e dígitos.
 *
 * @author Luís Fernando de Ávila
 */
public class I {

    public I(char[] cadeia) {
        List<Character> alfabeto = new ArrayList<Character>();
        alfabeto.addAll(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w',
                'y', 'z'));
        List<Character> digitos = new ArrayList<Character>();
        for (int i = 0; i <= 9; i++) {
             digitos.add((char)(i+'0'));
        }
        Boolean erro = false;
        int Q = 1;
        for (char c : cadeia) {
            switch (Q) {
                case 1:
                    if (digitos.contains(c)) {
                        erro = true;
                    } else if (alfabeto.contains(c)) {
                        Q = 2;
                    } else {
                        erro = true;
                    }
                    break;
                case 2:
                    if (alfabeto.contains(c) || digitos.contains(c)) {
                        Q = 2;
                    } else {
                        erro = true;
                    }
                    break;
                default:
                    erro = true;
                    break;

            }
        }
         if (erro || Q != 2 ) {
            JOptionPane.showMessageDialog(null, "Sentença não reconhecida");
        } else {
            JOptionPane.showMessageDialog(null, "Sentença reconhecida");
        }

    }

}
