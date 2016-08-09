package com.bicubic.recyclerviewmultiview;

import com.bicubic.recyclerviewmultiview.model.Statistic;

import java.util.ArrayList;
import java.util.List;

public final class DummyData {

    public static List<Statistic> getData() {
        List<Statistic> list = new ArrayList<>();

        list.add(new Statistic("Player 1", null,"23","1", Statistic.CITY_TYPE));
        list.add(new Statistic("Player 2", "Player 3","23","2", Statistic.EVENT_TYPE));
        list.add(new Statistic("Player 3", "row 5","23","3", Statistic.EVENT_TYPE));
        list.add(new Statistic("Player 1", null,"23","1", Statistic.CITY_TYPE));
        list.add(new Statistic("Player 1", "row 2","23","1", Statistic.EVENT_TYPE));
        list.add(new Statistic("Player 1", null,"23","1", Statistic.CITY_TYPE));
        list.add(new Statistic("Player 1", null,"23","1", Statistic.CITY_TYPE));
        list.add(new Statistic("Player 1", "row 3","23","1", Statistic.EVENT_TYPE));
        list.add(new Statistic("Player 1", "row 4","23","1", Statistic.EVENT_TYPE));
        list.add(new Statistic("Player 1", null,"23","1", Statistic.CITY_TYPE));
        list.add(new Statistic("Player 1", null,"23","1", Statistic.CITY_TYPE));


        return list;
    }

}
