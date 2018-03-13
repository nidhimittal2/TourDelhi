package com.example.nidhimittal.tourdelhi;

import android.content.Context;

import java.util.List;

/**
 * Created by Nidhi Mittal on 11-03-2018.
 */

public class Info {

    public static void initInfoList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.info_1),
                context.getString(R.string.info_1_description),
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                context.getString(R.string.info_2),
                context.getString(R.string.info_2_description),
                null,
                null,
                null,
                null,
                -1
        ));


    }
}
