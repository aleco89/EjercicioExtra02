/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra02;

import entidades.Figura;
import servicios.FiguraService;

public class EjercicioExtra02 {

    
    public static void main(String[] args) {
        FiguraService fs= new FiguraService();
        
        Figura f1=fs.createFigura();
        Figura f2=fs.createFigura();
        Figura f3=fs.createFigura();
        
        System.out.println("Figura 1:");
        fs.imprimirFigura(f1);
        System.out.println("Figura 2:");
        fs.imprimirFigura(f2);
        System.out.println("Figura 3:");
        fs.imprimirFigura(f3);
    }
    
}
