import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;

public class testPizza {
    public static void main(String[] args) throws IOException{

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
        int teams_number;
        String[] team_2 = {"2","1","4"};
        String[] team_3 = {"3","0","2","3"};
        /*
            some code here 
            ..
            ...
            .....
            ......
            ......
            ......
            ......
            .
            .
            .
            .
            and the output will be :
            output format exemple :

            2
            2 1 4
            3 0 2 3

        */
        
        BufferedWriter buffer_example_2;

        teams_number = 2;
        matrice.clear();
        String[] data = {String.valueOf(teams_number)};
        matrice.add(Arrays.asList(data));
        matrice.add(Arrays.asList(team_2));
        matrice.add(Arrays.asList(team_3));


        It_mat = matrice.iterator();
        try{
            buffer_example_2 = new BufferedWriter(new FileWriter("./a_exemple_output"));
            while(It_mat.hasNext()){
                Iterator<String> It_ligne = It_mat.next().iterator();
                while(It_ligne.hasNext()){
                    buffer_example_2.write(It_ligne.next()+" ");
                }
                buffer_example_2.write("\n");
            }
            buffer_example_2.close();

        }catch (Exception e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
