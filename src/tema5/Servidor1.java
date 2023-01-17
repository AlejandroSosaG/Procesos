package tema5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor1 {
    public static void main(String[] args) {
        try {
            System.out.println("Sevidor: Abriendo conexión");
            ServerSocket socketServidor = new ServerSocket(50000);
            System.out.println("Sevidor: aceptando conexión");
            Socket socketCliente = socketServidor.accept();
            System.out.println("Sevidor: Abriendo flujos de entrada y salida");
            InputStream is = socketCliente.getInputStream();
            OutputStream os = socketCliente.getOutputStream();

            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Mensaje enviado por el cliente: " + br.readLine());
            System.out.println("Sevidor envia mensaje al cliente");
            OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write("Soy el servidor. Este mensaje es para el cliente");
            bw.newLine();
            bw.flush();
            br.close();
            isr.close();
            osw.close();
            is.close();
            os.close();
            socketCliente.close();
            socketServidor.close();
        }catch (IOException e){
            System.err.println("Error.");
        }
    }
}
