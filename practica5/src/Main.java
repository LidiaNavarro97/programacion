
import com.juego.modelo.*;
import com.juego.clases.*;
import com.juego.razas.*;

public class Main {

    public static void main(String[] args) {

        Clase guerrero = new Guerrero();
        Clase mago = new Mago();

        Raza humano = new Humano();
        Raza elfo = new Elfo();

        Personaje p1 = new Personaje("Ozuna", guerrero, humano);
        Personaje p2 = new Personaje("Rubio", mago, elfo);

        Combate combate = new Combate(p1, p2);
        combate.combate1();
    }
}