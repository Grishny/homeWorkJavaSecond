package grishny.ru;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapClass {
    HashMap<String, Integer> priceBooks = new HashMap<>();

    public void addPriceForBooks(String str, Integer i) {
        priceBooks.put(str, i);
    }

    public void getPriceForBook (String str){
        System.out.println("Цена изменена для книги \"Мастер и Маргарита\" : " + priceBooks.get(str));
    }

    public void displayAllPriceListOfBooks(){
        Iterator<Map.Entry<String, Integer>> iterator = priceBooks.entrySet().iterator();
        do {
            Map.Entry<String, Integer> entry = iterator.next();
            String titleBooks = entry.getKey();
            Integer costOfBooks = entry.getValue();
            System.out.println("Название книги: " + titleBooks + ", Цена книги: " + costOfBooks);
        } while (iterator.hasNext());
    }

    public  void removeOneBook(String str){
        priceBooks.remove(str);
    }

    public void clearPriesBooks(){
        priceBooks.clear();
    }

    public void priceBooksIsEmpty(){
        if (priceBooks.isEmpty() == true){
            System.out.println("Прайс удален");
        } else {
            System.out.println("Вы все еще не удалили прайс");
        }
    }
}