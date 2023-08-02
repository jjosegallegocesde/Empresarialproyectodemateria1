package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadoValidacionTest {

    private AfiliadoValidacion afiliadoValidacion;

    @BeforeEach
    public void setUp (){
        this.afiliadoValidacion=new AfiliadoValidacion();
    }

    @Test
    public void validarCostoMembresiaCorrecto(){
        Integer costoCorrecto = 20000;
        Assertions.assertDoesNotThrow(()->this.afiliadoValidacion.validarCostoMembresia(costoCorrecto));
    }



    @Test
    public void validarCostoMembresiaIncorrecto(){
        Integer costoIncorrecto=-10000;
        Exception exception=Assertions.assertThrows(Exception.class,()->this.afiliadoValidacion.validarCostoMembresia(costoIncorrecto));
        Assertions.assertEquals("aqui va el mensaje que espero",exception.getMessage());

    }



}