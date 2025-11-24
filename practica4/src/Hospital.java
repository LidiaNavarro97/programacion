import java.awt.geom.Area;
import java.util.ArrayList;

public class Hospital {

    private String nombre;
    private String CIF;
    private ArrayList<Areas> areas;
    private String direccion;


    public Hospital(String nombre, String CIF, String direccion) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.areas = new ArrayList<>();
    }
    //get
    public ArrayList<Areas> getAreas() {
        return this.areas;
    }
    public String getNombre() {
        return nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public String getDireccion() {
        return direccion;
    }

    //set


    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public void setAreas(ArrayList<Areas> areas) {
        this.areas = areas;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    //Agregar area
    public void agregarArea(Areas a) {
        this.areas.add(a);
    }

    //CALCULO AGREGADO

    public int getNumeroTotalMedicos(){
        int total = 0;
        for (Areas area : areas) {
            total += area.getNumMedicos();
    }
        return total;
}

    //CALCULO DE PROPORCION

    public double getProporcionMedicosAreas(String idArea) {
        Areas area = buscarArea(idArea);
        if (area != null && getNumeroTotalMedicos()>0) {
            return (double) area.getNumMedicos() / getNumeroTotalMedicos();
        }
        return 0;
    }

    //Agregar BUSCAR AREA

    public Areas buscarArea(String idArea) {
        for (Areas area : areas) {
            if (area.getIdentificador().equals(idArea)) return area;
        }
        return null;
    }

    //COMPROBACION DE EXISTENCIA

    public boolean existeArea(String idArea) {
        return buscarArea(idArea) != null;
    }

    public String toString() {
        return this.nombre + "(" + this.CIF + ") " + this.direccion;
    }


}
