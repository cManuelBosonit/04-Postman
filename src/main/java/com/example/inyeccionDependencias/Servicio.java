package com.example.inyeccionDependencias;

import org.springframework.stereotype.Service;

@Service
public class Servicio {

    Persona persona = new Persona();

    //Metodo para rellenar un objeto persona
    public Persona createPerson(String nombre, int edad, String ciudad){
        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setCiudad(ciudad);
        return persona;
    }

    public Persona getPersona(){
        return persona;
    }
}
