import java.time.LocalDate;

public class Contrato {

    private LocalDate fechaCreacion;
    private Medico Medico;
    private Hospital Hospital;

    public Contrato(LocalDate fechaCreacion, Medico medico, Hospital hospital) {

        this.fechaCreacion = fechaCreacion;
        this.Medico = medico;
        this.Hospital = hospital;
    }

    //get


    public LocalDate getFecha() {
        return fechaCreacion;
    }

    public Medico getMedico() {
        return Medico;
    }

    public Hospital getHospital() {
        return Hospital;
    }

    //SET


    public void setFecha(LocalDate fecha) {
        this.fechaCreacion = fecha;
    }

    public void setMedico(Medico medico) {
        Medico = medico;
    }

    public void setHospital(Hospital hospital) {
        Hospital = hospital;
    }


    // COMPROBACION DE AÑO

    public boolean esDeAnio(int anio) {
        return fechaCreacion.getYear() == anio;
    }


    //CALCULO DE VIGENCIA

    public int diasDesdeCreacion(int fechaHoyAnio, int fechaCreacionAnio) {
        return 365 * (fechaCreacionAnio - fechaHoyAnio);
    }

    public String toString() {
        return "CONTRATO: " +
    }



}
