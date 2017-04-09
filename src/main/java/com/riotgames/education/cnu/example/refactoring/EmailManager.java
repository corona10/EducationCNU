package com.riotgames.education.cnu.example.refactoring;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dachoi on 2017-04-09.
 */
public class EmailManager {

    private static Map<String,String> servers = new HashMap<>();

    static {
        servers.put("Korea", "korea.com");
        servers.put("USA", "usa.com");
    }

    public static String getAvailableEmailServerLocation(String region) {
        return servers.get(region);
    }
}
