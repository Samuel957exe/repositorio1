/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author developer
 */
import java.time.LocalDate;


public class TFC {
    //atributos
    String nombre;
    String apellido1;
    String apellido2;
    String nom_trabajo;
    LocalDate fecha;
    String resumen;
   
    //constructor 1
        TFC (String nombre,String apellido1,String apellido2){
            
                       this.nombre=nombre;
                       this.apellido1=apellido1;
                       this.apellido2=apellido2;
            
    }
        
    //Constructor2
        
        TFC (String nombre,String apellido1,String apellido2,String nom_trabajo,LocalDate fecha, String resumen){
                       this.nombre=nombre;
                       this.apellido1=apellido1;
                       this.apellido2=apellido2;
                       this.nom_trabajo=nom_trabajo;
                       this.fecha=fecha;
                       this.resumen=resumen;
                       
        }
    
        
        //metodos
        
        
        public String getNombrePersona(){
        return nombre;
        }
        
        public String getApellido1(){
        return apellido1;
        
        }
        
        
        public String getApellido2(){
        return apellido2;
        
        }
        
        public String getNombreTrabajo(){
        
            return nom_trabajo;
               
        }
        
        public LocalDate getFechaCreacion(){
        return fecha;
        
        }
        
        public String getResumen(){
        return resumen;
        
        
        }
        
        
        
        
        public void setNombrePersona(String nombre){
        this.nombre=nombre;
              
        }
        
        public void setApellido1(String apellido1){
        this.apellido1=apellido1;
        }
        
        public void setApellido2(String apellido2){
        this.apellido2=apellido2;
               
        }
        
        public void setNombreTrabajo(String nom_trabajo){
        this.nom_trabajo=nom_trabajo;
        
        }
        
        public void setFechaCreacion(LocalDate fecha){
        this.fecha=fecha;
        
        }
        
        public void setResumen(String resumen){
        this.resumen=resumen;
        
        }
        
        
        //otros metodos
        
        public String inicialesAutor(){
        if (nombre==null || nombre.length() == 0 && apellido1==null || apellido1.length() == 0 && apellido2==null || apellido2.length() == 0){
            return null;
            
        } else {
       nombre = nombre.substring(0,1);
       apellido1 = apellido1.substring(0,1);
       apellido2 = apellido2.substring(0,1);
        return (nombre + apellido1 + apellido2);
        }
        
   
        }
        
        
        
        public String autorEnLEtrasCapitales(){
        
        return (nombre+" "+apellido1+" "+apellido2);   
                
        }
        
        
       

    
}
