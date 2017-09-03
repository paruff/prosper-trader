package org.llap.prosper.trader.controllers;

import org.llap.prosper.trader.models.Watch;
import org.llap.prosper.trader.services.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WatchController {


	   @Autowired
	   private WatchService watchService;
 

    @RequestMapping(value = "/watches", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("watches", watchService.listAllWatches());
        System.out.println("Returning rpoducts:");
        return "watches";
    }    
    
    @RequestMapping("watch/{id}")
    public String showWatch(@PathVariable int id, Model model){
        model.addAttribute("watch", watchService.findById(id));
        return "watchshow";
    }

    @RequestMapping("watch/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("watch", watchService.findById(id));
        return "watchform";
    }

    @RequestMapping("watch/new")
    public String newWatch(Model model){
        model.addAttribute("product", new Watch());
        return "watchform";
    }

    @RequestMapping(value = "watch", method = RequestMethod.POST)
    public String saveWatch(Watch watch){
        watchService.saveWatch(watch);
        return "redirect:/watch/" + watch.getWatchId();
    }
    
}
