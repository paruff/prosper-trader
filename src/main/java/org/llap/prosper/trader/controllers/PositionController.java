package org.llap.prosper.trader.controllers;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.llap.prosper.trader.models.Position;
import org.llap.prosper.trader.services.PositionService;


@Controller
public class PositionController {

    @Autowired
    private PositionService positionService;


  /*  @RequestMapping("/")
    public String home(Model model) {
        List<Post> latest5Posts = postService.findLatest5();
        model.addAttribute("latest5posts", latest5Posts);

        List<Post> latest3Posts = latest5Posts.stream()
                .limit(3).collect(toList());
        model.addAttribute("latest3posts", latest3Posts);

        return "index";
    }
*/
    @RequestMapping("/posts/view/{id}")
    public String view(@PathVariable("id") Long id,
                       Model model) {
    	Position position = positionService.findById(id);

 /*       if (position == null) {
            notificationService.addErrorMessage(
                    "Cannot find post: " + id);
            return "redirect:/";
        }*/

        model.addAttribute("position", position);
        return "/position/index";
    }

}