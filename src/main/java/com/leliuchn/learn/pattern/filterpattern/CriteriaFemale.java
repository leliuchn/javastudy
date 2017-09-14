package com.leliuchn.learn.pattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leliuchn on 16/11/22.
 */
public class CriteriaFemale implements Criteria{

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
