package cl.awakelab.camaraSecreta;

import java.awt.List;
import java.util.ArrayList;
import cl.awakelab.pks.*;
import cl.awakelab.firstLine.*;
public class Tablero {
    //constante
    public final static int CAPACIDAD_POR_DEFECTO = 18;
    
    //atributos
    private ArrayList<Carro> carros;
    private ArrayList<Huevo> lanzamientos;
    
    //constructores
    public Tablero() {
        
    }
    public Tablero(List Carro, List huevo) {
        this.carros = new ArrayList<Carro>();
        this.lanzamientos = new ArrayList<Huevo>();
    }
    public ArrayList<Carro> getCarros() {
        return carros;
    }
    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }
    public ArrayList<Huevo> getLanzamientos() {
        return lanzamientos;
    }
    public void setLanzamientos(ArrayList<Huevo> lanzamientos) {
        this.lanzamientos = lanzamientos;
    }
    @Override
    public String toString() {
        return "Tablero [carros=" + carros + ", lanzamientos=" + lanzamientos + "]";
    }
    
}
