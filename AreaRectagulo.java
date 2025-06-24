/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areatriangulo;

/*
 * Este programa calcula el área de un rectángulo.
 * Permite al usuario ingresar la base y la altura del rectángulo,
 * y luego muestra el resultado del cálculo.
 */
public class AreaTRIANGULO {
 public static void main(String[] args) {
        // Declaración de variables
        float base_rectangulo;
        float altura_rectangulo;
        float area_rectangulo;
        
        // Creación de un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la base y la altura del rectángulo
        System.out.print("Ingrese la base del rectángulo (en cm): ");
        base_rectangulo = input.nextFloat();
        
        System.out.print("Ingrese la altura del rectángulo (en cm): ");
        altura_rectangulo = input.nextFloat();
        
        // Calcular el área del rectángulo
        area_rectangulo = base_rectangulo * altura_rectangulo;
        
        // Mostrar el resultado
        System.out.println("El área del rectángulo es: " + area_rectangulo + " cm²");
    }
}
