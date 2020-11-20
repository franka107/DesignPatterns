package org.example.model;

public class Conexion {
    private static Conexion instancia;

    private Conexion(){

    }

    public static Conexion getInstancia(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }

    public void conectar() {
        System.out.println("Me conecta a la base de datos");
    }
     public void desconectar(){
         System.out.println("Me desconecte de la Base de datos");
     }
}
