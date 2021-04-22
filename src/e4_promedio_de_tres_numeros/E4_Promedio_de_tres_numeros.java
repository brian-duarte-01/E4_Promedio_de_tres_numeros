
package e4_promedio_de_tres_numeros;

import java.util.Scanner;

public class E4_Promedio_de_tres_numeros {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        //declaracion de variables
        int calificacion1;
        int calificacion2;
        int calificacion3;
        int promedio;
        //entrada de datos
        System.out.println("ingrese la primer nota");
        calificacion1=in.nextInt();
        System.out.println("ingrese la segunda nota");
        calificacion2=in.nextInt();
        System.out.println("ingrese la tercer nota");
        calificacion3=in.nextInt();
        //procedimiento
        promedio=(calificacion1+calificacion2+calificacion3)/3;
        //salida de datos
        System.out.println("el promedio es: "+promedio);
        
        
    }
    
}
