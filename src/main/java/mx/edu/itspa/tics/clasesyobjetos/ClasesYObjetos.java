
package mx.edu.itspa.tics.clasesyobjetos;

public class ClasesYObjetos {

    public static void main(String[] args) {
        Punto p = new Punto(5, 8);
        p.x=5;
        p.y=8;
        p.imprimePunto();
        
        Punto q = new Punto();
        q.x=7;
        q.y=2;
        q.imprimePunto();
        
        //Area de un triangulo y sobrecarga de metodos
        Triangulo triangulo = new Triangulo();
        triangulo.base = 5;
        triangulo.altura = 8;
        
        System.out.println("Base: " + triangulo.base);
        System.out.println("Altura: " + triangulo.altura);
        
        //metodo area sobrecargado
        System.out.println("area() -> " + triangulo.area());
        System.out.println("area (6,2) -> " + triangulo.area(6, 2));
        System.out.println("area (5.5f, 3.2f) -> " + triangulo.area(5.5f, 3.2f));
        
        //Metodo static (Circulo)
        System.out.println(Circulo.PI);
    }
}
