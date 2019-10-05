package sheridan.qina.mycatlist2;

public class Cat {
    private String Name;
    private String Breed;
    private String Gender;
    private int Age;

    public Cat(String name, String breed, String gender, int age){
        Name = name;
        Breed = breed;
        Gender = gender;
        Age = age;
    }

    public String GetName(){
        return Name;
    }

    public String GetBreed(){
        return Breed;
    }

    public String GetGender(){
        return Gender;
    }

    public int GetAge(){
        return Age;
    }

    public String AgeToString(){
        return Age + "-year-old";
    }
}
