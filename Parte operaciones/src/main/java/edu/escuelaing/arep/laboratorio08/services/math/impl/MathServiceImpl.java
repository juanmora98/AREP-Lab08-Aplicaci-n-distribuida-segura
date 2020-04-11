package edu.escuelaing.arep.laboratorio08.services.math.impl;

import edu.escuelaing.arep.laboratorio08.services.math.MathService;

/**
 * Implementacion especifica para el servicio de las operaciones matematicas
 */
public class MathServiceImpl implements MathService{


    /**
     * Metodo encargado de realizar la operacion de encontrar el cuadrado del numero dado.
     * @param numero
     * @return
     */
    @Override
    public double Cuadrado(double numero) {
        return Math.sqrt(numero);
    }

    

}