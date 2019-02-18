package cn.luutqf.cicd.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: ZhenYang
 * @date: 2019/1/22
 * @description:
 */
@Component
@ConfigurationProperties(prefix="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


//    @Value("${user.age}")
    String age;

//    @Value("${user.name}")
    String name;

}
