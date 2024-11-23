/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Kelly
 */
public class Medico_KU {
     private String EspecialidadKU;
    private int AnosExperienciaKU;
    
    
   public Medico_KU(String EspecialidadKU, int AnosExperienciaKU,String NombreKU, int EdadKU, String DirreccionKU ){
       this.EspecialidadKU = EspecialidadKU;
       this.AnosExperienciaKU = AnosExperienciaKU;
   }
   
   public String getEspecialidadKU(){
       return EspecialidadKU;
   }
   
   public void setEspecialidadKU(String EspecialidadKU){
       this.EspecialidadKU = EspecialidadKU;
   }
   
   public int getAnosExperienciaKU(){
       return AnosExperienciaKU;
   }
   
   public void setAnosExperienciaKU(int AnosExperienciaKU){
       this.AnosExperienciaKU = AnosExperienciaKU;
   }
   
}

    