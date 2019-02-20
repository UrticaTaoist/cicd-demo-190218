package cn.luutqf.cicd.auth.endpoint;

import cn.luutqf.cicd.common.core.util.R;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Author: ZhenYang
 * @date: 2019/2/20
 * @description:
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/token")
public class TokenEndpoint {

	/**
	 * 认证页面
	 *
	 * @return ModelAndView
	 */
	@GetMapping("/login")
	public ModelAndView require() {
		log.info("这个方法不要了");
		return new ModelAndView("ftl/login");
	}
	@DeleteMapping("/logout")
	public R logout(@RequestHeader(value = HttpHeaders.AUTHORIZATION, required = false) String authHeader) {

		return  null;
	}

	/**
	 * 令牌管理调用
	 *
	 * @param token token
	 * @return
	 */
//	@Inner //服务间调用不鉴权注解
	@DeleteMapping("/{token}")
	public R<Boolean> delToken(@PathVariable("token") String token) {

		return null;
	}

	/**
	 * 查询token
	 *
	 * @param params 分页参数
	 * @return
	 */
//	@Inner
	@PostMapping("/page")
	public R tokenList(@RequestBody Map<String, Object> params) {

		return null;
	}
}