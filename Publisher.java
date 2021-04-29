import java.util.ArrayList;

public class Publisher extends Node{

    private ChannelName channelName;

    public void addHashTag(String hash){

    }

    public void removeHashTag(String hash){

    }

    public void getBrokerList(){

    }

    public Broker hashTopic(String hash){

        return new Broker(); //temp
    }

    public void push(String msg, Value value){

    }

    public void notifyFailure(Broker broker){

    }

    public void notifyBrokersForHashTags(String tag){

    }

    public ArrayList<Value> generateChunks(String value){

        return new ArrayList<Value>;
    }
}
