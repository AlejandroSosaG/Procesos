package tema5.ejercicios.Ejercicio1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        try {
            System.out.println("Sevidor: Abriendo conexión");
            ServerSocket socketServidor = new ServerSocket(2500);
            System.out.println("Sevidor: aceptando conexión");
            Socket socketCliente = socketServidor.accept();
            System.out.println("Sevidor: Abriendo flujos de entrada y salida");
            InputStream is = socketCliente.getInputStream();
            OutputStream os = socketCliente.getOutputStream();
            int num = is.read();
            System.out.println("Mensaje del cliente: " + num);
            System.out.println("Sevidor envia mensaje al cliente");
            OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            if (esPrimo(num)){
                bw.write("El número es primo");
            }else bw.write("El número no es primo");
            bw.newLine();
            bw.flush();
            osw.close();
            is.close();
            os.close();
            socketCliente.close();
            socketServidor.close();
        }catch (IOException e){
            System.err.println("Error.");
        }
    }
    public static boolean esPrimo(int num){
        boolean primo = true;
        for (int i = 2; i < num*2+1; i++) {
            if (num%i == 0) primo=false;
        }
        return primo;
    }
}
