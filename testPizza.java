import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class testPizza {
    public static void main(String[] args) {

        List<List<String>> matrice = new ArrayList<List<String>>();
        String row;

        BufferedReader buffer_example;
        int i=0;
        try {
            buffer_example = new BufferedReader(new FileReader("./a_example"));
            while ((row = buffer_example.readLine()) != null) {
                String[] data = row.split(",");
                matrice.add(Arrays.asList(data));
                i++;
                // do something with the data
                }
                buffer_example.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator<List<String>> It_mat = matrice.iterator();
        while(It_mat.hasNext()){
            Iterator<String> It_ligne = It_mat.next().iterator();
            while(It_ligne.hasNext()){
                String j = It_ligne.next();
                System.out.print(j + " ");
            }
            System.out.print("\n");
		}
    }
}
