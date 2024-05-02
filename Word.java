import java.util.*;

public class Word{

    private String word;
    private ArrayList<String> wordBank = new ArrayList<String>();

    public Word(){

    }

    public void fillWordBank(){
        try {
            File myObj = new File("Wordbank.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              wordBank.add(myReader.nextLine());
            }
            myReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void chooseWord(){
        fillWordBank();
        int index = (int)(Math.random() * wordBank.size());
        this.word=wordBank.get(index);
        System.out.println(word);
    }

    public String getWord(){
        return this.word;
    }


}