import java.util.ArrayList;
import java.util.List;

public class Main {



    public String encryptThis( String input ){

        String result ="";
        char[] letters = input.toCharArray();

        List<Character> word = new ArrayList<>();
        for( int i = 0 ; i < letters.length; i++){

            if( letters[i] !=' ' ){
                word.add( letters[i] );
            }else if( letters[i] ==' ' ){
                result = getString(result, word);
            }
        }
        result = getString(result, word);

        return result.substring(0,result.length()-1);
    }



    private String getString(String result, List<Character> word) {
        char lastletter = word.get(word.size()-1);
        char secondletter  = word.get(1);
        char firstletter  = word.get(0);

        word.remove(word.size()-1);
        word.add( secondletter);

        word.remove(1);
        word.add( 1, lastletter);

        int ascii = (int)firstletter;

        result = result + String.valueOf(ascii);
        for(int j =1; j< word.size(); j++){
            result = result + word.get(j) ;
        }
        result = result + " ";
        word.clear();
        return result;
    }




//Kata.encryptThis("Hello") => "72olle"
//        Kata.encryptThis("good") => "103doo"
//        Kata.encryptThis("hello world") => "104olle 119drlo"






}





