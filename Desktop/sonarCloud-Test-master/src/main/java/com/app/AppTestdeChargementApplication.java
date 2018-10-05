package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.Entities.InterPublication;
import com.app.Entities.Publication;
import com.app.Entities.UserInterRepo;
import com.app.Entities.user;

@SpringBootApplication
public class AppTestdeChargementApplication {

	public static void main(String[] args) {
	ApplicationContext cntx = 	SpringApplication.run(AppTestdeChargementApplication.class, args);
	UserInterRepo in = cntx.getBean(UserInterRepo.class);
	InterPublication ip = cntx.getBean(InterPublication.class);
	/*for(int i=0; i<50; i++) {
		in.save(new user("jawadi"+i, "0622222222"+i,"photo"+i,"pass"+i));
	}
	user us = in.getOne(2L);
	for(int i=0; i<50; i++) {
		ip.save(new Publication("plz help me"+i, "photo1"+i, "photo2"+i, "12:00", "15:00",13*i,19*i, us, null));
	}*/
	}     
}
