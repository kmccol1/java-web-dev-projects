package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class SkillsController
{
    @GetMapping()
    @ResponseBody
    public String getSkills()
    {
        return "<h1>Skillz Tracker </h1>" +
                "<h2>List of skills: </h2>" +
                "<ol>" +
                "<li> Python</li> " +
                "<li>Java</li>" +
                "<li>C++</li>" +
                "</ol>";
    }

    //@GetMapping("form")
    @RequestMapping(value="form", method=RequestMethod.GET)
    @ResponseBody
    public String doForm()
    {
        String html = "<html>" +
                      "<body>" +
                "<form action='skillzPost' method='post'>" +
                "<input type = 'text' name = 'name' />" +
                "<select name = 'selector1'>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'C++'>C++</option>" +
                "</select>" +
                "<select name = 'selector2'>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'C++'>C++</option>" +
                "</select>" +
                "<select name = 'selector3'>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'C++'>C++</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Create!' />" +
                "</form>" +
                "</html>" +
                "</body>";

        return html;
    }

    public static String createMessage(String name, String selector1, String selector2, String selector3) {

        return "<h1>" + name + "</h1>" +
                "<h2>List of skills: </h2>" +
                "<ol>" +
                "<li>" + selector1 + "</li>" +
                "<li>" + selector2 + "</li>" +
                "<li>" + selector3 + "</li>" +
                "</ol>";
    }

    @RequestMapping(value="skillzPost", method = RequestMethod.POST)
    @ResponseBody
    public String skillzPost(@RequestParam String name, @RequestParam String selector1, @RequestParam String selector2, @RequestParam String selector3) {
        if (name == null) {
            name = "World";
        }

        return createMessage(name, selector1, selector2, selector3);

        // For a bonus mission, students can change this response text to look nicer.
        // This is subjective, but students should be modifying the HTML of the response string.
    }

}
