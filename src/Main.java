import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        read();
    }

    public static int read() throws FileNotFoundException {
        File f = new File("src/Puzzle.txt");
        Scanner s = new Scanner(f);
        int num = 50;
        int t = 0;
        int count = 0;
        String lr = "";
        while (s.hasNext()) {
            lr = s.next();
            t = s.nextInt();
            if (lr == "R") num += t;
            else num -= t;
            if (num == 0) count++;
        }
        return count;
    }
}