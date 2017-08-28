package org.llap.prosper.trader;

//import org.llap.prosper.trader.model.WatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableScheduling
public class ProsperTraderApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ProsperTraderApplication.class, args);
		
//		repo.save(new Watch(1, "T"));
//		repo.save(new Watch(2, "TLT"));
//		repo.save(new Watch(3, "FXC"));
//		repo.save(new Watch(4, "GLD"));
//		repo.save(new Watch(5, "DIA"));

	}

}

