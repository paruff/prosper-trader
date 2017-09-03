package org.llap.prosper.trader.controllers;

import java.util.List;

import org.llap.prosper.trader.models.Watch;
import org.llap.prosper.trader.services.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WatchController {


	   @Autowired
	   private WatchService watchService;
	
    @GetMapping("/watch")
    public String watchForm(Model model) {
        model.addAttribute("watch", new Watch());
        return "watch";
    }

   /* @RequestMapping("/watch/{symbol}")
    public Watch watch(@PathVariable("symbol") String symbol){
        return repo.findBySymbol(symbol);
    }*/
   
    
    @ModelAttribute("allWatches")
    public List<Watch> populateWatches() {
        return this.watchService.findAll();
    }
    
    @RequestMapping("/watchList")
    public String home(Model model) {
  //      List<Watch> watchList = watchService.findAll();
  //      model.addAttribute("watchList", watchList);
        return "watchlist";
    }
    

    @RequestMapping(value = "/watches", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("watches", watchService.listAllWatches());
        System.out.println("Returning rpoducts:");
        return "watches";
    }
    
    @PostMapping("/watch")
    public String watchSubmit(@ModelAttribute Watch watch) {
        return "result";
    }

}
