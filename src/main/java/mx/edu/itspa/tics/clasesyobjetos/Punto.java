
package mx.edu.itspa.tics.clasesyobjetos;

public class Punto {
    int x;
    int y;
    
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Punto(){
    
    }
    
    public void imprimePunto(){
        System.out.println("Punto [x=" + x + ",y=" + y + "]");
    }
    
}
