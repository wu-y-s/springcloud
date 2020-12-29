package com.wys.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wys
 * @Description: TODO
 * @DateTime: 2020/12/29 10:08
 **/
@Configuration
public class GatewayConfig {

    @Bean
    //当访问localhost：9527/guonei时会转发到http://news.baidu.com/guonei
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_wys",p -> p.path("/guonei").uri("http://news.baidu.com/guonei")).build();

        return routes.build();

    }

}
