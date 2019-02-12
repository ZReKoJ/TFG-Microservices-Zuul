package es.ucm.fdi.tfg.app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@Controller
@EnableZuulProxy
public class App {
  public static void main(String[] args) {
    new SpringApplicationBuilder(App.class).web(true).run(args);
  }
}
