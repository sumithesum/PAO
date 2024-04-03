package lab4.task6;
import java.io.*;
import java.util.List;
public interface StudentDeserializer {
    Student deserialize(InputStream inputStream) throws IOException;
}
