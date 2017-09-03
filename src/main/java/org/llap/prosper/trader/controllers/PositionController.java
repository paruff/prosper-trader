package org.llap.prosper.trader.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.llap.prosper.trader.models.Position;
import org.llap.prosper.trader.services.PositionService;


@Controller
public class PositionController {

    @Autowired
    private PositionService positionService;

    @RequestMapping(value = "/positions", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("positions", positionService.findAll());
        System.out.println("Returning rpoducts:");
        return "positions";
    }    
    
    @RequestMapping("position/{id}")
    public String showProduct(@PathVariable int id, Model model){
        model.addAttribute("position", positionService.findById(id));
        return "positionshow";
    }

    @RequestMapping("position/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("position", positionService.findById(id));
        return "positionform";
    }

    @RequestMapping("position/new")
    public String newProduct(Model model){
        model.addAttribute("position", new Position());
        return "positionform";
    }

    @RequestMapping(value = "position", method = RequestMethod.POST)
    public String saveProduct(Position position){
        positionService.savePosition(position);
        return "redirect:/position/" + position.getPositionId();
    }
    
}
