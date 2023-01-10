package tema5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
    public static void main(String[] args) {
        try {
            InetAddress direccion = InetAddress.getLocalHost();
            Socket socketClliente = new Socket(direccion, 50000);
            System.out.println("Sevidor: Abriendo flujos de entrada y salida");
            OutputStream os = socketClliente.getOutputStream();
            InputStream is = socketClliente.getInputStream();
            System.out.println("Cliente: Envia mensaje al servidor con 14");
            os.write(14);
            System.out.println("Cliente: lectura del mensaje del servidor");
            System.out.println("Mensaje recibido por servidor: " + is.read());
            is.close();
            os.close();
            socketClliente.close();
        }catch (UnknownHostException e) {
            System.err.println("Error");
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
