/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Kelly
 */
public class Persona_KU {
    private  String NombreKU;
    private int EdadKU;
    private String DireccionKU;
    
    public Persona_KU(String NombreKU, int EdadKU, String DirreccionKU){
       this.NombreKU = NombreKU;
       this.EdadKU = EdadKU;
       this.DireccionKU = DirreccionKU;
    }
    
    public String getNombreKU(){
        return NombreKU;
    }
    
    public void setNombreKU(String NombreKU){
        this.NombreKU = NombreKU;
    }
    
    public int getEdadKU(){
        return EdadKU;
    }
    
    public void setEdadKU(int EdadKU){
        this.EdadKU = EdadKU;
    }
    
    public String getDirrecionKU(){
        return DireccionKU;
    }
    
    public void setDirrecionKU(String DirrecionKU){
        this.DireccionKU = DirrecionKU;
    }
            
    
}
