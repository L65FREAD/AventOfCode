import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day1Challenge1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new FileReader("/Users/ayus/Documents/Java/aventOfCode/1.1-input.txt"));
        BufferedReader bww = new BufferedReader(new FileReader("/Users/ayus/Documents/Java/aventOfCode/1.1-input.txt"));
        System.out.println(twoInputs(bw));
        System.out.println(threeInput(bww));

    }

    public static int twoInputs(BufferedReader bw) throws IOException{
        ArrayList<Integer> numbers =new ArrayList<>();
        int result;
        String s;
        while((s = bw.readLine())!=null){
            numbers.add(Integer.parseInt(s));
        }
        for(int i=0;i<numbers.size();i++){
            for (int j=0;j<numbers.size();j++){
                if ((numbers.get(i)+numbers.get(j)) == 2020){
                    result = numbers.get(i) * numbers.get(j);
                    bw.close();
                    return result;
                }
            }
        }
        return 0;
    }

    public static int threeInput(BufferedReader bw) throws IOException{
        ArrayList<Integer> numbers =new ArrayList<>();
        int result;
        String s;
        while((s = bw.readLine())!=null){
            numbers.add(Integer.parseInt(s));
        }
        for(int i=0;i<numbers.size();i++){
            for (int j=0;j<numbers.size();j++){
                for (int k=0;k<numbers.size();k++){
                    if ((numbers.get(i)+numbers.get(j)+numbers.get(k)) == 2020){
                        result = numbers.get(i) * numbers.get(j)*numbers.get(k);
                        bw.close();
                        return result;
                    }
                }
            }
        }
        return 0;

    }
}
