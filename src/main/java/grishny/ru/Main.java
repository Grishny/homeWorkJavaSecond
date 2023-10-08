package grishny.ru;

public class Main {
    public static void main(String[] args) {
        ArrayListClass movies = new ArrayListClass();
        HashSetClass fruits = new HashSetClass();
        HashMapClass priceBooks = new HashMapClass();
        LinkedListClass animals = new LinkedListClass();

        System.out.println("Проверим фильмы: ");
        //добавить фильмы в список
        movies.addMoviesByValue("Harry Potter and the Sorcerer's Stone");
        movies.addMoviesByValue("The Chronicles Of Narnia");
        movies.addMoviesByValue("Sherlock Holmes");
        movies.addMoviesByValue("Knives Out");
        movies.addMoviesByValue("Pride and Prejudice");
        movies.addMoviesByValue("Gone with the Wind");
        movies.addMoviesByValue("American Pie");
        movies.addMoviesByValue("Pride and Prejudice");

       //проверить добавление всех фильмов
        movies.checkAddingAllMovies();

        //добавить фильм по индеку
        movies.addMovieByIndex(2, "Harry Potter and Deathly Hallows");

        //найти фильм по индексу
        System.out.println("Фильм добавился в список : " + movies.findNewMovieByIndex(2));

        //найти индекс нового фильма
        System.out.println("Index для нового фильма в списке = " + movies.displayIndexNewMovie("Harry Potter and Deathly Hallows"));

        //удалить фильма из списка
        String movieToBeDeleted = movies.getMovies(1);
        movies.deleteMovieFromTheList(movieToBeDeleted);

        //проверить, что фильм удален
        movies.checkMovieDeletion(movieToBeDeleted);

        //поменять название фильма по индексу
        movies.changeMovieTitle("American Pie 2", 6);

        //вывести новое название фильма
        movies.checkMovieTitleChange(6);

        //удалить все фильмы из списка
         movies.clear();

         //проверить, что все фильмы удалены
        boolean moviesHaveBeenWatched = movies.movieIsEmpty();
        movies.checkDeletionOfAllMovies(moviesHaveBeenWatched);

        System.out.println("---------------------------------------");

        System.out.println("Проверим фрукты: ");

        //добавить фрукты в множество
        fruits.addFruits("Апельсин");
        fruits.addFruits("Яблоко");
        fruits.addFruits("Банан");
        fruits.addFruits("Киви");

        //проверить добавление всех фруктов
        fruits.showAllFruits();

        //удалить фрукт из множества
        fruits.deleteFruitFromTheList("Киви");

        //проверить удаление фруктв
        fruits.checkFruitDeletion("Киви");

        //удалить все фрукты
        fruits.clearFruits();

        //прверить, что все фрукты удалены
        fruits.checkDeletionOfAllFruits();

        System.out.println("---------------------------------------");

        System.out.println("Проверим прайс для книг: ");

        //добавить key/value
        priceBooks.addPriceForBooks("Мастер и Маргарита", 536);
        priceBooks.addPriceForBooks("Преступление и наказание", 458);
        priceBooks.addPriceForBooks("Война и мир", 1056);
        priceBooks.addPriceForBooks("Мастер и Маргарита", 700); //перезапишет value с таким же key

        //получить прайс для книги, перезаписанным из-за однинакового key
        priceBooks.getPriceForBook("Мастер и Маргарита");

        //проверить все key/value
        priceBooks.displayAllPriceListOfBooks();

        //удалить книгу
        priceBooks.removeOneBook("Война и мир");

        //удалить весь прайс
         priceBooks.clearPriesBooks();

         //проверить, что все книги удалены
        priceBooks.priceBooksIsEmpty();

        System.out.println("---------------------------------------");
        System.out.println("Проверим животных: ");

        //добавить животных
        animals.addAFirstAnimals("Собака");
        animals.addAFirstAnimals("Кошка");
        animals.addLastAnimal("Корова");
        animals.addAFirstAnimals("Попугай");

        //добавить по индексу
        animals.addAnimalsOfIndex(3, "Медвель");

        //проверить наличие медведя
        animals.presenceOfAnimal("Медвель");

        //удалить животное
        animals.removeAnimal("Корова");

         //вывести всех животных
        animals.displayAnimals();

        //вывести первое животное
        animals.displayFirstAnimal();

        //вывести последнее животное
        animals.displayLastAnimal();
    }
}


