public class Usuario {

    //Primero los parametros, declaramos con private
    private String nombre;
    private String apellidos;
    private String codigoPostal;
    private String direccion;
    private String email;
    private String contrasena;

    //Segundo el constructor, se tiene que llamar igual que la clase y no devolver nada
    public Usuario(String nombre,String apellidos,String codigoPostal,String direccion,String email,String contrasena)

    //Tercero el metodo get, de cada atributo
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasena() {
        return contrasena;
    }

    //Cuarto el metodo set de cada atributo


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //requisito if en setEmail
    public void setEmail(String nuevoEmail) {
        if (nuevoEmail != null && nuevoEmail.contains("@")) {
            this.email = nuevoEmail;
    } else {
            System.out.println("Error: Email inválido porque no contiene @.");
        }

    //
    public void setContrasena(String contrasena){
            if (contrasena != null && contrasena.length() >= 6) {
                this.contrasena = contrasena;
            } else {
                System.out.println("Error: La contraseña debe tener al menos 6 caracteres.");
            }

        }

}
}
