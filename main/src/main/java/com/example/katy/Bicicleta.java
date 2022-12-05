package com.example.katy;

public class Bicicleta extends Vehiculos{
    private int rodado;
    private boolean conMotor;
    private String material;
  
    public Bicicleta(){ //constructor con valores iniciales
        super();//trae el constructor de vehiculos
        this.rodado = 16;
        this.conMotor = false;
        this.material = "aluminio";
    }

    public Bicicleta(int newRodado, Boolean newConMotor, String newMaterial, int newRuedas, float newPeso, String newColor){ //constructor con parametros
        super(newRuedas, newPeso, newColor); 
        this.rodado = newRodado;
        this.conMotor = newConMotor;
        this.material= newMaterial;
    }
     
    public String toString(){
        return this.material + " " + this.rodado + " " + this.conMotor + " " ;
    }
}
