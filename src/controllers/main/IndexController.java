package controllers.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index(Model model) {
        setTitle(model, "Hello, Spring!");
        ArrayList<ArrayList> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            ArrayList<String> k = new ArrayList<>();
            k.add(i + "번째 제목");
            k.add(i + "번째 내용");
            list.add(k);
        }
        model.addAttribute("lastList", list);
        model.addAttribute("isBoard", list);
        return "index";
    }

    @RequestMapping(value = "/board")
    public String board(Model model) {
        setTitle(model, "Hello, Spring - 자유 게시판");
        model.addAttribute("lastList", test("번째 자유게시판 제목", "번째 자유게시판 내용"));
        return "index";
    }

    private ArrayList<ArrayList> test(String s, String s2) {
        ArrayList<ArrayList> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            ArrayList<String> k = new ArrayList<>();
            k.add(i + s);
            k.add(i + s2);
            list.add(k);
        }
        return list;
    }

    @RequestMapping(value = "/question")
    public String question(Model model) {
        setTitle(model, "Hello, Spring - 질문 게시판");
        model.addAttribute("lastList", test("번째 질문 게시판 제목", "번째 질문 게시판 내용"));
        return "index";
    }

    private Model setTitle(Model model, String s) {
        return model.addAttribute("title", s);
    }

    @RequestMapping(value = "/trade")
    public String trade(Model model) {
        setTitle(model, "Hello, Spring - 거래 게시판");
        model.addAttribute("lastList", test("번째 거래 게시판 제목", "번째 거래 게시판 내용"));
        return "index";
    }

    @RequestMapping(value = "/profile")
    public String profile(Model model) {
        setTitle(model, "Hello, Spring - 프로필 정보");
        model.addAttribute("lastList", test("번째 거래 게시판 제목", "번째 거래 게시판 내용"));
        return "index";
    }

    @RequestMapping(value = "/edit")
    public String edit(Model model) {
        setTitle(model, "Hello, Spring - 글 작성하기");
        return "edit";
    }
}