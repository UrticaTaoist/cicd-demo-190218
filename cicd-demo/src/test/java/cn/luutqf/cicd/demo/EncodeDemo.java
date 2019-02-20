package cn.luutqf.cicd.demo;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: ZhenYang
 * @date: 2019/2/20
 * @description:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CicdDemoApplication.class)
public class EncodeDemo {
	@Autowired
	private StringEncryptor stringEncryptor;
	@Test
	public void testEnvironmentProperties() {
//		System.out.println(stringEncryptor.encrypt("lengleng"));
		String decrypt = stringEncryptor.decrypt("gPFcUOmJm8WqM3k3eSqS0Q==");
		System.out.println(decrypt);
	}
}