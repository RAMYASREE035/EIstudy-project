package server;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static Map<String, ChatRoom> chatRooms = new HashMap<>();
    private static UserManager userManager = new UserManager();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Chat server started...");
            while (true) {
                Socket socket = serverSocket.accept();
                new ClientHandler(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ChatRoom getChatRoom(String roomId) {
        return chatRooms.computeIfAbsent(roomId, k -> new ChatRoom());
    }

    public static UserManager getUserManager() {
        return userManager;
    }
}
