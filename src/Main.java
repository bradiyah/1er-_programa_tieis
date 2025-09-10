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
        }

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

        }
        System.out.print( "-----------------------------------\n");


        // Ejercicio 7

        int a= 2;
        int b= 3;

        if(a % 2 == 0){
            System.out.print("El numero es par");
        }
        System.out.print( "-----------------------------------\n");

        //Ejercicio 8:
        int c= 21;

        if (c>18){
            System.out.print ("El chico es mayor de edad");

        } else {
            System.out.print ("El chico es menor de edad");
        }


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

        }


        System.out.print( "-----------------------------------\n");

        //Ejercicio 10:
        int precioD = 90;
        boolean tieneDescuento = precioD>100;

        if (tieneDescuento) {
            double precioFinal = precioD * 0.90;
            System.out.print("Hay descuento");
        } else {
            System.out.print ("No hay descuento");
        }

        System.out.print( "-----------------------------------\n");



// Ejercicios basicos 2 Java:
        //Ej.1:
        String miNombre = ("Yele");
        System.out.print("Mi nombre es:" + miNombre + "\n");

      System.out.print("----------\n");
// Ej.2:
        int baseRectangulo = 8;
        int hREct = 12;

        int area = baseRectangulo * hREct;

        System.out.print ("El area del rectangulo es:" + area + "\n");
        System.out.print("----\n");

        //Ejercicio 3:
        int numA = 12;
        int numB = 18;
        if (numA <= numB) {
            System.out.print("El de 12 años es menor que el de 18" + "\n");
        }

        System.out.print("---\n");

        //Ejercicio 4:

        double X = 55.5;

        if (X>=60){
            System.out.print("El chico ha aprobado");
        } else {
            System.out.print("El chaval ha suspendido/reprobado" + "\n");
        }

        System.out.print("------\n");

         //Ej.5:
        double haceCalo = 28.5;
        if(haceCalo > 30){
            System.out.print("Hace calo");
        } else {
            System.out.print("Clima agradable" +"\n");
        }
        System.out.print("------\n");

        //Ej.6:
        int numX = -4;
        if (numX >=0){
            System.out.print("El numero es igual o superior a 0");
        } else{
            System.out.print("El numero esta por debajo de 0" + "\n");
        }

        System.out.print("----\n");

        //Ej.7:
        int numero1 = 24;
        double numeroDec = 22.5;
        int numero3 = 54;
        if(numero1 > numeroDec & numero1 < numero3){
            System.out.print ("El 24 es mayor que 22.5 pero " +
                    "menor que 54" + "\n");
        }

        System.out.print ("----\n");

        //Ej.8:
        double numSinDescuento = 52.5;
        boolean PrecioConDescuento = numSinDescuento>100;
        if (PrecioConDescuento){
            double  precioFinal1 = numSinDescuento * 0.20;
            System.out.print ("Tiene ud. un 20% off");
        } else{
            double precioFinal2 = numSinDescuento * 0.10;
            System.out.print("Se lleva un 10% off" + "\n");
        }
        System.out.print ("----\n");

        // Ej.9:
        boolean diaFest= false;
        if (diaFest) {
            System.out.print("Es festivo, yaaayyy!"); }
        else {
                System.out.print ("Es laborable, toca trabajar :(" + "\n");
            }

        System.out.print ("----\n");

        //Ej.10:
        int numEntero = 10;
        if (numEntero >1 & numEntero <=10) {
            System.out.print("El numero esta dentro del rango" + "\n");
        }

        System.out.print("---\n");
// Ejercicios_basicos_java_3:
        // Ej.1:
        int edad = 22;
        boolean esDeAqui= true;

        if ( esDeAqui & edad<18){
            System.out.print("Es ciudadano pero no puede votar..todavia"); }
            else {
                System.out.print ("Ahora si puede votar" + "\n");
            }


        System.out.print("---\n");

    //Ej.2:
        double notaFinal = 71.25;
        boolean fueAClase = true;

        if (notaFinal >= 60 && fueAClase) {
            System.out.print("Aprobado");
        } else {
            System.out.print("No aprobado o no fue a clase" + "\n");
        }

    }

    System.out.print("----\n");


}






