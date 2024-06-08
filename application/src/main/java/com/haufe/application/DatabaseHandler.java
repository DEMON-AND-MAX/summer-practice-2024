package com.haufe.application;

import java.util.ArrayList;

public final class DatabaseHandler {

    private static DatabaseHandler INSTANCE;
    private Catalogue dummyCatalogue = new Catalogue();

    private DatabaseHandler() {}

    public static DatabaseHandler getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DatabaseHandler();
        }
        return INSTANCE;
    }

    public Catalogue retrieveCatalogue() {
        Movie dummy1 = new Movie(1, "Shrek",
                "Shrek is an anti-social and highly territorial ogre who loves the solitude of his swamp, and enjoys fending off mobs and intruders. His life is interrupted after the dwarfish Lord Farquaad of Duloc exiles a vast number of fairy-tale creatures, who inadvertently end up in the swamp.",
                50, "https://i.ebayimg.com/images/g/TaoAAOSwPjZf1WHW/s-l1600.jpg");
        Movie dummy2 = new Movie(2, "Toy Story",
                "Andy's favourite toy, Woody, is worried that after Andy receives his birthday gift, a new toy called Buzz Lightyear, his importance may get reduced. He thus hatches a plan to eliminate Buzz.",
                40, "https://upload.wikimedia.org/wikipedia/en/1/13/Toy_Story.jpg");
        Movie dummy3 = new Movie(3, "Ballerina",
                "Grieving the loss of a best friend she could not protect, former bodyguard Ok-ju sets out to fulfil her dear friend's last wish: sweet, sweet revenge.",
                10, "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSyK8-H_mVcZFeOQ00zM4Duuv1-bqTzIT4oI14BLS8VvfxnVi28");
        Movie dummy4 = new Movie(4, "Foe",
                "Hen and Junior's quiet life is thrown into turmoil when an uninvited stranger shows up at their door with a startling proposal.",
                50, "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQFAObSYZn6CtnMAxihO7EKL_UBIjKIwGxx25fKVYdodCHIbIDW");
        dummyCatalogue.addMovie(dummy1);
        dummyCatalogue.addMovie(dummy2);
        dummyCatalogue.addMovie(dummy3);
        dummyCatalogue.addMovie(dummy4);
        return dummyCatalogue;
    }

    public Catalogue retrieveUserCatalogue(int id) {
        Movie dummy1 = new Movie(1, "Shrek",
                "Shrek is an anti-social and highly territorial ogre who loves the solitude of his swamp, and enjoys fending off mobs and intruders. His life is interrupted after the dwarfish Lord Farquaad of Duloc exiles a vast number of fairy-tale creatures, who inadvertently end up in the swamp.",
                50, "https://i.ebayimg.com/images/g/TaoAAOSwPjZf1WHW/s-l1600.jpg");
        Movie dummy2 = new Movie(2, "Toy Story",
                "Andy's favourite toy, Woody, is worried that after Andy receives his birthday gift, a new toy called Buzz Lightyear, his importance may get reduced. He thus hatches a plan to eliminate Buzz.",
                40, "https://upload.wikimedia.org/wikipedia/en/1/13/Toy_Story.jpg");
        Movie dummy3 = new Movie(3, "Ballerina",
                "Grieving the loss of a best friend she could not protect, former bodyguard Ok-ju sets out to fulfil her dear friend's last wish: sweet, sweet revenge.",
                10, "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSyK8-H_mVcZFeOQ00zM4Duuv1-bqTzIT4oI14BLS8VvfxnVi28");
        Movie dummy4 = new Movie(4, "Foe",
                "Hen and Junior's quiet life is thrown into turmoil when an uninvited stranger shows up at their door with a startling proposal.",
                50, "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQFAObSYZn6CtnMAxihO7EKL_UBIjKIwGxx25fKVYdodCHIbIDW");
        dummyCatalogue.addMovie(dummy1);
        dummyCatalogue.addMovie(dummy2);
        dummyCatalogue.addMovie(dummy3);
        dummyCatalogue.addMovie(dummy4);
        return dummyCatalogue;
    }

    public ArrayList<User> retrieveFriendlist(int id) {
        User dummy1 = new User(1, "Andrei", null, null, null);
        User dummy2 = new User(2, "Ana", null, null, null);
        User dummy3 = new User(3, "Ama", null, null, null);
        User dummy4 = new User(4, "Nandhni", null, null, null);
        User dummy5 = new User(5, "Joudi", null, null, null);
        ArrayList<User> dummyList = new ArrayList<User>();
        dummyList.add(dummy1);
        dummyList.add(dummy2);
        dummyList.add(dummy3);
        dummyList.add(dummy4);
        dummyList.add(dummy5);
        return dummyList;
    }

    public ArrayList<FriendGroup> retrieveGroupList(int i) {
        User dummy = new User(1, "Andrei", null, null, null);
        ArrayList<User> dummies = new ArrayList<User>();
        dummies.add(dummy);
        dummies.add(dummy);
        dummies.add(dummy);
        dummies.add(dummy);
        dummies.add(dummy);
        FriendGroup dummyGroup1 = new FriendGroup("test group!" ,dummies);
        FriendGroup dummyGroup2 = new FriendGroup("test!" ,dummies);
        FriendGroup dummyGroup3 = new FriendGroup("bruh!" ,dummies);
        ArrayList<FriendGroup> dummyGroupList = new ArrayList<>();
        dummyGroupList.add(dummyGroup1);
        dummyGroupList.add(dummyGroup2);
        dummyGroupList.add(dummyGroup3);
        return dummyGroupList;
    }
}
