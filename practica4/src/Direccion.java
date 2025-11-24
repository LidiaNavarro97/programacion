public class Direccion {

    private String Calle;
    private int numero;
    private int codigoPostal;
    private String localidad;
    private String provincia;

    public Direccion(String Calle, int numero, int codigoPostal, String localidad, String provincia) {
        this.Calle = Calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.provincia = provincia;

    }

    //get


    public String getCalle() {
        return Calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }
    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    //set


    public void setCalle(String calle) {
        Calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

}
