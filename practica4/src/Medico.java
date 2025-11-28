import java.time.LocalDate;

public class Medico {
    private String nombre;
    private Areas area;
    private String DNI;
    private int edad;
    private String sexo;
    private double sueldoBruto;
    private LocalDate fechaInicio;
    private Areas nuevaArea;

    public Medico(String nombre, Areas area, String DNI, int edad, String sexo, double sueldoBruto, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.area = area;
        this.DNI = DNI;
        this.edad = edad;
        this.sexo = sexo;
        this.sueldoBruto = sueldoBruto;
        this.fechaInicio = fechaInicio;

        area.aumentarMedicos();
    }

    //get


    public String getNombre() {
        return nombre;
    }

    public Areas getArea() {
        return area;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public LocalDate getFecha() {
        return fechaInicio;
    }

    public Areas getNuevaArea() {
        return nuevaArea;
    }


    //SET


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFecha(LocalDate fecha) {
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public void setNuevaArea(Areas nuevaArea) {
        this.nuevaArea = nuevaArea;
    }

    //Calculo SUELDO NETO

    public double calcularSueldoNeto(double retencion) {
        return this.sueldoBruto - (this.sueldoBruto * retencion / 100);
    }

    //Calculo ANTIGUEDAD

    public int getAniosAntiguedad() {
        int i = 2025 - this.fechaInicio;
        return i;
    }

    //Calculo IMPUESTOS ANUALES
    public double calcularImpuestosAnuales(double tasaImpositiva) {
        return this.sueldoBruto * (tasaImpositiva / 100);
    }

    //COMPROBACION EDAD
    public boolean esMayorDeEdad(int mayoriaEdad) {
        return this.edad >= mayoriaEdad;
    }

    //Calculo AUMENTO

    public double proximoAumento(double porcentajeAumento, int aniosRequeridos) {
        if (getAniosAntiguedad() >= aniosRequeridos) {
            return this.sueldoBruto + (this.sueldoBruto * porcentajeAumento / 100);
        }
        return this.sueldoBruto;
    }

    // GESTION DE AREA

    public void cambiarArea(Areas nuevaArea) {
        if (this.area != null) {
            this.area.decrementarMedicos();
        }
        nuevaArea.aumentarMedicos();
        this.area = nuevaArea;
    }
}










