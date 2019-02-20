package cn.luutqf.cicd.demo.web;

import cn.luutqf.cicd.demo.entity.ChapterRequest;
import cn.luutqf.cicd.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

    static ExecutorService executor = Executors.newSingleThreadExecutor();

	public static void main(String[] args) throws InterruptedException {
		RestTemplate restTemplate = new RestTemplate();


		for (int i = 1; i <= 100; i++) {

//			int finalI = i;
			Thread.sleep(100);
			Thread thread = new Thread(() -> {
				ChapterRequest request = new ChapterRequest();
				request.setChapterName("");
				request.setImage("luutqf/ubuntu-xfce-vnc");
				request.setTtl(6);
				request.setSubjectName("");
				request.setTargetPort("6901");
				request.setPassword("123456");
//				request.setUsername(UUID.randomUUID().toString());
				request.setUsername("");
				restTemplate.postForObject("http://192.168.20.161:8990/vnc", request, String.class);
			});

//			executor.submit(thread);
			thread.start();
		}
	}
}