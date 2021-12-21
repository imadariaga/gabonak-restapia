package eus.uni.dam.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import eus.uni.dam.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

@Repository
public class EskatzaileaDAO {
	@Autowired
    private MongoClient client;
	
    private MongoCollection<Eskatzailea> collection;

    @PostConstruct
    void datuakKargatu() {
        collection = client.getDatabase("gabonak").getCollection("eskatzaileak",Eskatzailea.class);
    }
    public List<Eskatzailea> findAll(){
    	return collection.find().into(new ArrayList<>());
    }
    /*
    public Eskatzailea save(Eskatzailea esk){
    	eskatzaileak.add(esk);
    	return esk;
    }
    */
} 
