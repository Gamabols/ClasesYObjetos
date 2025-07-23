
package ParentClassOutside;

import ParentClass.ParentClassPublic;

public class OtherClassPublicOutside {
    public void testAccess(){
        ParentClassPublic p = new ParentClassPublic();
        
        System.out.println("Name: "+ p.name);
        System.out.println("Edad: "+ p.edad);
        System.out.println("Vivo: "+ p.vivo);
        System.out.println("Color Favorito: "+ p.colorFavorito);
    }
    }

