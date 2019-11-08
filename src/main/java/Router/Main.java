package Router;

import java.io.*;
import java.net.*;

class BrokerConnection extends Thread{
    public static long id = 100000;
    public void run() {
        try {
            System.out.println("Server on port 5000 has started");
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is waiting for Broker request");
            Socket s = ss.accept();
            System.out.println("Client is connected on Broker");
            BufferedReader x = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String str = x.readLine();

            System.out.println( id + " Says: " + str);
        } catch (Exception e ) {}
    }
}

class MarketConnection extends Thread {
    public static long id = 100001;
    public void run() {
        try {
            System.out.println("Server on port 5001 has started");
            ServerSocket ss1 = new ServerSocket(5001);
            System.out.println("Server is waiting for Market request");
            Socket s1 = ss1.accept();
            System.out.println("Client is connected on Market");
            BufferedReader w = new BufferedReader(new InputStreamReader(s1.getInputStream()));
            String str1 = w.readLine();
            System.out.println( id + " Says: " + str1);
        } catch (Exception e ){}
    }
}

public class Main {
    public static void main(String[] args) {
        BrokerConnection x = new BrokerConnection();
        MarketConnection m = new MarketConnection();
        x.start();
        m.start();
    }
}