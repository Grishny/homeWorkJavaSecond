package grishny.ru;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    HashSet<String> fruits = new HashSet<>();

    public void addFruits(String str) {
        fruits.add(str);
    }

    public void showAllFruits() {
        Iterator i = iteratorFruits(fruits);
        while (i.hasNext())
            System.out.println(i.next());
    }
    public Iterator<String> iteratorFruits(HashSet set) {
        Iterator<String> i = set.iterator();
        return i;
    }

    public void deleteFruitFromTheList(String str) {
        fruits.remove(str);
    }

    public void checkFruitDeletion(String str) {
        if (fruits.contains(str) == false) {
            System.out.println("Не люблю киви: его не жалко");
        } else {
            System.out.println("Тебе придется съесть киви");
        }
    }

    public void  changeFruit(String str) {
        fruits.contains(str);
    }

    public void clearFruits() {
        fruits.clear();
    }

    public void  checkDeletionOfAllFruits() {
        if (fruits.isEmpty() == true) {
            System.out.println("Вы съели все фрукты");
        }  else {
            System.out.println("Вы еще не съели все фрукты");
        }
    }
}
