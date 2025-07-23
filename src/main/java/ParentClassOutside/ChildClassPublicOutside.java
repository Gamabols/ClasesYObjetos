
package ParentClassOutside;

import ParentClass.ParentClassPublic;

public class ChildClassPublicOutside extends ParentClassPublic {
    public String toString(){
        return "Name: " + name +
                " / Edad: " + edad +
                " / vivo: " + vivo +
                " / Color Favorito: " + colorFavorito;
    }
} 
