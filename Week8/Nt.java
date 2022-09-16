package Week8;

import java.util.ArrayList;

public class Nt {
    public static void Nt(String[] args){
        SMS message = new SMS("ope", "Awesome stuff!");
        System.out.println(message.read());

        ArrayList<SMS> messages = new ArrayList<SMS>();
        messages.add(new SMS("unknown number", "I hid the body."));
    }
}
