
package cn.luutqf.cicd.gateway.config;

import cn.luutqf.cicd.gateway.handler.ImageCodeHandler;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

/**
 * @author lengleng
 * @date 2018/7/5
 * 路由配置信息
 */
@Slf4j
@Configuration
@AllArgsConstructor
public class RouterFunctionConfiguration {
    //	private final HystrixFallbackHandler hystrixFallbackHandler;
//	private final SwaggerResourceHandler swaggerResourceHandler;
//	private final SwaggerSecurityHandler swaggerSecurityHandler;
//	private final SwaggerUiHandler swaggerUiHandler;
    private final ImageCodeHandler imageCodeHandler;

    @Bean
    public RouterFunction routerFunction() {
        log.info("-----------------------\n路由配置信息");
        return RouterFunctions.route(
//			RequestPredicates.path("/fallback")
//				.and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), hystrixFallbackHandler)
//			.andRoute(RequestPredicates.GET("/code")
//				.and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), imageCodeHandler)
//			.andRoute(RequestPredicates.GET("/swagger-resources")
//				.and(RequestPredicates.accept(MediaType.ALL)), swaggerResourceHandler)
//			.andRoute(RequestPredicates.GET("/swagger-resources/configuration/ui")
//				.and(RequestPredicates.accept(MediaType.ALL)), swaggerUiHandler)
//			.andRoute(RequestPredicates.GET("/swagger-resources/configuration/security")
//				.and(RequestPredicates.accept(MediaType.ALL)), swaggerSecurityHandler)
//				;
            RequestPredicates.path("/code")
                    .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), imageCodeHandler);
    }

}
