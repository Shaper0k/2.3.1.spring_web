package web.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return  new Class<?>[]{
                WebConfig.class,
                JpaConfig.class
        };
    }



    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class,
                JpaConfig.class
        };
    }



    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}