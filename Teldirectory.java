import java.util.HashMap;
import java.util.Map;

public class Teldirectory {
    private Map<String,String> map = new HashMap<>();

    void add(String number,String name){
        map.put(number,name);
    }
    String getDir(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: map.entrySet()){
            String number = entry.getKey();
            String name = entry.getValue();
            stringBuilder.append(name);
            stringBuilder.append(" ");
            stringBuilder.append(number);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


    String searchByName(String userName){
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (Map.Entry<String, String> entry: map.entrySet()){
            String number = entry.getKey();
            String name = entry.getValue();
            if (name.equals(userName)){
                stringBuilder.append(name);
                stringBuilder.append(": ");
                stringBuilder.append("Номер ");
                stringBuilder.append(count++);
                stringBuilder.append(": ");
                stringBuilder.append(number);
                stringBuilder.append(", ");
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

}
