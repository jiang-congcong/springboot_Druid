springboot2.1.13整合阿里开源的Druid数据源监控

使用方法：浏览器输入http://localhost:8080/druid，然后回车，自动跳转到登录界面，用户名：admin，密码：123456，用户名和密码修改方法在src/main/java/com/ccj/springboot07_data/config/DruidConfig.java的statViewServlet方法中
每次请求数据库都可以在web可视化界面中看到

src/main/resources/application.yml里面的用户名和密码修改为自己的数据库用户名和密码，数据库url记得修改
数据库mysql驱动版本在pom.xml中自行修改
<dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
            <version>5.1.34</version>
</dependency>
