package Week7;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    public String translate(String word){
        public int amountOfWords(){
            return this.dictionary.size();
        }

        public ArrayList<String> translationList(){
            ArrayList<String> transList = new ArrayList<String>();
            for (String key: this.dictionary.keySet()) {
                String value = this.dictionary.get(key);
                String pair = key + " = " + value;
                transList.add(pair);
            }
            return transList;
        }
    }