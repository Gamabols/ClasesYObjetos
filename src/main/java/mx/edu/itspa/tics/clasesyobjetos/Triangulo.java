
package mx.edu.itspa.tics.clasesyobjetos;

public class Triangulo {
    float base, altura;
    
    /**
     * Hace el calculo con variables asignadas en la clase
     * 
     * @return regresa el area de un triangulo
     */
    public float area(){
        return (float)((this.base * this.altura)/ 2.0);
    }
    
    /**
     * Hace el calculo con variables asignadas en el mismo metodo
     * 
     * @param base
     * @param altura
     * @return regresa el area de un triangulo
     */
    public float area(float base, float altura){
        return (float)((base * altura)/2);
    }
    
    /**
     * Hace el calculo con solo valores enteros
     * 
     * @param base
     * @param altura
     * @return regresa el area de un triangulo
     */
    public float area (int base, int altura){
        return (float)((base*altura)/2);
    }
    
}
