package lab6.task2;

public class Main {
    public static void main(String[] args){
        Listener listener1 = new Listener.Builder()
                .setUsername("Matei")
                .setTopics( new Topics[]{Topics.Science, Topics.Coking})
                .build();
        Listener listener2 = new Listener.Builder()
                .setUsername("Andei")
                .setTopics( new Topics[]{Topics.Science, Topics.Technology, Topics.Coking})
                .build();
        Listener listener3 = new Listener.Builder()
                .setUsername("Maria")
                .setTopics( new Topics[]{Topics.Science, Topics.Technology, Topics.WEB, Topics.Programming})
                .build();
        Listener listener4 = new Listener.Builder()
                .setUsername("Colin")
                .setTopics( new Topics[]{Topics.Science, Topics.Technology, Topics.WEB, Topics.Programming, Topics.OOP})
                .build();


        Publiser publiser = new Publiser(listener1);
        publiser.addListener(listener2);
        publiser.addListener(listener3);
        publiser.addListener(listener4);

        Publiser publiser3 = new Publiser(listener3);
        publiser3.addListener(listener2);
        publiser3.addListener(listener1);
        publiser3.addListener(listener4);

        publiser.notify(Topics.Coking, "New Coking Article");
        System.out.println();
        publiser.notify(Topics.Science, "New Science Article");
        System.out.println();
        publiser3.notify(Topics.Technology, "New Tech Article");

    }
}
