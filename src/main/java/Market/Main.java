package Market;

import java.io.*;
import java.net.*;

public class Main {
    public static int MarketPort = 5001;
    public static void main(String[] args) throws Exception {
        Socket ss = new Socket(InetAddress.getByName("localhost"), MarketPort);
        String str = "Hello Market";
        OutputStreamWriter os = new OutputStreamWriter(ss.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        os.write(str);
        os.flush();
    }
}