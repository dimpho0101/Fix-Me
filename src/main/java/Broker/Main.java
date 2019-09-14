package za.co.diputu.Broker;

import java.io.*;
import java.net.*;

public class Main {
    //    public static long idCounter = 100000;
    public static int port = 5000;
    public static void main(String[] args) throws Exception{
        //String.valueOf(idCounter)
         Socket s = new Socket(InetAddress.getByName("localhost"), port);
         String str = "Hello za.co.diputu.Broker";
         OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
         PrintWriter out = new PrintWriter(os);
         os.write(str);
         os.flush();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(idCounter + i);
    }
}