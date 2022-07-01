import java.io.File;
import java.io.IOException;

public class IOexercises {
    public static void main(String[] args) throws IOException {
        File fil = new File("/Users/Darius/Desktop/bootcamp");

        if (fil.canRead()){
            System.out.println("can read");
        }
        String[] fi = fil.list();
        for (String k : fi)
        {
            System.out.println(k);
        }
    }

}
