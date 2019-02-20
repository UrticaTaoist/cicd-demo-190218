package cn.luutqf.cicd.auth.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZhenYang
 * @date: 2019/2/20
 * @description:
 */
@RestController
public class MainController {


	@GetMapping("test")
	public Object test(){

		return "test";
	}
}