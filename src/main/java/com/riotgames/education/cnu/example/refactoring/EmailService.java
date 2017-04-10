package com.riotgames.education.cnu.example.refactoring;

/**
 * Created by dachoi on 2017-04-09.
 */
public class EmailService {
    //riot 사칭을 막기 위해 riot이라는 단어가 메일에 포함될 수 없다고 가정해보죠 :)
    private String reservedName = "riot";

    /**
     * 사용자 이름을 가지고 이메일을 보낸다
     * @param userName 이메일을 받는 사람 이름
     * @param text     이메일 내용
     * @param region   이메일 서버의 지역
     * @return         이메일 발신 성공시 true, 실패시 false(이메일 서버가 위치하지 않는 지역 || 예약어가 포함된 이메일 내용)
     */
    public boolean sendEmail (String userName, String text, String region) {
        String host = EmailManager.getHost(region); //지역에 맞는 호스트를 가져온다
        if (host != null) {
            if (text.contains(reservedName)) {//예약어(riot)이 내용에 포함되어 있는지 확인한다
                return false;
            }
            sendEmail(userName+host, text); //메일을 보낸다.
            return true;
        } else {
            return false;
        }
    }

    private void sendEmail(String targetEmail, String text) {
        // send email
    }
}
