package org.geelato.web.crm;

import org.geelato.web.crm.m.base.Company;
import org.geelato.web.platform.boot.BootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.geelato"})
public class ProjectApplication extends BootApplication {
    private static Logger logger = LoggerFactory.getLogger(ProjectApplication.class);

    @Override
    public void run(String... strings) throws Exception {
        super.run(strings);
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }
}
