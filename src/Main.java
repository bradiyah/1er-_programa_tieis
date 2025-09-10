//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nombre_1= "Jeanette";
        String nombre_2= "Yele";

        String nombresUnidos = nombre_1 +  " " + nombre_2 + "\n";

        System.out.print( nombresUnidos);
        System.out.print( "-----------------------------------\n");


        //segundo ejercicio

        double PI  = 3.1416;
        int r  = 5;
        int resultadoArea= r*=PI*=r;

        System.out.print(resultadoArea);

        System.out.print( "-----------------------------------\n");




        //Ejercicio 3 & 4:

        int numeroEntero= 1;
        if (numeroEntero >=0) {
            System.out.print ("El numero es positivo:");
        } else {
            System.out.print ("El numero NO es positivo");
        };

        System.out.print( "-----------------------------------\n");


        //Ejercicio 5:

        int Aprobado = 95;


        if (Aprobado >= 90) {
            System.out.print ("El chico tieneun sobresaliente");
        } else {
            System.out.print ("Es menor de 90");
        } if (Aprobado >=70 & Aprobado<90) {
            System.out.print ("El chico esta aprobado");


        } if ( Aprobado <70){
            System.out.print ("El chico no estudio");
        }


        System.out.print( "-----------------------------------\n");
// Ejercicio 6:

        int NumeroA = 5;
        int NumeroB = 10;

        if (10>5){
            System.out.print ("10 mayor que 5");

        };
        System.out.print( "-----------------------------------\n");


        // Ejercicio 7

        int a= 2;
        int b= 3;

        if(a % 2 == 0){
            System.out.print("El numero es par");
        };
        System.out.print( "-----------------------------------\n");

        //Ejercicio 8:
        int c= 21;

        if (c>18){
            System.out.print ("El chico es mayor de edad");

        } else {
            System.out.print ("El chico es menor de edad");
        };


        System.out.print( "-----------------------------------\n");
 // Ejercicio 9:
        String diaSem= "miercoles";
        switch (diaSem) {
            case "lunes":
                System.out.print("Es lunes ");
                break;

            case "martes":
                System.out.print("Es martes");
                break;

            case "miercoles":
                System.out.print("Es miercoles, yaaay!!!");
                break;

        };


        System.out.print( "-----------------------------------\n");

        //Ejercicio 10:
        int precioD = 100;

        if (precioD>100){
            System.out.print ("El chico es mayor de edad");








    }
}