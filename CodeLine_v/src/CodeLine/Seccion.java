/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeLine;

/**
 *
 * @author efrai
 */
class Seccion {
    
    private String tipo;
    private int avance;
    
   public Seccion (String tp, int av) {
       avance = av;
       tipo = tp;
   }
    
    public boolean anadirSeccion () {
        
    }
    
    public Seccion buscaSeccion () {
        
    }
    
    public void modificaAvance (int mod) {
        this.avance += mod;
    }
}
