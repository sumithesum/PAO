package lab6.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listener {
    private List<Topics> topics;
    private String username;

    private Listener() {
        this.topics = new ArrayList<>();
    }

    public List<Topics> getTopics() {
        return topics;
    }
/// Builder pattern
    public static class Builder {
        private List<Topics> topics;
        private String username;
        public Builder setTopics(Topics[] topics) {
            this.topics = new ArrayList<>(Arrays.asList(topics));
            return this;
        }
        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Listener build() {
            Listener listener = new Listener();
            listener.topics = this.topics;
            listener.username = this.username;
            return listener;
        }
    }

    public void addTopic(Topics topic){
        if (!topics.contains(topic)) {
            topics.add(topic);
        }
    }

    public void deleteTopic(Topics topic){
        topics.remove(topic);
    }

    void onNotification(Listener sender, Topics topic, String message){
        System.out.println("["+this.username + "] " + sender.username + " @ " + topic + " " + message + "!");
    }
}