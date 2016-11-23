package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@SpringBootApplication
@RestController
public class Main {

  @RequestMapping("/")
  public Map helloWorld() {
    return Collections.singletonMap("message", "Hello World");
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(Main.class, args);
  }

}
