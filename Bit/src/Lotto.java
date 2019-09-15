import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeSet;


class mkLotto{
    private TreeSet<Integer> nums = new TreeSet<>();
    public mkLotto(){
        while (nums.size()<6){
            int n = (int)(Math.random()*45+1);
            nums.add(n);
        }
    }
    @Override
    public String toString(){
        return nums.toString();
    }
}
class TimeInfo{
    public String monthAndDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 HH시 mm분 ss초");
        String today = sdf.format(new Date());
        return today;
    }
}

public class Lotto {
    public static void main(String[] args) throws IOException {
        FileWriter fw =null;
        BufferedWriter bw = null;
        FileReader fr =null;
        BufferedReader br = null;
        TimeInfo t = new TimeInfo();


        try{
            mkLotto luck = new mkLotto();
            fw = new FileWriter("C:\\IOTemp\\myLotto.txt",true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write("***"+t.monthAndDate()+"***");
            bw.newLine();
            bw.write("*********행운의 번호*********");
            bw.newLine();
            bw.write(luck.toString());
            bw.newLine();
            bw.flush();
            fw.flush();
            fr = new FileReader("C:\\IOTemp\\myLotto.txt");
            br = new BufferedReader(fr);
            String line = "";
            while((line=br.readLine())!=null){
                System.out.println(line);
            }


        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            try{
                br.close();
                fr.close();
                bw.close();
                fw.close();

            }catch(Exception e){
                e.printStackTrace();
            }

        }


    }
}
