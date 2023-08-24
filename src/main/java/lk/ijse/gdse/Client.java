package lk.ijse.gdse;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        try {
            System.out.println("Client Started !");
            Socket soc = new Socket("localhost",9806); //Arguments 2 = Server ip address & port number
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
