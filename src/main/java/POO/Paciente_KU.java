/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Kelly
 */
public class Paciente_KU {
       private int NroHistorialKU;
    private String EnfemedadKU;
    
     public Paciente_KU(int NroHistorialKU, String EnfemedadKU ,String NombreKU, int EdadKU, String DirreccionKU ){
       this.NroHistorialKU= NroHistorialKU ;
       this.EnfemedadKU = EnfemedadKU ;
   }
   
   public int getNroHistorialKU(){
       return NroHistorialKU;
   }
   
   public void setNroHistorialKU(int NroHistorialKU){
       this.NroHistorialKU = NroHistorialKU;
   }
   
   public String getAnosEnfemedadKU(){
       return EnfemedadKU;
   }
   
   public void setEnfemedadKU(String EnfemedadKU){
       this.EnfemedadKU = EnfemedadKU;
   }
   
}
   