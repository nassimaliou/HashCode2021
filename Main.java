import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;

public class Main {
    public static int duration_exmpl_a = 0;
    public static int duration_exmpl_b = 0;
    public static int duration_exmpl_c = 0;
    public static int duration_exmpl_d = 0;
    public static int duration_exmpl_e = 0;
    public static int duration_exmpl_f = 0;

    public static int nb_intersections_a = 0;
    public static int nb_intersections_b = 0;
    public static int nb_intersections_c = 0;
    public static int nb_intersections_d = 0;
    public static int nb_intersections_e = 0;
    public static int nb_intersections_f = 0;

    public static int nb_streets_a = 0;
    public static int nb_streets_b = 0;
    public static int nb_streets_c = 0;
    public static int nb_streets_d = 0;
    public static int nb_streets_e = 0;
    public static int nb_streets_f = 0;

    public static int nb_cars_a = 0;
    public static int nb_cars_b = 0;
    public static int nb_cars_c = 0;
    public static int nb_cars_d = 0;
    public static int nb_cars_e = 0;
    public static int nb_cars_f = 0;

    public static int nb_bonus_a = 0;
    public static int nb_bonus_b = 0;
    public static int nb_bonus_c = 0;
    public static int nb_bonus_d = 0;
    public static int nb_bonus_e = 0;
    public static int nb_bonus_f = 0;

    public static String street_a= "";
    public static String street_b= "";
    public static String street_c= "";
    public static String street_d= "";
    public static String street_e= "";
    public static String street_f= "";


    public static void read_input() throws IOException{
        BufferedReader buffer_a;
        BufferedReader buffer_b;
        BufferedReader buffer_c;
        BufferedReader buffer_d;
        BufferedReader buffer_e;
        BufferedReader buffer_f;
        String row_a;
        String row_b;
        String row_c;
        String row_d;
        String row_e;
        String row_f;
        try {
            buffer_a = new BufferedReader(new FileReader("./a.txt"));
            buffer_b = new BufferedReader(new FileReader("./b.txt"));
            buffer_c = new BufferedReader(new FileReader("./c.txt"));
            buffer_d = new BufferedReader(new FileReader("./d.txt"));
            buffer_e = new BufferedReader(new FileReader("./e.txt"));
            buffer_f = new BufferedReader(new FileReader("./f.txt"));
            row_a = buffer_a.readLine();
            row_b = buffer_b.readLine();
            row_c = buffer_c.readLine();
            row_d = buffer_d.readLine();
            row_e = buffer_e.readLine();
            row_f = buffer_f.readLine();
            //duration
            String[] data = row_a.split(" ");
            Main.duration_exmpl_a = Integer.valueOf(data[0]);
            data = row_b.split(" ");
            Main.duration_exmpl_b = Integer.valueOf(data[0]);
            data = row_c.split(" ");
            Main.duration_exmpl_c = Integer.valueOf(data[0]);
            data = row_d.split(" ");
            Main.duration_exmpl_d = Integer.valueOf(data[0]);
            data = row_e.split(" ");
            Main.duration_exmpl_e = Integer.valueOf(data[0]);
            data = row_f.split(" ");
            Main.duration_exmpl_f = Integer.valueOf(data[0]);

            //nb of ntersections
            data = row_a.split(" ");
            Main.nb_intersections_a = Integer.valueOf(data[1]);
            data = row_b.split(" ");
            Main.nb_intersections_b = Integer.valueOf(data[1]);
            data = row_c.split(" ");
            Main.nb_intersections_c = Integer.valueOf(data[1]);
            data = row_d.split(" ");
            Main.nb_intersections_d = Integer.valueOf(data[1]);
            data = row_e.split(" ");
            Main.nb_intersections_e = Integer.valueOf(data[1]);
            data = row_f.split(" ");
            Main.nb_intersections_f = Integer.valueOf(data[1]);
            
            //nb of streets
            data = row_a.split(" ");
            Main.nb_streets_a = Integer.valueOf(data[2]);
            data = row_b.split(" ");
            Main.nb_streets_b = Integer.valueOf(data[2]);
            data = row_c.split(" ");
            Main.nb_streets_c = Integer.valueOf(data[2]);
            data = row_d.split(" ");
            Main.nb_streets_d = Integer.valueOf(data[2]);
            data = row_e.split(" ");
            Main.nb_streets_e = Integer.valueOf(data[2]);
            data = row_f.split(" ");
            Main.nb_streets_f = Integer.valueOf(data[2]);

            //nb of cars
            data = row_a.split(" ");
            Main.nb_cars_a = Integer.valueOf(data[3]);
            data = row_b.split(" ");
            Main.nb_cars_b = Integer.valueOf(data[3]);
            data = row_c.split(" ");
            Main.nb_cars_c = Integer.valueOf(data[3]);
            data = row_d.split(" ");
            Main.nb_cars_d = Integer.valueOf(data[3]);
            data = row_e.split(" ");
            Main.nb_cars_e = Integer.valueOf(data[3]);
            data = row_f.split(" ");
            Main.nb_cars_f = Integer.valueOf(data[3]);

            //nb of bonus
            data = row_a.split(" ");
            Main.nb_bonus_a = Integer.valueOf(data[4]);
            data = row_b.split(" ");
            Main.nb_bonus_b = Integer.valueOf(data[4]);
            data = row_c.split(" ");
            Main.nb_bonus_c = Integer.valueOf(data[4]);
            data = row_d.split(" ");
            Main.nb_bonus_d = Integer.valueOf(data[4]);
            data = row_e.split(" ");
            Main.nb_bonus_e = Integer.valueOf(data[4]);
            data = row_f.split(" ");
            Main.nb_bonus_f = Integer.valueOf(data[4]);

            int i = 1;
            
            /*while(i <= nb_streets_a){
                street_a += buffer_a.readLine() + "\n";
                i++;
            }
            i = 1;*/
            
            while(i <= nb_streets_b){
                street_b += buffer_b.readLine() + "\n";
                i++;
            }
            i = 1;
            
            /*while(i <= nb_streets_c){
                street_c += buffer_c.readLine() + "\n";
                i++;
            }
            i = 1;
            
            while(i <= nb_streets_d){
                street_d += buffer_d.readLine() + "\n";
                i++;
            }
            i = 1;
            
            while(i <= nb_streets_e){
                street_e += buffer_e.readLine() + "\n";
                i++;
            }
            i = 1;
            
            while(i <= nb_streets_f){
                street_f += buffer_f.readLine() + "\n";
                i++;
            }*/

        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException{
        Main.read_input();
        System.out.println(Main.street_b);

    }
    
}
