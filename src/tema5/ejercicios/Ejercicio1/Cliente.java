package tema5.ejercicios.Ejercicio1;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            int num = pedidaNumero();
            InetAddress direccion = InetAddress.getLocalHost();
            Socket socketClliente = new Socket(direccion, 2500);
            System.out.println("Sevidor: Abriendo flujos de entrada y salida");
            OutputStream os = socketClliente.getOutputStream();
            InputStream is = socketClliente.getInputStream();
            System.out.println("Cliente: Envia mensaje al servidor con número " + num);
            os.write(num);
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Mensaje enviado por el servidor: " + br.readLine());
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
    public static int pedidaNumero(){
        int num;
        do {
            System.out.println("Introduzca un número");
            num = sc.nextInt();
        }while (num<0);
        return num;
    }
}
