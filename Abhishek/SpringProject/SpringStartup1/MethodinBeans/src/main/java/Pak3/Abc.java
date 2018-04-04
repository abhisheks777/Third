package Pak3;  
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;  
    @Controller  
    public class Abc{  
        @RequestMapping(value="/hello",method=RequestMethod.GET)  
        @ResponseBody
        public void  Coll() {  
        	 ApplicationContext context = new ClassPathXmlApplicationContext
        	         ("spring/application-config.xml");
        	      
        	      Message obj = (Message) context.getBean("xyz");
        	     
        	      //return s;
        	     Message obj1 = (Message) context.getBean("xyz1");
        	     String s= obj.getMessage();
        	     //String s1= obj1.getMessage();
        	     System.out.println(s);//
        }  
        
    }  