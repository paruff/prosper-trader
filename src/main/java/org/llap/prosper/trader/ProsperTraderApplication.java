package org.llap.prosper.trader;

import org.llap.prosper.trader.model.Watch;
import org.llap.prosper.trader.model.WatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProsperTraderApplication {

	@Autowired
	private WatchRepository repo;
	
	@RequestMapping("/watch/{symbol}")
	public Watch watch(@PathVariable("symbol") String symbol){
		return repo.findBySymbol(symbol);
	}	

	
	public static void main(String[] args) {
		SpringApplication.run(ProsperTraderApplication.class, args);
	}

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}

