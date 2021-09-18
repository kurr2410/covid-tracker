package com.example.repository;

import com.example.User;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<User> users;
    private static Repository instance=null;
    private Repository(){
        this.users=new ArrayList<>();
    }
    public static Repository getInstance(){

        if(instance!=null){
            return instance;
        }
        return new Repository();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    public void addUser(User user){
        this.users.add(user);
    }
}
