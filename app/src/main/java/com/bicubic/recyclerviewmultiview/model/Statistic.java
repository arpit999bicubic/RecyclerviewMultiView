package com.bicubic.recyclerviewmultiview.model;

public class Statistic {

    public static final int CITY_TYPE = 0;
    public static final int EVENT_TYPE = 1;

    private String player_one;
    private String player_two;
    private String title;
    private String no;

    public String getPlayer_one() {
        return player_one;
    }

    public void setPlayer_one(String player_one) {
        this.player_one = player_one;
    }

    public String getPlayer_two() {
        return player_two;
    }

    public void setPlayer_two(String player_two) {
        this.player_two = player_two;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getmType() {
        return mType;
    }

    public void setmType(int mType) {
        this.mType = mType;
    }

    private int mType;

    public Statistic(String player_one, String player_two, String title, String no, int mType) {
        this.player_one = player_one;
        this.player_two = player_two;
        this.title = title;
        this.no = no;
        this.mType = mType;
    }

   /* public Statistic(String name, String description, int type) {
        this.player_one = name;
        this.title = description;
        this.mType = type;
    }
*/
    public String getName() {
        return player_one;
    }

    public void setName(String name) {
        this.player_one = name;
    }

    public String getDescription() {
        return title;
    }

    public void setDescription(String description) {
        this.title = description;
    }

    public int getType() {
        return mType;
    }

    public void setType(int type) {
        this.mType = type;
    }
}
