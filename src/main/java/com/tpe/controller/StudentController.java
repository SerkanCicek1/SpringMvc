package com.tpe.controller;

import com.tpe.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")//http://localhost:8080/SpringMVC/students
//class:tüm methodlar için
// method level :sadece o method için mapping yapar
public class StudentController {

    //controllerdan requeste göre geriye ModelAndView(data+view name) veya
    //String tipinde view name döndürülür.
    //@RequestMapping("/students/hi")
    @GetMapping("/hi")
    public ModelAndView sayHi(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("message","Hi, ");
        mav.addObject("messagebody","I am a Student Management System");
        mav.setViewName("hi");//hi.jsp
        return mav;
    }
    //view resolver mav içindeki view name e göre hi.jsp dosyasını bulur.
    //mav içindeki model ı hi.jsp içerisine bind eder.

    //1-Student Creation
    //kullanicidan bilgileri almak icin  form gosterelim
    @GetMapping("/new")//http://localhost:8080/SpringMVC/students/new
    public String sendStudentForm(@ModelAttribute("student") Student student){
        return "studentForm";
    }

    //@ModelAttribute ann:Student formundaki bilgilerle Student tipinde bir obje olusturur,
    // daha sonra bu objenin kullanilmasini saglar. View ile controller arasinda data transferini saglar.

    //formun submit://http://localhost:8080/SpringMVC/students/saveStudent, method:POST
    //tum listeyi gosterelim
    @PostMapping("/saveStudent")
    public String createStudent(@ModelAttribute Student student){ // @ModelAttribute("student") burada optional


        return null;
    }


}