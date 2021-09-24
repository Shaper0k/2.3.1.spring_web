package web.config;

import hiber.config.AppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return  new Class<?>[]{
                WebConfig.class,
                AppConfig.class
        };
    }



    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class,
                AppConfig.class
        };
    }



    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}