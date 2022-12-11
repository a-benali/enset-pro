package abenali.edu;

import abenali.edu.ws.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    private static final String webservice_url = "http://0.0.0.0:9191/";
    public static void main(String[] args) {

        Endpoint.publish(webservice_url, new BanqueService());
        System.out.println("webservice started successfully on "+ webservice_url);
    }
}