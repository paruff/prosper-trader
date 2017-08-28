package org.llap.prosper.trader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WatchController {

//	//Autowire your CrudRepo of Watch
//	   @Autowired
//	   WatchRepository repo;
//	
    @GetMapping("/watch")
    public String watchForm(Model model) {
        model.addAttribute("watch", new Watch());
        return "watch";
    }

   /* @RequestMapping("/watch/{symbol}")
    public Watch watch(@PathVariable("symbol") String symbol){
        return repo.findBySymbol(symbol);
    }
   */ 
    @PostMapping("/watch")
    public String watchSubmit(@ModelAttribute Watch watch) {
        return "result";
    }

}
