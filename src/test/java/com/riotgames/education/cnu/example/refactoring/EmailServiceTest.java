package com.riotgames.education.cnu.example.refactoring;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by dachoi on 2017-04-09.
 */
public class EmailServiceTest {

    @Test
    public void testSendEmailSuccessFullyWhenServerIsKorea() {
        String targetEmail = "wow@riotgames.com";
        String userName = "test";
        String region = "Korea";
        EmailService emailService = new EmailService();
        boolean result = emailService.sendEmail(targetEmail, "TEXT", userName, region);
        assertTrue(result);
    }
}
