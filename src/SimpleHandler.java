import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class SimpleHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if("GET".equals(exchange.getRequestMethod())){
            //send something
            OutputStream outputStream = exchange.getResponseBody();
            String response = "Hello";
            exchange.sendResponseHeaders(200, response.length());

            outputStream.write(response.getBytes());
            outputStream.flush();
            outputStream.close();

        }
    }
}
//many changes


