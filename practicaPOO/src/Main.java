public class Main {
    public static void main(String[] args) {

        Usuario user1 = new Usuario("Carlos", "Gómez", 28010, "Calle Velazquez 12", "carlos@gmail.com", "holamundo2");
        Usuario user2 = new Usuario("Lucía", "Pérez", 41005, "Calle Sevilla 45", "lucia@gmail.com", "holamundo3");
        Usuario user3 = new Usuario("Miguel", "Santos", 11405, "Calle Ronda 8", "miguel@gmail.com", "holamundo4");

        //Almaceno los usuarios en un array
        Usuario[] usuarios = {user1, user2, user3};

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i].toString());
            System.out.println("------------------------");
        }

        // metodo validar registro
        validarRegistro(usuarios);

        // Intento 1: Acceso correcto
        System.out.println("\nIntento de acceso 1: ");
        boolean acceso1 = user1.checkUsuario("carlos@gmail.com", "holamundo2");

        if (acceso1) {
            System.out.println("Acceso concedido a " + user1.getNombre());
        }

        // Intento 2: Acceso fallido (contraseña incorrecta)
        System.out.println("\nIntento de acceso 2: ");
        boolean acceso2 = user2.checkUsuario("lucia@gmail.com", "contraseñaIncorrecta");

        if (!acceso2) {
            System.out.println("ERROR: Contraseña incorrecta para " + user2.getEmail() + ". Acceso denegado.");
        }
    }

    //
    public static void validarRegistro(Usuario[] usuarios) {
        for (Usuario u : usuarios) {
            int cp = u.getCodigoPostal();

            if (cp / 1000 == 28) {
                System.out.println("Usuario " + u.getNombre() + ": Código Postal Válido (" + cp + ")");
            } else {
                System.out.println("ERROR: Usuario " + u.getNombre() + " -> Bloqueado. Código Postal NO Válido: (" + cp + ")");
            }
        }
    }
}