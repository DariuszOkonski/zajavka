package zajavka.week_08.day40ext;

import java.util.ArrayList;
import java.util.List;

public final class Cat {
    private final List<String> friendsNames;

    public Cat(List<String> friendsNames) {
        this.friendsNames = new ArrayList<>(friendsNames);
    }

    public List<String> getFriendsNames() {
        return new ArrayList<>(this.friendsNames);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "friendsNames=" + friendsNames +
                '}';
    }
}
