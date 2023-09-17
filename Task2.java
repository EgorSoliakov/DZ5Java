import java.sql.Array;
import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class Task2 {
/*
Пусть дан список сотрудников:
Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
Написать программу, которая найдет и выведет повторяющиеся имена с
количеством повторений. Отсортировать по убыванию популярности.
Для сортировки можно использовать TreeMap, мы не успели, но я расписал
пример использования и прикрепил к материалам урока в файле TestTreeMap
*/
public static void main(String[] args) {
    Map<String, Integer> mapList = new HashMap<>();
    Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
    String text = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.";
    text = text.replace(",","");
    text = text.replace(".", "");
    String[] words = text.split(" ");
    List<String> words2 = new ArrayList<>();
    words2.add(words[0]);
    for (int i = 1; i < words.length; i++) {
        if (i%2 == 0){
            words2.add(words[i]);
        }
    }




    for (String word:words2){
        int count = 1;
        if (mapList.containsKey(word)){
            count = mapList.get(word);
            mapList.remove(word);
            count++;
            mapList.put(word,count);

        }else{
            //List<String> list = new ArrayList<>();
            //list.add(word);
            mapList.put(word, count);

        }
    }
    System.out.println(mapList);
    List<String> keys = new ArrayList<>(mapList.keySet());
    for(int i = 0; i < keys.size(); i++){
        String key = keys.get(i);
        Integer value = mapList.get(key);
        if(map.containsKey(value)){
            List<String> list = map.get(value);
            list.add(key);
        }else{
            List<String> list = new ArrayList<>();
            list.add(key);
            map.put(value, list);

        }
    }
    System.out.println(map);
}
}
