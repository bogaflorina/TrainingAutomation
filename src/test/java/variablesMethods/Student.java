package variablesMethods;

import org.testng.annotations.Test;

public class Student {
 //sablon care defineste properietatile si comportamentul unei entitati specifice
    //intr-un fisier Java putem avea maimulte clase difenentiate pe baza numelui
    //intr-o clasa putem defini proprietatile si actiunile entitatii
    //variabila=proprietatea unei clase
    //variabilele pot fi de 2 feluri: gloabale si locale
    //

    public String firstName;
    public String lastName;
    public Integer age;
    public int registrationNumber;
    public String address;
    public Double height;
    public Float weight;
    public Character sex;
    public Boolean graduated;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Boolean getGraduated() {
        return graduated;
    }

    public void setGraduated(Boolean graduated) {
        this.graduated = graduated;
    }

    @Test
    public void initiateStudent()
    {
        setFirstName("Doe");
        setLastName("jon");
        setSex('M');
        setRegistrationNumber(189700);
        setAge(31);
        setWeight(58.45f);
        setHeight(1.71);
        setGraduated(false);
        setAddress("London, King route, no.45");
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height and weight : " + getHeight() + "m" + " " + getWeight() + "kg");
        System.out.println("Sex: " + getSex());
        System.out.println("Address: " + getAddress());
        System.out.println("Graduated: " + getGraduated());

        calculateAverage();
    }

    public void calculateAverage(){
        Integer note1 = 8;
        Integer note2 = 8;
       Integer note3 = 7;

       Double average = (((double)(note1 + note2 + note3))/3);
       System.out.println("The notes average is: " + average);

        }

}
