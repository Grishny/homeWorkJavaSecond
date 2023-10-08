package grishny.ru;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListClass {

    LinkedList<String> animals = new LinkedList<String>();

    public void addAFirstAnimals(String str){
        animals.addFirst(str);
    }

    public void addLastAnimal(String str){
        animals.addLast(str);
    }

    public void addAnimalsOfIndex(int i, String str){
        animals.add(i, str);
    }

    public void presenceOfAnimal(String str){
        System.out.println("Животное повявилоась в очереди: " + animals.contains(str));
    }

    public void removeAnimal(String str){
        animals.remove(str);
    }

    public  void  displayAnimals(){
        for (int i = 0; i < animals.size(); i++ ){
            System.out.println("Вид животного : " + animals.get(i));
        }
    }
    public void displayFirstAnimal(){
        System.out.println("Первое животное в очереди: " + animals.getFirst());
    }

    public void displayLastAnimal(){
        System.out.println("Последнее животное в очереди: " + animals.getLast());
    }

}
