package adaitw.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Persona> mapaPersonas = new HashMap<>();

        Persona p1 = new Persona(123123, "Pablo", "abcabc", 23);
        Persona p2 = new Persona(223344, "Teresa", "ffff", 43);
        Persona p3 = new Persona(333123, "Angel", "eeee", 54);
        Persona p4 = new Persona(987123, "Miguel", "tttt", 32);

        agregarPersonaAlMapa(mapaPersonas,p1);
        agregarPersonaAlMapa(mapaPersonas,p2);
        agregarPersonaAlMapa(mapaPersonas,p3);
        agregarPersonaAlMapa(mapaPersonas,p4);

        mapaPersonas.put(123123, new Persona(156, "otro nombre", "otra direccion", 33 ));
        Persona nuevaP = mapaPersonas.get(123123);
       // mapaPersonas.remove(123123);

        System.out.println("Nueva persona: "+nuevaP);

        mapaPersonas.forEach(
                (dni, persona) -> System.out.println("DNI: "+dni+"-"+persona)
        );

    }

    private static void agregarPersonaAlMapa(Map<Integer, Persona> mapaPersonas, Persona p) {
        mapaPersonas.put(p.getDni(), p);
    }
}