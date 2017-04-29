/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.People;

/**
 *
 * @author Juan
 */
public class Person {
    
    /**
     * Cadena de texto protected que guarda el nombre de una persona
     */
    protected String firstName;
    
    /**
     * Cadena de texto protected que guarda el apellido de una persona.
     */
    protected String lastName;
    
    /**
     * Número entero protected que guarda la edad en años de una persona.
     */
    protected int age;
    
    /**
     * Cadena de texto protected que guarda la dirección de una persona.
     */
    protected String address;
    
    /**
     * Cadena de texto protected que guarda el teléfono de una persona.
     */
    protected String telephone;
    
    /**
     * Cadena de texto protected que guarda la dirección de correo electrónico de una persona.
     */
    protected String e_mail;
    
    /**
     * Constructor Vacío define todos los atributos a NOT DEFINED o 0 en el caso de age.
     */
    public Person (){
       this.firstName = "NOT DEFINED";
       this.address = "NOT DEFINED";
       this.e_mail = "NOT DEFINED";
       this.lastName = "NOT DEFINED";
       this.telephone = "NOT DEFINED";
       
       this.age = 0;
    }
    
    /**
     *
     * @param p
     * 
     * Constructor de copia recibe un objeto Person del que se copian los datos.
     */
    public Person (Person p){
       this.firstName = p.firstName;
       this.address = p.address;
       this.e_mail = p.e_mail;
       this.lastName = p.lastName;
       this.telephone = p.telephone;
       
       this.age = p.age;
    }
    
    /**
     *
     * @param firstName
     * @param address
     * @param e_mail
     * @param lastName
     * @param telephone
     * @param age
     * 
     * Constructor que recibe datos individuales y los asigna a sus respectivos atributos.
     */
    public Person (String firstName, String address, String e_mail, String lastName, String telephone, int age){
       this.firstName = firstName;
       this.address = address;
       this.e_mail = e_mail;
       this.lastName = lastName;
       this.telephone = telephone;
       
       this.age = age;
    }

    /**
     * Clase para redefinir el atributo firstName
     * @param firstName
     */
    
    public void setfirstName(String  firstName){
        this.firstName = firstName;
    }
    
    /**
     * Clase para redefinir el atributo address
     * @param address
     */
    public void setaddress(String address){
        this.address = address;
    }
    
    /**
     * Clase para redefinir el atributo e_mail
     * @param e_mail
     */
    public void sete_mail(String e_mail){
        this.e_mail = e_mail;
    }
    
    /**
     * Clase para redefinir el atributo lastName
     * @param lastName
     */
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    
    /**
     * Clase para redefinir el atributo telephone
     * @param telephone
     */
    public void settelephone(String telephone){
        this.telephone = telephone;
    }
    
    /**
     * Clase para redefinir el atributo age
     * @param age
     */
    public void setage(int age){
        this.age = age;
    }
    
    /**
     * Mètodo get para obtener el nombre de una Persona
     * @return firstName
     */
    public String getfirstName(){
        return this.firstName;
    }
    
    /**
     *Mètodo get para obtener la direcciòn de una Persona
     * @return address
     */
    public String getaddress(){
        return this.address;
    }
    
    /**
     *Mètodo get para obtener el email de una Persona
     * @return e_mail
     */
    public String gete_mail(){
        return this.e_mail;
    }
    
    /**
     *Mètodo para obtener el apellido de una Persona
     * @return lastName
     */
    public String getlastName(){
        return this.lastName;
    }
    
    /**
     *Mètodo para obtener el telèfono de una Persona
     * @return telephone
     */
    public String gettelephone(){
        return this.telephone;
    }
    
    /**
     *Mètodo para obtener la edad de una Persona
     * @return age
     */
    public int getage(){
        return this.age;
    }
    
    
    
    
    /**
     * método que regresa una cadena de texto donde se tienen los datos de una
persona. 
     * La cadena de texto se forma con pares “nombre_atributo: valor”, y dando salto de línea entre los mismos. 
     * Por ejemplo: “NOMBRE: Juan\nAPELLIDO: Pérez\n...”.
     */
    @Override
    public String toString(){
        return "NOMBRE: " + this.firstName + "\nAPELLIDO: " + this.lastName + "\nEDAD: " + this.age + "\nEMAIL: " + this.e_mail + "\nTELEFONO: " + this.telephone + "\nDIRECCION: " + this.address ;
    }
    
    
}
