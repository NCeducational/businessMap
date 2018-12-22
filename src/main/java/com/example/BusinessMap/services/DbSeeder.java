package com.example.BusinessMap.services;

import com.example.BusinessMap.entity.Type;
import com.example.BusinessMap.entity.Place;

import com.example.BusinessMap.repositories.PlaceRepository;
import com.example.BusinessMap.repositories.TypeRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    @Autowired
    private PlaceRepository placeRepository;
    @Autowired
    private TypeRepository typeRepository;


    PlaceService placeService = new PlaceService(placeRepository,typeRepository);

    public DbSeeder(PlaceRepository placeRepository, TypeRepository typeRepository, PlaceService placeService) {
        this.placeRepository = placeRepository;
        this.typeRepository = typeRepository;
    }


    @Override
    public void run(String... args) throws Exception {

     /*   System.out.println("######PLACES LIST AT BEGINNING######");
        System.out.println(placeRepository.findAll());
        System.out.println("###################################\n\n");*/

        // drop all places
      //  this.placeRepository.deleteAll();
        //this.typeRepository.deleteAll();
        //typeRepository.saveAll(typesToAdd());

        Place i5 = new Place(
                "Friends Time",
                new Point(59.935939, 30.359860),
                new ObjectId("5c175524f1e24f2418e3d4e0"),
                5,
                1000
        );

       //   List<Place> placesList = new ArrayList<>();
       //    placesList.add(i5);
       //    placeRepository.saveAll(placesList);

//        System.out.println(Querys.getOnly(placeRepository, bisenessTypeRepository));

        //Parser parser = new Parser(placeRepository,typeRepository);
        //parser.parse();


        //List<Type> types = typeRepository.findAll();
        //System.out.println("######PLACES LIST AFTER ADDING######");
        //   System.out.println(placeService.getPlacesInformation(59.932229, 30.330791, 50));
        //System.out.println("###################################\n\n");
    }



}
