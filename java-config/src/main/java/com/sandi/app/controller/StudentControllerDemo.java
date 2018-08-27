package com.sandi.app.controller;

import com.sandi.app.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentControllerDemo {

    @RequestMapping(value="/admissionFrom.html", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm(){
        ModelAndView modelAndView = new ModelAndView("AdmissionForm");
        //modelAndView.addObject("headerMsg", "KIET colledge of Ghaziabad");
        return modelAndView;
    }

    /*@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name, @RequestParam("studentHobby") String hobby){
        ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");

        Student student = new Student();
        student.setStudentName(name);
        student.setStudentHobby(hobby);

        modelAndView.addObject("msg", "Detail submitted by you :: name "+ name+" hobby "+hobby);
        modelAndView.addObject("student", student);
        return modelAndView;
    }*/

    @RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student){
        ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
        //no need to pass on view with ModelAndView
        //modelAndView.addObject("headerMsg", "You  form submitted successfully");
       // modelAndView.addObject("student", student);
        return modelAndView;
    }

    //same annotation at method level
    @ModelAttribute
    public void addingCommonObject(Model model){
        model.addAttribute("headerMsg", "KIET colledge of Ghaziabad");
    }

}
