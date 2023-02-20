package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10; // al antemponer "final" ya no podemos modificar el valor de la variable
        // se convierte en una constante
        System.out.println("miVariable = " + miVariable);
        
//        Persona.MI_CONSTANTE = 5;
        System.out.println("MI_CONSTANTE = " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
//        persona1 = new Persona();
        persona1.setNombre("Emanuel");
        System.out.println("persona1 nombre = " + persona1.getNombre());
    }
}