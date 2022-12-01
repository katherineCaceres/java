package com.example.katy;

public interface Combustible {// interface,define el tipo de las funciones y las constantes
    public static String DIESEL="Diesel";//static: hace que no se pueda modificar
    public String GAS = "Gas";
    public String NAFTA = "Nafta";

    public abstract String cargarCombustible(int litros);//abstract hace que si o si lo tenga que usar
}
