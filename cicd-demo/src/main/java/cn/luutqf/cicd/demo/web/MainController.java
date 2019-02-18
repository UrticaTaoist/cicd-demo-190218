package cn.luutqf.cicd.demo.web;

import cn.luutqf.cicd.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZhenYang
 * @date: 2019/2/18
 * @description:
 */
@RestController
public class MainController {

    private final User user;

    @Autowired
    public MainController(User user) {
        this.user = user;
    }

    @GetMapping
    public Object test(){
        return user;
    }
}