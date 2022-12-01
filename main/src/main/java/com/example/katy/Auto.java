package com.example.katy;

public class Auto extends Vehiculos implements Combustible{ //extends ==  herencia / implements = interfaz
    private int puertas; //atributos
    private String marca;
    private boolean ceroKM;
    
    public Auto(){ //constructor con valores iniciales
        super();//trae el constructor de vehiculos
        this.puertas = 3;
        this.marca = "Ford";
        this.ceroKM = true;
    }

    public Auto(int newPuertas, String newMarcas, boolean newCeroKM, int newRuedas, Float newPeso, String newColor){ //constructor con parametros
        super(newRuedas, newPeso, newColor); 
        this.puertas = newPuertas;
        this.marca = newMarcas;
        this.ceroKM= newCeroKM;
    }

    @Override// permite que cambie el  combustible
    public String cargarCombustible(int litros){
        if (this.ceroKM){
            return Combustible.NAFTA+" " + litros +" Lts.";

        }
        return Combustible.GAS+" " + litros +" Lts.";
    }

    public int kilometraje(){
        if (this.ceroKM){
            return 0;
        }else{
            return 10000000;
        }
    }
}
