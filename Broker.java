import java.util.*;


public class Broker extends Node{

    private List<Consumer> registeredUsers;
    private List<Publisher> registeredPublishers;

    public void calculateKeys(){

    }

    public Publisher acceptConnection(Publisher i){

        return i;
    }

    public Consumer acceptConnection(Consumer i){

        return i;
    }

    public void notifyPublisher(String msg){

    }

    public void notifyBrokersOnChanges(){

    }

    public void pull(String msg){

    }

    public void filterConsumers(String key){

    }



}
