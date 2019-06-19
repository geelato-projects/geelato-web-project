::设置输出为UTF-8
CHCP 65001

:: 若需指定配置文件可加上 --spring.config.location=/your_path_of_application_file/application.properties
java -Dfile.encoding=UTF-8 -jar ../target/geelato-web-project-1.0.1-SNAPSHOT.jar
pause