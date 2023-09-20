package com.HitUrl.HitUrlAssign.UserHit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class UsernameHitCount {
    private final String username;
    private final int hitcount;

    public UsernameHitCount(String username, int hitcount) {
        this.username = username;
        this.hitcount = hitcount;
    }

}
