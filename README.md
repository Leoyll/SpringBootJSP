# SpringBootJSP

It is a demo project to show how to display JSP web under SpringBoot framework.

#Key Notes:
pom.xml
    <!-- the following dependency is used to comply JSP-->
		<dependency>
                <groupId>org.apache.tomcat.embed</groupId>
                <artifactId>tomcat-embed-jasper</artifactId>
                <scope>provided</scope>
		</dependency>
xxController.java
//can not be @RestController
@Controller
public class xxController  ......  
