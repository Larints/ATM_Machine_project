package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DataBase implements DataBaseInteface<User> {
    private Map<Long, User> data = new HashMap<Long, User>();

    @Override
    public long addUser(String name) {
        Random random = new Random();
        long currentID = random.nextLong();
        while (data.containsKey(currentID)) {
            currentID = random.nextLong();
        }
        data.put(currentID, new User(currentID, name));
        return currentID;
    }

    @Override
    public void removeUser(long ID) {
        data.remove(ID);
    }

    @Override
    public User findUser(long ID) {
        return data.containsKey(ID) ? data.get(ID) : null;
    }

}
