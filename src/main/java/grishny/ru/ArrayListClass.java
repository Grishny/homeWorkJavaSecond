package grishny.ru;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
        List<String> movies = new ArrayList<>();

        public void addMoviesByValue(String str) {
                movies.add(str);
        }

        public void checkAddingAllMovies() {
                for (String element : movies) {
                        System.out.println(element);
                }
        }

        public void addMovieByIndex(int index, String str) {
                movies.add(index, str);
        }

        public String findNewMovieByIndex(int index) {
                return movies.get(index);
        }

        public int displayIndexNewMovie(String str) {
                return movies.indexOf(str);
        }
        public String getMovies(int i) {
               return movies.get(i);
        }
        public void deleteMovieFromTheList(String str) {
               movies.remove(str);
        }

        public void checkMovieDeletion(String str) {
               if (movies.contains(str) == false) {
                        System.out.println("Фильм удален из списка");
                } else {
                        System.out.println("Фильм НЕ удален из списка");
                }
        }

        public void  changeMovieTitle(String str, int index) {
                movies.set(index, str);
        }

        public void  checkMovieTitleChange(int index) {
            System.out.println("Фильм в списке изменил название : " + movies.get(index));
        }

             public void clear() {
              movies.clear();
       }

        public boolean movieIsEmpty() {
            movies.isEmpty();
            return false;
        }

      public void  checkDeletionOfAllMovies(boolean moviesHaveBeenWatched) {
           if (movies.isEmpty() == true) {
            System.out.println("Вы посмотрели все фильмы");
        }  else {
            System.out.println("Вы еще не досмотерли все фильмы");
        }
    }
}
