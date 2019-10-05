package sheridan.qina.mycatlist2;

public class Cat {
    private String Name;
    private String Breed;
    private String Gender;
    private int Age;

    public Cat(String n, String b, String g, int a){
        Name = n;
        Breed = b;
        Gender = g;
        Age = a;
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
}
