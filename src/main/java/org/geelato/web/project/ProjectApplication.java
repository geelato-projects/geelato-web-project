package org.geelato.web.project;

import org.geelato.web.platform.PlatformApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.geelato"})
public class ProjectApplication extends PlatformApplication {
    private static Logger logger = LoggerFactory.getLogger(ProjectApplication.class);


    @Override
    public void run(String... strings) throws Exception {
        super.run(strings);
    }


    public static void main(String[] args) {
//        if (args.length == 0) {
//            args = new String[1];
//            args[0] = "startFromMain";
//        }
        SpringApplication.run(ProjectApplication.class, args);
    }
}
