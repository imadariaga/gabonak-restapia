package eus.uni.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eus.uni.dam.dao.EskatzaileaDAO;
import eus.uni.dam.model.Eskatzailea;

import java.util.List;

@RestController
@RequestMapping("/")
public class EskatzaileaController {

	   @Autowired
	   private EskatzaileaDAO eskatzaileaDao;
	
	   @GetMapping("eskatzaileak")
	    public List<Eskatzailea> getEskatzaileak() {
	        return eskatzaileaDao.findAll();
	    }
}
