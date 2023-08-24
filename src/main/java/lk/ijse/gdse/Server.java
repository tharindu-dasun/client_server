package lk.ijse.gdse;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {


        //serversocket eken create object
        try {
            System.out.println("Waiting for client request !");
            ServerSocket ss = new ServerSocket(9806); //port number used to identify the application

            //Blocking call = client gen rq enakn server eka wait wenna one
            //rq ekak awama web server eken thama socket eka hadila connection eka stablish wenne , ita kalin wait k one clintgen rq enakan
            //create socket object
            Socket socket = ss.accept();
            System.out.println("Connection is Stablish !");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
