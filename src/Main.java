import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress("localhost", 4040),0);
        httpServer.createContext("/movies",new SimpleHandler());
        httpServer.setExecutor(Executors.newSingleThreadExecutor());
        httpServer.start();

    }
//changes more changes

}