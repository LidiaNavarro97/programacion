public class Areas {

    private String nombre;
    private String identificador;
    private int planta;
    private Hospital hospital;
    private int numMedicos;

    public Areas (String nombre, String identificador, int planta, Hospital hospital) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.planta = planta;
        this.hospital = hospital;
        this.numMedicos = 0;
    }

        //get

    public String getNombre() {
        return nombre;
    }
    public int getNumMedicos() {
        return numMedicos;
    }
    public String getIdentificador() {
        return identificador;
    }
    public Hospital getHospital() {
        return hospital;
    }
    public int getPlanta() {
        return planta;
    }

    //set


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumMedicos(int numMedicos) {
        this.numMedicos = numMedicos;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    //Aumentar y decrementar Medico

    public void aumentarMedicos() {
        this.numMedicos++;
    }

    public void decrementarMedicos() {
        this.numMedicos--;
    }


    //COMPROBACION Y COMPARACION

    public String compararMedicos(Areas otraArea) {
        if (this.numMedicos > otraArea.numMedicos) {
            return "El área " + this.nombre + " tiene más médicos que " + otraArea.nombre + ".";
        } else if (this.numMedicos < otraArea.numMedicos) {
            return "El área " + otraArea.nombre + " tiene más médicos que " + this.nombre + ".";
        } else {
            return "Ambas áreas tienen el mismo número de médicos.";
        }
    }

 //Calculo CAPACIDAD

    public int calcularCapacidadRestante(int capacidadMaxima) {
        return capacidadMaxima - this.numMedicos;
    }
}




