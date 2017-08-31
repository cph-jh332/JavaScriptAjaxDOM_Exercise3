/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;

/**
 *
 * @author craci
 */
public final class PersonList {
    private static ArrayList<Person> pl = new ArrayList();

    /**
     * @return the pl
     */
    public static ArrayList<Person> getPl() {
        return pl;
    }
    
    public static void addPerson(Person person){
        pl.add(person);
    }
}
