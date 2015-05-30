package demo.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SpringfoxSwaggerConfig {

    @Bean
    public Docket entityApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("entity-api")
                .apiInfo(apiInfo())
                .select()
                .paths(entityPath())
                .build();
    }

    private Predicate<String> entityPath() {
        return regex("/entities.*");

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Demo")
                .version("0.0")
                .build();
    }

}
