package com.riotgames.education.cnu.example.refactoring;

/**
 * Created by dachoi on 2017-04-09.
 */
public class EmailService {

    private String reservedName = "riot";

    public boolean sendEmailAdvanced(String targetEmail, String text, String userName, String emailServerLocation) {
        if (userName.startsWith(reservedName)) {
            return false;
        }

        sendEmail(targetEmail, text);
        return true;
    }

    private void sendEmail(String targetEmail, String text) {
        // send email!
        System.out.println("SENT MAIL!!! to " + targetEmail + "with contents = " + text);
    }
}
