package connessionetcp;
import java.io.*;
import java.net.*;

public class Client {
  public static void main(String[] args) {

    int port = 88;
    String ip = "127.0.0.0";

    try{
      Socket socket = new Socket(ip, port);
      socket.close();
    }catch(IOException ioe){
      System.err.println("Server non trovato");
    }  
  }
}
