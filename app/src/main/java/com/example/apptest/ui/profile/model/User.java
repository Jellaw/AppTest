package com.example.apptest.ui.profile.model;

public class User {
    int img;
    String name;
    String age;
    String academic_level;
    String language;

    public User(int img, String name, String age, String academic_level, String language) {
        this.img = img;
        this.name = name;
        this.age = age;
        this.academic_level = academic_level;
        this.language = language;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAcademic_level() {
        return academic_level;
    }

    public void setAcademic_level(String academic_level) {
        this.academic_level = academic_level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
