import java.util.HashMap;

public class User2 {
    HashMap<String, User> users = new HashMap<>();

    public boolean add(User user) {
        String key = user.getName() + " " + user.getSurename();

        if (users.get(key) != null) return false;
        else {
            users.put(key, user);
            return true;

        }
    }
    public User get(String name, String surename){
        String key = name + " " + surename;
    return users.get(key);
    }
}
