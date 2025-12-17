//clase equipamiento
//atributos:
//-nombre, codigo, fecha_adquisicion(basado en el año)
//añadir una coleccion a la clase area de equipamiento
//que devuelva si un equipamiento tiene mas de 10 años devuelva true
//si tiene menos que devuelva false
//metodo: esAntiguo


public class Equipamiento {
    private String nombre;
    private String codigo;
    private int fecha_adquisicion;

    public Equipamiento(String nombre, String codigo, int fecha_adquisicion) {

        this.nombre = nombre;
        this.codigo = codigo;
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public boolean esAntiguo () {
        return (2025 - fecha_adquisicion) > 10;
    }
}
