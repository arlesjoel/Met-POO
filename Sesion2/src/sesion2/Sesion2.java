/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Sesion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person leonardo= new Person ("Leonardo","Moncada",1.79f,23);
        Person belen=new Person("Belen","Acuna",1.63f,20);
        Person jackeline=new Person("Jackeline","Sanchez",1.54f,56);
        Person eduardo=new Person("Eduardo","Sanchez",1.78f,65);
        Person josue=new Person("Josue","Rivera",1.78f,34);
        
        ArrayList<Person> people=new ArrayList<>();
        people.add(belen);
        people.add(leonardo);
        people.add(jackeline);
        people.add(eduardo);
        people.add(josue);
        for(Person person: people){
        System.out.println(person);
    }
    }
    
}
