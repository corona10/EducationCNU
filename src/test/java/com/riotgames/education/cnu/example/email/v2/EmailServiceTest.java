package com.riotgames.education.cnu.example.email.v2;

import com.riotgames.education.cnu.example.email.version2.EmailManager;
import com.riotgames.education.cnu.example.email.version2.EmailService;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by dachoi on 2017-04-09.
 */
public class EmailServiceTest {
    @Test
    public void testSendEmailSuccessFullyWhenServerIsKorea() {
        String userName = "rikim";
        String host ="@korea.com";

        EmailService emailService = new EmailService();
        boolean result = emailService.sendEmail(userName, "TEXT", host);
        assertTrue(result);
    }
}
