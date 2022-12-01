package com.example.katy;

public class Vehiculos {
    private int  ruedas;
    private Float peso;
    private String color;


    public Vehiculos(){ //constructor con valores iniciales
      this.ruedas=4;
      this.peso= 500F;// F para float
      this.color="rojo";
    }
    
    public Vehiculos(int newRuedas, Float newPeso, String newColor){ //constructor con parametros
        this.ruedas=newRuedas; 
        this.peso= newPeso;
        this.color=newColor;
    }

    public String navegar(){
        if (this.ruedas <1){
            return "Navegable"; 
        }
        return "No es navegable";
        
    }
}
 
