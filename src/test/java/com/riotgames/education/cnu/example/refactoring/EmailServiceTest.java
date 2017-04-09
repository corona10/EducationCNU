package com.riotgames.education.cnu.example.refactoring;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by dachoi on 2017-04-09.
 */
public class EmailServiceTest {

    @Test
    public void testSendEmailAdvancedNormalUserName_shouldSucceed() {
        String targetEmail = "wow@riotgames.com";
        String userName = "test";
        String serverLocation = "korea.com";

        EmailService emailService = new EmailService();
        boolean result = emailService.sendEmailAdvanced(targetEmail, "text", userName, serverLocation);
        assertTrue(result);
    }

    @Test
    public void testSendEmailAdvancedRiotUserName_shouldFail() {
        String targetEmail = "wow@riotgames.com";
        String userName = "riot_rik";
        String serverLocation = "korea.com";

        EmailService emailService = new EmailService();
        boolean result = emailService.sendEmailAdvanced(targetEmail, "text", userName, serverLocation);
        assertFalse(result);
    }
}
