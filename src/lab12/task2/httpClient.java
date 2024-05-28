package lab12.task2;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Random;

public class httpClient {
    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    public static void main(String[] args) throws Exception {
        getRandomResource();
        createResource();
    }

    private static void getRandomResource() throws Exception {
        int id = new Random().nextInt(100) + 1;
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/" + id))
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Random Resource Response:");
        System.out.println(response.body());
    }

    private static void createResource() throws Exception {
        String json = "{" +
                "\"title\":\"test title\"," +
                "\"body\":\"test body\"," +
                "\"userId\":1" +
                "}";

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("\nCreated Resource Request:");
        System.out.println(json);
        System.out.println("\nCreated Resource Response:");
        System.out.println(response.body());
    }
}