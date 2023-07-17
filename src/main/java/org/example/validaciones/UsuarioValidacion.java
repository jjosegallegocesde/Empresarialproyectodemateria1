package org.example.validaciones;

import org.example.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {

    protected Util util=new Util();

    public UsuarioValidacion() {
    }

    //metodos ordinarios para validar datos
    public Boolean validarNombres(String nombres)throws Exception{
        String expresionRegular="^[a-zA-Z ]+$";
        if(!util.buscarCoincidencia(expresionRegular,nombres)){
            throw new Exception("Señor usuario su nombre solo puede tener letras");
        }else if(nombres.length()<10){
            throw new Exception("Señor usuario revisa la cantidad de caracteres es muy pequeña");
        }else{
            return true;
        }
    }

    public Boolean validarCorreo(String correoElectornico)throws Exception{
        String expresionRegular= "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if(!util.buscarCoincidencia(expresionRegular,correoElectornico)){ //SI NO HAY COINCIDENCIA....
            throw new Exception("Señor usuario el correo ingresado no es valido");
        }else{
            return true;
        }
    }

    public Boolean validarUbicacion(Integer ubicacion)throws Exception{
        if(ubicacion.equals(1)||ubicacion.equals(2)||ubicacion.equals(3)||ubicacion.equals(4)){
            return true;
        }else{
            throw new Exception("La zona ingresada no es valida");
        }
    }



}
