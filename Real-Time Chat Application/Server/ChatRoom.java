package server;

import java.util.HashSet;
import java.util.Set;

public class ChatRoom {
    private Set<ClientHandler> clients = new HashSet<>();

    public synchronized void addClient(ClientHandler client) {
        clients.add(client);
        broadcastMessage("User " + client.getUsername() + " joined the room.");
    }

    public synchronized void removeClient(ClientHandler client) {
        clients.remove(client);
        broadcastMessage("User " + client.getUsername() + " left the room.");
    }

    public synchronized void broadcastMessage(String message) {
        for (ClientHandler client : clients) {
            client.sendMessage(message);
        }
    }

    public synchronized void listActiveUsers(ClientHandler client) {
        for (ClientHandler c : clients) {
            client.sendMessage(c.getUsername());
        }
    }
}
