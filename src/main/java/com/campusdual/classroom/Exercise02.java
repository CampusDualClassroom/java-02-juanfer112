package com.campusdual.classroom;

public class Exercise02 {

    public static void main(String[] args) {
        double r = 15;
        double a, l;

        // TODO: ↓ Fórmula del área de un círculoS: a = radio * radio * Número PI
        a = calculateCircleArea(r);

        System.out.println("Area: " + a);

        // TODO: ↓ Fórmula de la longitud de una circunferencia: l = 2 * radio * Número PI
        l = CalculateCircunference(r);

        System.out.println("Longitud:  " + l);

    }
    // Método para calcular el área del círculo
    private static double calculateCircleArea(double radius) {
        return Math.PI*Math.pow(radius,2);
    }

    // Método para calcular la circunferencia
    private static double CalculateCircunference(double radius) {
        return 2*Math.PI*radius;
    }

}
