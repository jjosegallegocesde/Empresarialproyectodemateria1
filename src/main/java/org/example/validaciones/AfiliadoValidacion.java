package org.example.validaciones;

import org.example.utilidades.Util;

public class AfiliadoValidacion {

    private Util util= new Util();

    public Boolean validarCostoMembresia(Integer costo) throws Exception{
        if(costo<20000 || costo>150000){
            throw new Exception("el costo de membrsia es invalido");
        }else{
            return true;
        }
    }

    public Boolean validarReferido(String documento) throws Exception{
        String expresionRegular="^[0-9]+$";
        if(!this.util.buscarCoincidencia(expresionRegular,documento)){
            throw new Exception("El documento es incorrecto");
        }else{
            return true;
        }
    }
    //valor de membresia no puede ser menor a $20.000
    //ni mayor a $150.000

    //cedula del referido SOLO PUEDE TENER NUMEROS

}
