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
 * linguagem começa com a e possui occorência par de a's ou começa com b e
 * possui ocorrência impar de b's.
 *
 * @author Luís Fernando de Ávila
 */
public class G {

    public G(char[] cadeia) {
        Boolean erro = false;
        List<Character> alfabeto = new ArrayList<Character>();
        List<Character> alfabetosemA = new ArrayList<Character>();
        List<Character> alfabetosemB = new ArrayList<Character>();
        List<Character> alfabetosemAB = new ArrayList<Character>();
        alfabeto.addAll(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w',
                'y', 'z'));
        alfabetosemA.addAll(Arrays.asList('b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w',
                'y', 'z'));
        alfabetosemB.addAll(Arrays.asList('a', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w',
                'y', 'z'));
        alfabetosemAB.addAll(Arrays.asList('c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w',
                'y', 'z'));
        int Q = 1;
        for (char c : cadeia) {
            switch (Q) {
                case 1:
                    if (c == 'a') {
                        Q = 2;
                    } else if (c == 'b') {
                        Q = 6;
                    } else if (alfabetosemAB.contains(c)) {
                        Q = 5;
                    } else {
                        erro = true;
                    }
                    break;
                case 2:
                    if (alfabetosemA.contains(c)) {
                        Q = 5;
                    } else if (c == 'a') {
                        Q = 3;
                    } else {
                        erro = true;
                    }
                    break;
                case 3:
                    if (c == 'a') {
                        Q = 2;
                    } else if (alfabetosemA.contains(c)) {
                        Q = 4;
                    } else {
                        erro = true;
                    }
                    break;
                case 4:
                    if (c == 'a') {
                        Q = 2;
                    } else if (alfabetosemA.contains(c)) {
                        Q = 4;
                    } else {
                        erro = true;
                    }
                    break;
                case 5:
                    erro = true;
                    break;
                case 6:
                    if (alfabetosemB.contains(c)) {
                        Q = 7;
                    } else if (c == 'b') {
                        Q = 8;
                    } else {
                        erro = true;
                    }
                    break;
                case 7:
                    if (alfabetosemB.contains(c)) {
                        Q = 7;
                    } else if (c == 'b') {
                        Q = 6;
                    } else {
                        erro = true;
                    }
                    break;
                case 8:
                    if (alfabetosemB.contains(c)) {
                        Q = 5;
                    } else if (c == 'b') {
                        Q = 9;
                    } else {
                        erro = true;
                    }
                    break;
                case 9:
                    if (alfabetosemB.contains(c)) {
                        Q = 7;
                    } else if (c == 'b') {
                        Q = 8;
                    } else {
                        erro = true;
                    }
                    break;
                default:
                    break;
            }
        }
        if (erro || (Q != 3 && Q != 4 && Q != 6 && Q != 7 && Q != 9 )) {
            JOptionPane.showMessageDialog(null, "Sentença não reconhecida");
        } else {
            JOptionPane.showMessageDialog(null, "Sentença reconhecida");
        }

    }

}
