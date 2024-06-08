/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

/**
 *
 * @author Dell
 */
public class Person {
    private String name;
    private String lastname;
    private float heigth;
    private int age;
    
    
    public Person(){
        /**
         * constructor vacio
         */
    }
    /**
     * Constructor con parametros
     * @param name
     * @param lastname
     * @param heigth
     * @param age 
     */
    public Person(String name, String lastname, float heigth, int age){
        this.name=name;
        this.lastname=lastname;
        this.heigth=heigth;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nNombre:" + name + "\nApellido:" + lastname + "\nAltura:" + heigth + "\nEdad:" + age + "\n";
    }
    
}
