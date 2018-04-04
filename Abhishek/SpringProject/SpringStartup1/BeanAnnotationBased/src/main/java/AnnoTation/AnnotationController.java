package AnnoTation;  
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;  
    @Controller  
    public class AnnotationController{  
       @RequestMapping(value="/hello",method=RequestMethod.GET)  
       @ResponseBody
        public static String main(String args[]) throws Exception {  
        	
        	//System.out.println("HEllo");
        	 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);     
        	 ConfiguraTion obj = (ConfiguraTion) context.getBean(ConfiguraTion.class);
        	    obj.config();
        	    return "well done Abhishek";
        	   //  
        }  
        
    }  