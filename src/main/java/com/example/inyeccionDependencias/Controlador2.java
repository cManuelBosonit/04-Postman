package com.example.inyeccionDependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {

    //Llamar servicio
    @Autowired
    Servicio servicio;

    //POST
    //http://localhost:8080/controlador2/getPersona
    //Obtiene el objeto persona y lo devuvle con la edad duplicada
    @PostMapping("/controlador2/getPersona")
    public Persona getPersona(){
        Persona persona = servicio.getPersona();
        persona.setEdad(persona.getEdad()*2);
        return persona;
    }
}
