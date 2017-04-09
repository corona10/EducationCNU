package com.riotgames.education.cnu.example.refactoring;

/**
 * Created by dachoi on 2017-04-09.
 */
public class EmailService {

    private String reservedName = "riot";

    public boolean sendEmail (String targetEmail, String text, String userName, String region) {
        String emailServerLocation = EmailManager.getAvailableEmailServerLocation(region);
        if (emailServerLocation != null) {
            if (userName.startsWith(reservedName)) {
                return false;
            }
            sendEmail(targetEmail, text, emailServerLocation);
            return true;
        } else {
            return false;
        }
    }

    private void sendEmail(String targetEmail, String text, String emailServerLocation) {
        // send email
    }
}
