package cn.luutqf.cicd.auth.service.impl;

import cn.luutqf.cicd.auth.service.MyUserDetailsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @Author: ZhenYang
 * @date: 2019/2/20
 * @description:
 */
@Slf4j
@Service
@AllArgsConstructor
public class MyUserDetailsServiceImpl implements MyUserDetailsService {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserBySocial(String code) throws UsernameNotFoundException {
		return null;
	}

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		log.info("用户名:{}",s);
		String encode = passwordEncoder.encode("123456");
		System.out.println(encode);
		User user = new User(s,encode, true,true,true,true,
				AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
		return user;
	}

	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		boolean pig = bCryptPasswordEncoder.matches("pig", "gPFcUOmJm8WqM3k3eSqS0Q==");
		System.out.println(pig);
	}
}