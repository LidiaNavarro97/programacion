public class Main {
    public static void main(String[] args) {

        Usuario user = new Usuario(
                "Lidia",
                "Gonzalez",
                11405,
                "Calle Caulina",
                "lnavest@gmail.com",
                "holamundo"
        );

        System.out.println(user.getNombre());
        user.setNombre("Pablo");
        System.out.println(user.getNombre());

        System.out.println(user.getEmail());
        user.setEmail("hola@lidia");
        System.out.println(user.getEmail());

        System.out.println(user.toString());

        System.out.println(user.checkUsuario("lnavest@gmail.com", "holamundo"));


    }
}