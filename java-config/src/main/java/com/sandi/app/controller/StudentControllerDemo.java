package com.sandi.app.controller;

import com.sandi.app.model.Student;
import org.springframework.beans.propertyeditors.CurrencyEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class StudentControllerDemo {
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){

        SimpleDateFormat format = new SimpleDateFormat("mm-dd-yyyy");
        webDataBinder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(format, false));
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

    //same annotation at method level
    @ModelAttribute
    public void addingCommonObject(Model model){
        model.addAttribute("headerMsg", "KIET colledge of Ghaziabad");
    }

    @RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm() {

        ModelAndView model1 = new ModelAndView("AdmissionForm");

        return model1;
    }

    @ModelAttribute
    public void addingCommonObjects(Model model1) {

        model1.addAttribute("headerMessage", "Gontu College of Engineering, India");
    }

    @RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student, BindingResult result) {

        if(result.hasErrors()){
            ModelAndView model1 = new ModelAndView("AdmissionForm");

            return model1;
        }

        ModelAndView model1 = new ModelAndView("AdmissionSuccess");
        return model1;
    }


}
