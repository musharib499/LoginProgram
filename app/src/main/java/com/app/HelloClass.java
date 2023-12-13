package com.app;

import android.text.TextUtils;

public class HelloClass {
    public static void main(String[] args) {
        UserD ud = UserD.getInstance();
        UserD ud1 = UserD.getInstance1();

        System.out.println(ud1);
        System.out.println(ud);

//        if (!TextUtils.isEmpty(ud.getUserName())) {
//            System.out.println();
//        }
    }


}

class UserD {


    String userName;
    Integer age;

    private  UserD(){};

    public String getUserName() {
        return userName;
    }

    public Integer getAge() {
        return age;
    }




    private  UserD(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    private static   UserD instance = null;
    private static   UserD instance1 = null;


    public static UserD getInstance() {

         if (instance == null) {
             instance = new UserD();
         }

        return instance;
    }

    public static UserD getInstance1() {

        if (instance1 == null) {
            instance1 = new UserD(null,100);
        }

        return instance1;
    }
}



