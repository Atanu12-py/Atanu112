package com.HitUrl.HitUrlAssign.Controller;

import com.HitUrl.HitUrlAssign.UserHit.UsernameHitCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.HitUrl.HitUrlAssign.Service.UrlHitService;

@RestController
//@RequestMapping("/api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    private UrlHitService urlHitService;

    @GetMapping("count")
    public String getHitCount() {
        return urlHitService.getHitCount();
    }

    @GetMapping("username/{username}/count")
    public UsernameHitCount getHitCountByUsername(@PathVariable String username) {
        int hitCount = urlHitService.getHitCountByUsername(username);
        return new UsernameHitCount(username, hitCount);
    }
}
