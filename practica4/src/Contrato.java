public class Contrato {

    private int fecha;
    private Medico Medico;
    private Hospital Hospital;

    public Contrato(int fecha, Medico medico, Hospital hospital) {

        this.fecha = fecha;
        this.Medico = medico;
        this.Hospital = hospital;
    }

    //get


    public int getFecha() {
        return fecha;
    }

    public Medico getMedico() {
        return Medico;
    }

    public Hospital getHospital() {
        return Hospital;
    }

    //SET


    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setMedico(Medico medico) {
        Medico = medico;
    }

    public void setHospital(Hospital hospital) {
        Hospital = hospital;
    }


    // COMPROBACION DE AÑO

    public boolean esDeAnio(int anio) {
        if (fecha == anio) {
            return true;
        } else {
            return false;
        }
    }

   //CALCULO DE VIGENCIA

    public int diasDesdeCreacion(int fechaHoyAnio, int fechaCreacionAnio) {
        return 365 * (fechaCreacionAnio - fechaHoyAnio);
    }

    public String toString() {
        return "CONTRATO: " +
    }



}
