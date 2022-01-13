package com.qhm.elasticsearch.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ Description:  Swagger2配置类
 * @ Author: qhm
 * @ Date: 2020/3/24 10:02
 * @ Version: 1.0
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi(){
        com.google.common.base.Predicate<RequestHandler> selector1 = RequestHandlerSelectors.basePackage("com.qhm.elasticsearch.controller");
        com.google.common.base.Predicate<RequestHandler> selector2 = RequestHandlerSelectors.basePackage("com.qhm.elasticsearch.datasources.controller");
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //控制暴露出去的路径下的实例
                //如果某个接口不想暴露,可以使用以下注解
                //@ApiIgnore 这样,该接口就不会暴露在 swagger2 的页面下
                .apis(Predicates.or(selector1,selector2))
                .paths(PathSelectors.any())
                .build();
    }


    //构建api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("ElasticSearch查询页面")
                //条款地址
                .termsOfServiceUrl("http://despairyoke.github.io/")
                .contact("zwd")
                .version("1.0")
                //描述
                .description("Api描述")
                .build();
    }
}
