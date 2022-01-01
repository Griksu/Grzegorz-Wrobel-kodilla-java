package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(001, "Santos", 'F',
                1999, 4, 27, 20));
        theForumUsersList.add(new ForumUser(002, "Johny", 'M',
                1987, 1, 21, 1));
        theForumUsersList.add(new ForumUser(003, "white15", 'M',
                2003, 12, 31, 153));
        theForumUsersList.add(new ForumUser(004, "fenske3", 'F',
                2010, 6, 11, 0));
        theForumUsersList.add(new ForumUser(005, "ramberg", 'M',
                1994, 5, 13, 0));
        theForumUsersList.add(new ForumUser(006, "Geiger65", 'M',
                1965,8,29,83));
    }
     public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsersList);
     }
}
