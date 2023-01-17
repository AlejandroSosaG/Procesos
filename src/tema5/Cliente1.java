package tema5;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente1 {
    public static void main(String[] args) {
        /*try {
            InetAddress direccion = InetAddress.getByAddress(192.168.0.184);
            Socket socketClliente = new Socket(direccion, 50000);
            System.out.println("Sevidor: Abriendo flujos de entrada y salida");
            OutputStream os = socketClliente.getOutputStream();
            InputStream is = socketClliente.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Mensaje enviado por el cliente: " + br.readLine());
            System.out.println("Cliente envia mensaje al servidor");
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
            socketClliente.close();
        }catch (UnknownHostException e) {
            System.err.println("Error");
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }*/
    }
}
