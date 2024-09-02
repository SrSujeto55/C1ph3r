import java.io.*;

public class textParser {
    private BufferedReader br;
    public textParser(String path){
        try{
            File file = new File(path);
            if (!file.exists()){
                System.out.println("File not found");
                return;
            }
            br = new BufferedReader(new FileReader(file));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }

    public String getText(){
        String text = "";
        try{
            String line;
            while ((line = br.readLine()) != null){
                text += line + "\n";
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return text;
    }
}
