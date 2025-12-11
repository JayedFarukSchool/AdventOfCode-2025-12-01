import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(read());
    }

    public static int read() throws FileNotFoundException {
        File f = new File("src/Puzzle.txt");
        Scanner s = new Scanner(f);
        int num = 50;
        int count = 0;
        String str = "";
        String lr = "";
        while (s.hasNext()) {
            str = s.next();
            lr = str.substring(0, 1);
            int i = Integer.parseInt(str.substring(1));
            if (i>100) i = i % 100;
            if (lr.equals("R")) num += i;
            else num -= i;
            if (num >= 100) num %= 100;
            if (num < 0) num += 100;
            if (num == 0) count++;
        }
        return count;
    }
}