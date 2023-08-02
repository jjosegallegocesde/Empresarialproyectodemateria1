package org.example;

import org.example.modelos.Afiliado;
import org.example.modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Afiliado afiliado = new Afiliado(); //HIJO

        //ACCEDIENDO A LOS ATRIBUTOS DE UN OBJETO
        afiliado.setNombres("ana");

    }
}