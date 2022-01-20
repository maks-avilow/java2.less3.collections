package home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone {
    private Map <String, String> phones;

    public Phone() {
        this.phones = new HashMap<>();
    }
    public void add (String Name, String phone){
        phones.put(phone, Name);
    }
    public List <String> get(String name){
        List<String> phones = new ArrayList<>();
        for (Map.Entry<String, String> entry : this.phones.entrySet()) {
            if (entry.getValue().equals(name)){
                phones.add(entry.getKey());
            }
        }
        return phones;
    }

}
