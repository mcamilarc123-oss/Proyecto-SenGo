package sengo;
import java.util.ArrayList;

public class SenGo_Main {
    
   
    
    public static void main(String[] args) {
       
        // POLIMORFISMO 1
        Usuario usuario1 = new AdultoMayor("12345678", "1234", "Juan Pérez", 65);
        Usuario usuario2 = new Cliente("87654321", "4321", "María González");
        
        System.out.println(usuario1.getTipoUsuario());
        System.out.println(usuario2.getTipoUsuario());
        
        
        // POLIMORFISMO 2
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new AdultoMayor("11111111", "1111", "Carlos Ruiz", 68));
        usuarios.add(new Cliente("22222222", "2222", "Ana Martínez"));
        
        for (Usuario u : usuarios) {
            System.out.println(u.getNombre() + " - " + u.getTipoUsuario());
        }
        
        
        // POLIMORFISMO 3
        AdultoMayor adulto = new AdultoMayor("33333333", "3333", "Pedro López", 70);
        Cliente cliente = new Cliente("44444444", "4444", "Luis Torres");
        
        mostrarInfo(adulto);
        mostrarInfo(cliente);
        
        
        // POLIMORFISMO 4
        Usuario usuario = new AdultoMayor("55555555", "5555", "Rosa Silva", 72);
        
        if (usuario instanceof AdultoMayor) {
            AdultoMayor am = (AdultoMayor) usuario;
            System.out.println("Es adulto mayor: " + am.getNombre());
        }
        
        
        // POLIMORFISMO 5
        Usuario nuevoUsuario = crearUsuario("66666666", "6666", "Elena Castro", true);
        System.out.println(nuevoUsuario.getTipoUsuario());
        
        
        // POLIMORFISMO 6
        Usuario[] array = new Usuario[2];
        array[0] = new AdultoMayor("77777777", "7777", "Miguel Ángel", 69);
        array[1] = new Cliente("88888888", "8888", "Patricia Vega");
        
        for (Usuario u : array) {
            System.out.println(u.getTipoUsuario());
        }
    }
    
    // Método para polimorfismo 3
    public static void mostrarInfo(Usuario usuario) {
        System.out.println("Usuario: " + usuario.getNombre());
    }
    
    // Método para polimorfismo 5
    public static Usuario crearUsuario(String cedula, String clave, 
                                       String nombre, boolean esAdulto) {
        if (esAdulto) {
            return new AdultoMayor(cedula, clave, nombre, 65);
        } else {
            return new Cliente(cedula, clave, nombre);
}

    }
    
}
  