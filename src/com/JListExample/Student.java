package com.JListExample;

public class Student {
     String firstName;
     String lastName;
     int cne;

    public Student(String firstName, String lastName, int cne) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cne = cne;
    }

    @Override
    public String toString() {
        return "{ name="+ firstName +", cne=" + cne + '}';
    }


    public String toStringLong(){
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cne=" + cne +
                '}';
    }


    public void afficher(){
         System.out.println("**********************");
         System.out.println("firstname = "+firstName);
         System.out.println("lastName = "+lastName);
         System.out.println("cne = "+cne);
         System.out.println("**********************");
     }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCne() {
        return cne;
    }

    public void setCne(int cne) {
        this.cne = cne;
    }
}
