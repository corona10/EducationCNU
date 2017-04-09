package com.riotgames.education.cnu.example.email.version1;

/**
 * Created by dachoi on 2017-04-09.
 */
public class EmailService {

    private String reservedName = "riot";

    public boolean sendEmail (String userName, String text, String region) {
        String host = EmailManager.getHost(region);
        if (host != null) {
            if (text.contains(reservedName)) {
                return false;
            }
            sendEmail(userName+host, text);
            return true;
        } else {
            return false;
        }
    }

    private void sendEmail(String targetEmail, String text) {
        // send email
    }
}
