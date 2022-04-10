package za.ac.cput.factory;
/*
   Titilayo Nikelwa Ore-ofe Akinjole - 220283982
   ResourcesFactory.java
   April 2022
 */

import za.ac.cput.entity.Resources;
import za.ac.cput.util.Helper;
public class ResourcesFactory {
    public static Resources createResources(String textbooks, String exercises, String slideshows){
        if (Helper.isEmpty(textbooks) || Helper.isEmpty(exercises) || Helper.isEmpty(slideshows)){
            return null;
        }
        return new Resources.Builder().setResources_id(Helper.generateSmallerId())
                .setTextbooks(textbooks)
                .setExercises(exercises)
                .setSlideshows(slideshows)
                .build();
    }
}