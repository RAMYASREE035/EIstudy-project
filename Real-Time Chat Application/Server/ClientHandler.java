package server;

import java.io.*;
import java.net.*;

public class ClientHandler extends Thread {
    private Socket socket;
    private String username;
    private ChatRoom chatRoom;
    private PrintWriter out;
    private BufferedReader in;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            
            out.println("Enter your username: ");
            username = in.readLine();
            
            out.println("Enter your password: ");
            String password = in.readLine();
            
            if (!ChatServer.getUserManager().authenticate(username, password)) {
                out.println("Authentication failed. Disconnecting...");
                socket.close();
                return;
            }
            
            out.println("Enter chat room ID: ");
            String roomId = in.readLine();
            chatRoom = ChatServer.getChatRoom(roomId);
            chatRoom.addClient(this);

            String message;
            while ((message = in.readLine()) != null) {
                if (message.equalsIgnoreCase("/quit")) {
                    break;
                } else if (message.equalsIgnoreCase("/list")) {
                    chatRoom.listActiveUsers(this);
                } else {
                    chatRoom.broadcastMessage(username + ": " + message);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                chatRoom.removeClient(this);
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    public String getUsername() {
        return username;
    }
}
