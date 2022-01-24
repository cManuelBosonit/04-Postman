package com.example.inyeccionDependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {

    //Llamar servicio
    @Autowired
    Servicio servicio;

    //GET
    //http://localhost:8080/controlador1/addPersona
    //Obtener valores de los atributos de persona mediante los headers de la petción
    @GetMapping("/controlador1/addPersona")
    public Persona addPersona(@RequestHeader (value="nombre") String nombre,
                              @RequestHeader (value="edad") int edad,
                              @RequestHeader (value="ciudad") String ciudad){
        return servicio.createPerson(nombre, edad, ciudad);
    }
}
