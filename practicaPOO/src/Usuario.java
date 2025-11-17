public class Usuario {

    //Primero los parametros (atributos), declaramos con private
    private String nombre;
    private String apellidos;
    private int codigoPostal;
    private String direccion;
    private String email;
    private String contrasena;

    //Segundo el constructor, se tiene que llamar igual que la clase y no devolver nada
    public Usuario(String n,String a,int cp,String d,String e,String c) {
        this.nombre = n;
        this.apellidos = a;
        this.codigoPostal= cp;
        this.direccion = d;
        this.email = e;
        this.contrasena= c;
    }

    //Tercero el metodo get, de cada atributo
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCodigoPostal() {
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

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //requisito if en setEmail
    public void setEmail(String nuevoEmail) {
        if (nuevoEmail.contains("@")) {
            this.email = nuevoEmail;
        } else {
            System.out.println("Error: Email inválido porque no contiene @.");
        }
    }

    //setContrasena con validación mínima de longitud
    public void setContrasena(String contrasena){
            if (contrasena.length() >= 6) {
                this.contrasena = contrasena;
            } else {
                System.out.println("Error: La contraseña debe tener al menos 6 caracteres.");
            }
        }

        //metodo de autenticacion

        public boolean checkUsuario(String email, String contrasena) {
            return this.email.equals(email) && this.contrasena.equals(contrasena)?true:false;
        }

        //metodo de representacion
                public String toString() {
            return "Usuario: " + this.nombre + " " + this.apellidos + "\nDireccion: " + this.direccion+ "\nEmail: " + email + "\nCódigo postal: " + codigoPostal;
        }
}

