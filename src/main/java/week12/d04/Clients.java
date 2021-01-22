package week12.d04;

import java.util.*;

public class Clients {
    private Map<String,Client> clientMap = new HashMap<>();

    public void addClient(String name, String regNumber){
        clientMap.put(regNumber, new Client(name, regNumber));
    }

    public Client findByRegNumber(String regNumber){
        if (!clientMap.containsKey(regNumber)){
            throw new IllegalArgumentException("Not find Clients: " + regNumber);
        }
        return clientMap.get(regNumber);
    }

    public List<Client> findByName(String name){
        List<Client> clientList = new ArrayList<>();
        Collection<Client> clients = clientMap.values();
        for(Client client:clients){
            if(client.getName().contains(name)){
                clientList.add(client);
            }
        }
        return clientList;
    }
}
