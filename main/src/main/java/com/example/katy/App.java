package com.example.katy; //carpeta principal

import java.util.Date;

public class App // clase publica llamada app
{
    public static void main( String[] args ) //void sin return
                                            // static: modulo estatico
                                            //String[] args : argumento del tipo string
    {
        System.out.println( "Hello World!" ); // salida por pantalla "hola mundo"
        System.out.println();//  escribo sout y sale esta linea

        //TIPOS
        int numero = 3;
        long numeroLong = 12345;
        long numeroLong2 = 12345L; //casteo rapido
        short numeroShort = 1;
        float numeroFloat = (float) 2.3; //hay que castear
        float numeroFloat2 =  2.3F; //casteo rapido
        double numeroDouble = 4.5;
        boolean bool =  true;
        boolean bool2 =  false;
        char caracter = 'k';

        Date fecha = new Date(); // trae fecha actual
        Date fecha2 = new Date(1700000000) ; //epochconverter.com para pasar una fecha especifica
        String palabra = "katherine";

        System.out.println(palabra);

        // control s --> para guardar

        funciones function = new funciones(); // traigo la clase entera de funciones
        System.out.println(function.suma(2, 10));
        function.saludo(palabra);

        Auto auto = new Auto();
        System.out.println(auto.kilometraje());
        Auto auto2 = new Auto(3, "fiat", false, 0, 500F, "rojo");
        System.out.println(auto2.kilometraje());
        System.out.println(auto.navegar());
        System.out.println(auto.cargarCombustible(10));
        System.out.println(auto2.cargarCombustible(50));
    }
}
