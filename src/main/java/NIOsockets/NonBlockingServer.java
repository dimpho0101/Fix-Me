package NIOsockets;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class NonBlockingServer {
    private static Selector selector = null;

    public static void main(String[] args) {
        try{
            selector = Selector.open();

            ServerSocketChannel socket = ServerSocketChannel.open();
            ServerSocket serverSocket = socket.socket();
            serverSocket.bind(new InetSocketAddress("localhost", 5000));
            socket.configureBlocking(false);
            int ops = socket.validOps();
            socket.register(selector, ops, null);
            while (true)
            {
                selector.select();
                Set<SelectionKey> selectedKeys
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
