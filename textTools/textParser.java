package textTools;
import java.io.*;

public class textParser {
    public static String getText(String Path){
        BufferedReader br;
        String text = "";
        try{
            File file = new File(Path);
            if (!file.exists()){
                System.out.println("File not found");
                return "";
            }
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null){
                text += line + "\n";
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return text;
    }
}
