public class Task1 {
    /*
    Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
    что 1 человек может иметь несколько телефонов.
     */
    public static void main(String[] args) {
        Teldirectory phonNumber = new Teldirectory();
        phonNumber.add("+79875647645", "Иванов Иван");
        phonNumber.add("+79005647645", "Иванов Иван");
        phonNumber.add("+73375647645", "Иванов Сергей");
        phonNumber.add("+74475647645", "Петров Петр");
        phonNumber.add("+72275647645", "Сидоров Коля");
        phonNumber.add("+79975647645", "Жданов Иван");
        System.out.println(phonNumber.searchByName("Иванов Сергей"));
        System.out.println(phonNumber.getDir());
    }
}
