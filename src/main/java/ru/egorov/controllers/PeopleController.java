package ru.egorov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.egorov.dao.PersonDAO;

@Controller
@RequestMapping("/people")
public class PeopleController {
    private final PersonDAO personDAO;

    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    //Получение всех людей
    @GetMapping()
    public  String index(Model model){
        model.addAttribute("people", personDAO.index());
        return "people/index";
    }

    //Показать одного человека
    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        model.addAttribute("person", personDAO.show(id));
        return "people/show";
    }
}