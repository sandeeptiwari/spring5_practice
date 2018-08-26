package com.sandi.app.controller;

import com.sandi.app.model.Student;
import org.springframework.stereotype.Controller;
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

        modelAndView.addObject("msg", "Detail submitted by you :: name "+ student.getStudentName()
                +" hobby "+student.getStudentHobby());
        modelAndView.addObject("student", student);
        return modelAndView;
    }
}
