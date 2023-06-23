/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Figura;
import java.util.Scanner;


public class FiguraService {
    
    public Figura createFigura(){
        Figura fig = new Figura();
        Scanner read= new Scanner (System.in);
        int tipo;
        
        do {
            System.out.println("Eliga el tipo de figura: 1-Cuadrado; 2-Triángulo; 3-Círculo");
            tipo=read.nextInt();
        } while (tipo<1 || tipo>3);
        
      
        switch (tipo) {
            case 1:
                System.out.println("Ingrese el lado del cuadrado:");
                int lado=read.nextInt();
                fig.setPerimetro(lado*4);
                fig.setArea(lado*lado);
                break;
            case 2:
                System.out.println("Ingrese la base del triángulo:");
                int base=read.nextInt();
                System.out.println("Ingrese el lado 1 del triángulo:");
                int l1=read.nextInt();
                System.out.println("Ingrese el lado 2 del triángulo:");
                int l2=read.nextInt();
                System.out.println("Ingrese la altura del triángulo:");
                int altura=read.nextInt();
                
                fig.setPerimetro(base+l1+l2);
                fig.setArea(base*altura/2);
                break;
                
            case 3:
                System.out.println("Ingrese el radio del círculo:");
                int radio=read.nextInt();
                
                fig.setPerimetro(Math.PI*radio*2);
                fig.setArea(Math.PI*radio*radio);
                break;
        }
        
        
        return fig;
    }
    
    public void imprimirFigura(Figura fig){
        System.out.println("El perímetro de la figura es:" + fig.getPerimetro());
        System.out.println("El área de la figura es:" + fig.getArea());
    }
}
