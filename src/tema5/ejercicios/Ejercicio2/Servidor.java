package tema5.ejercicios.Ejercicio2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        try {
            System.out.println("Sevidor: Abriendo conexión");
            ServerSocket socketServidor = new ServerSocket(1500);
            System.out.println("Sevidor: aceptando conexión");
            Socket socketCliente = socketServidor.accept();
            System.out.println("Sevidor: Abriendo flujos de entrada y salida");
            InputStream is = socketCliente.getInputStream();
            OutputStream os = socketCliente.getOutputStream();
            int num = is.read();
            System.out.println("Mensaje del cliente: " + num);
            System.out.println("Sevidor envia mensaje al cliente");
            os.write(factorial(num));
            is.close();
            os.close();
            socketCliente.close();
            socketServidor.close();
        }catch (IOException e){
            System.err.println("Error.");
        }
    }
    public static int factorial(int num){
        int factorial = 1;
        for (int i = num; i >0; i--) {
            factorial*=i;
        }
        return factorial;
    }
}
