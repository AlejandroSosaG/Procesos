package tema5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        try {
            System.out.println("Sevidor: Abriendo conexión");
            ServerSocket socketServidor = new ServerSocket(50000);
            System.out.println("Sevidor: aceptando conexión");
            Socket socketCliente = socketServidor.accept();
            System.out.println("Sevidor: Abriendo flujos de entrada y salida");
            InputStream is = socketCliente.getInputStream();
            OutputStream os = socketCliente.getOutputStream();
            System.out.println("Sevidor: Leo los mensajes del cliente");
            System.out.println("Mensaje del cliente: " + is.read());
            System.out.println("Sevidor: Envio mensaje al cliente con 7");
            os.write(7);
            is.close();
            os.close();
            socketCliente.close();
            socketServidor.close();
        }catch (IOException e){
            System.err.println("Error.");
        }
    }
}
