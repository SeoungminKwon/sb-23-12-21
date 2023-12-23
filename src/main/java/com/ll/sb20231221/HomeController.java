package com.ll.sb20231221;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String hoem() {
        return "안녕하세요";
    }


    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "개발자 커뮤니티";
    }

    @GetMapping("/calc")
    @ResponseBody
    public String calc(int a, int b) {
        return "계산기";
    }

    @GetMapping("/calc3")
    @ResponseBody
    public String calc3(
            @RequestParam(defaultValue = "0") int a,
            @RequestParam(defaultValue = "0") int b) {
        return "계산결과 : %d".formatted(a + b);
    }

    @GetMapping("/calc21")
    public String calc21(Model model){
        model.addAttribute("v1", "안녕");
        model.addAttribute("v2", "반가워");
        return "calc21";
    }

    int num = 0;

    @GetMapping("/calc22")
    @ResponseBody
    public int calc22() {
        num++;
        return num;
    }

}
