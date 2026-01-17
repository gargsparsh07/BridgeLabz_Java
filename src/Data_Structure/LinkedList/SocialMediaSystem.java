package Data_Structure.LinkedList;

import java.util.*;

class UserNode {
    int userId;
    String name;
    List<Integer> friends = new ArrayList<>();
    UserNode next;

    UserNode(int id, String name) {
        this.userId = id;
        this.name = name;
    }
}

class SocialMediaList {
    private UserNode head;

    void addUser(int id, String name) {
        UserNode node = new UserNode(id, name);
        node.next = head;
        head = node;
    }

    UserNode findUser(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriend(int u1, int u2) {
        UserNode user1 = findUser(u1);
        UserNode user2 = findUser(u2);
        if (user1 != null && user2 != null) {
            user1.friends.add(u2);
            user2.friends.add(u1);
        }
    }

    void displayFriends(int id) {
        UserNode user = findUser(id);
        if (user != null)
            System.out.println("Friends of " + user.name + ": " + user.friends);
    }
}

public class SocialMediaSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SocialMediaList list = new SocialMediaList();

        list.addUser(1, "A");
        list.addUser(2, "B");
        list.addUser(3, "C");

        list.addFriend(1, 2);
        list.addFriend(1, 3);

        list.displayFriends(1);
    }
}
