package com.riotgames.education.cnu.example.email.version2;

/**
 * Created by dachoi on 2017-04-09.
 */
public class EmailService {

    private String reservedName = "riot";

    public boolean sendEmail (String username, String text, String host) {

        if (containReservedWord(text)){
            return false;
        }
        sendEmail(username+host, text);
        return true;
    }

    private void sendEmail(String email, String text) {
        // send email
    }

    private boolean containReservedWord(String userName){
        if (userName.contains(reservedName)) {
            return true;
        }
        return false;
    }
}
