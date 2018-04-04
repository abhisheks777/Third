package AnnoTation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="AnnoTation")
public class AppConfig {
    @Bean
	public ConfiguraTion getPhone() {
		// TODO Auto-generated method stub
    	ConfiguraTion h=new ConfiguraTion();
      return h;
	}

}
