package controllers.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("title", "Hello, Spring!");
        ArrayList<ArrayList> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            ArrayList<String> k = new ArrayList<>();
            k.add(i + "번째 제목");
            k.add(i + "번째 내용");
            list.add(k);
        }
        model.addAttribute("lastList", list);
        return "index";
    }
}