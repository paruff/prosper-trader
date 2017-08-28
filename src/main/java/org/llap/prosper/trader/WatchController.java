package org.llap.prosper.trader;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WatchController {

    @GetMapping("/watch")
    public String watchForm(Model model) {
        model.addAttribute("watch", new Watch());
        return "watch";
    }

    @PostMapping("/watch")
    public String watchSubmit(@ModelAttribute Watch watch) {
        return "result";
    }

}
