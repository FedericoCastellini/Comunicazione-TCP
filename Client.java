package connessionetcp;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 88;
        
        Socket socket = null;
        try{
            ServerSocket sSocket = new ServerSocket(port);
            System.out.println("In attesa di connessione con il client");
            
            socket = sSocket.accept();
            System.out.println("Server connesso con il socket: "+ socket.getRemoteSocketAddress());
            
            socket.getInputStream();
        }catch(BindException be) {
            System.err.println("Server già avviato");
        }catch(IOException ioe){
            System.err.println("Errore I/O nell'instanza del server");
        }
    }
}
