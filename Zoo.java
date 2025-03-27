import java.util.*;
public class Zoo{
    private String species;
    private String name;
    private int age;
    private boolean fed;
    private ArrayList<String> toys = new ArrayList<String>();
    public Zoo(String s, String n, int a, boolean b){
        species = s;
        name = n;
        age =a;
        fed = b;
    }
    public String getName(){
        return name;
    }
    public String getSpecies(){
        return species;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return name + " is a " + species + ", who is " + age + " years old!";
    }
    public String bdayCelebration(){
        age = age + 1;
        return "Today is " + name + "'s birthday! They turn "+ age+ "!";
    }
    public void addToy(String t){
        toys.add(t);
    }
    public void feedAnimal(){
        fed = true;
    }
    public boolean getFed(){
        return fed;
    }
    public int numToys(){
        int count = 0;
        for(int i = 0; i < toys.size(); i++){
            count += 1;
        }
        return count;
    }


}