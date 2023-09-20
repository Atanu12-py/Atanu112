package com.HitUrl.HitUrlAssign.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UrlHitService {
    private int totalHitCount = 0;
    private HashMap<String, Integer> userHitCountMap = new HashMap<>();

    public String getHitCount() {
        incrementHitCount();
        return "Visitor:"+totalHitCount;
    }

    public int getHitCountByUsername(String username) {
        incrementHitCount();
        incrementHitCountForUsername(username);
        return userHitCountMap.getOrDefault(username, 0);
    }

    public void incrementHitCount() {
        totalHitCount++;
    }

    public void incrementHitCountForUsername(String username) {
        userHitCountMap.put(username, userHitCountMap.getOrDefault(username, 0) + 1);
    }


}
