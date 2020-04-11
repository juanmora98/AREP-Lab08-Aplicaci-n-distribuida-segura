package edu.escuelaing.arep.laboratorio08.controller;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arep.laboratorio08.services.math.MathService;

@RestController
@RequestMapping("math")
public class MathController {

    @Autowired
    private MathService mathService;

    @GetMapping("/cuadrado")
    public ResponseEntity<?> getSquareRoot(@RequestParam String number) {
        return new ResponseEntity<>(mathService.Cuadrado(Double.parseDouble(number)), HttpStatus.OK);
    }

}