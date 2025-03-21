package com.learning.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class HomeController {

    @ModelAttribute("course")
    String courseName() {
        return "Java Spring";
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/alien")
        public String alien() {
            return "alien";
        }

    @RequestMapping("calculate")
    public ModelAndView calculate(int num1, @RequestParam("num2") int secondNum, ModelAndView mv) {
        int result = num1 + secondNum;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien) {
        return "resultAlien";
    }

    @RequestMapping("getFromApi")
    public void apiRequest(HttpServletResponse res) throws IOException {
        res.setContentType("application/json");
        res.getWriter().write("{ 'key1': 'value1', 'key2': 'value2' }");

    }

//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(int id, @RequestParam("name") String name, ModelAndView mv) {
//        Alien alien = new Alien();
//        alien.setId(id);
//        alien.setName(name);
//        mv.addObject(alien);
//        mv.setViewName("resultAlien");
//        return mv;
//    }


//    @RequestMapping("calculate")
//    public String calculate(int num1, @RequestParam("num2") int secondNum, Model model) {
//        int result = num1 + secondNum;
//        model.addAttribute("result", result);
//        return "result";
//    }

//    @RequestMapping("calculate")
//    public String calculate(HttpServletRequest req, HttpSession session) {
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//
//        session.setAttribute("result", result);
//
//        return "result.jsp";
//    }
}
