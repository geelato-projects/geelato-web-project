package org.geelato.web.project;

import org.geelato.web.platform.PlatformApplication;
import org.springframework.boot.SpringApplication;

// 注意PlatformApplication中已有@SpringBootApplication，这里不需再写该注解，否则会执行两次run方法
public class ProjectApplication extends PlatformApplication {
//    private static Logger logger = LoggerFactory.getLogger(ProjectApplication.class);

    @Override
    public void run(String... strings) throws Exception {
        super.run(strings);
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }
}
