package CodeLine;
class Seccion {
    
    private final String tipo;
    private int avance;
    
   public Seccion (String tp, int av) {
       avance = av;
       tipo = tp;
   }
    
    public boolean anadirSeccion () {
        return false;     
    }
    
    public Seccion buscaSeccion () {
        return null; 
    }
    
    public void modificaAvance (int mod) {
        this.avance += mod;
    }
}
