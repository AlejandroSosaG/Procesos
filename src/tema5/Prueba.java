package tema5;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {
        try {
            InetAddress direccion = InetAddress.getByName("ciclo.iesnervion.es");
            System.out.println("Direccion IP: " + direccion.getHostAddress());

            byte[] direccionIP = direccion.getAddress();
            System.out.println(Arrays.toString(direccionIP));
        }catch (UnknownHostException e){
            System.err.println("Error: no se encuentra la dirección de host");
            e.printStackTrace();
        }
    }
}