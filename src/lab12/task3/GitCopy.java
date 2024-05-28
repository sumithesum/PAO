package lab12.task3;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class GitCopy {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java GitInit <path>");
            return;
        }

        try {

            File directory = new File(args[0]);
            if (!directory.exists()) {
                directory.mkdirs();
            }


            File gitDir = new File(directory, ".git");
            gitDir.mkdir();


            new File(gitDir, "objects").mkdir();
            new File(gitDir, "refs").mkdir();


            File headFile = new File(gitDir, "HEAD");
            try (PrintWriter writer = new PrintWriter(headFile)) {
                writer.print("ref: refs/head/main\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while initializing the repository.");
            e.printStackTrace();
        }
    }
}