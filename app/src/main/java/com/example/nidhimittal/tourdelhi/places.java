package com.example.nidhimittal.tourdelhi;

import android.content.Context;

import java.util.List;

/**
 * Created by Nidhi Mittal on 11-03-2018.
 */

public class places {

    public static void initSightsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.place_red_fort_name),
                context.getString(R.string.place_red_fort_description),
                context.getString(R.string.place_red_fort_address),
                context.getString(R.string.place_red_fort_phone),
                context.getString(R.string.place_red_fort_schedule),
                context.getString(R.string.place_red_fort_fee),
                R.drawable.fort
        ));

        list.add(new Location(
                context.getString(R.string.place_indiagate_name),
                context.getString(R.string.place_indiagate_description),
                context.getString(R.string.place_indiagate_address),
                context.getString(R.string.place_indiagate_phone),
                context.getString(R.string.place_indiagate_schedule),
                context.getString(R.string.place_indiagate_free),
                R.drawable.indiagate
        ));

        list.add(new Location(
                context.getString(R.string.place_QutubMinar_name),
                context.getString(R.string.place_QutubMinar_description),
                context.getString(R.string.place_QutubMinar_address),
                context.getString(R.string.place_QutubMinar_phone),
                context.getString(R.string.place_QutubMinar_schedule),
                context.getString(R.string.place_QutubMinar_fee),
                R.drawable.qutub
        ));

        list.add(new Location(
                context.getString(R.string.place_lotus_name),
                context.getString(R.string.place_lotus_description),
                context.getString(R.string.place_lotus_address),
                context.getString(R.string.place_lotus_phone),
                context.getString(R.string.place_lotus_schedule),
                context.getString(R.string.place_indiagate_free),
                R.drawable.lotus
        ));


    }
}
