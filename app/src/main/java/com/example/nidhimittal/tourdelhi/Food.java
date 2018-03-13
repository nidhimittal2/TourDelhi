package com.example.nidhimittal.tourdelhi;

import android.content.Context;

import java.util.List;

/**
 * Created by Nidhi Mittal on 11-03-2018.
 */

public class Food {

    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.food_kilo_name),
                context.getString(R.string.food_kilo_description),
                context.getString(R.string.food_kilo_address),
                context.getString(R.string.food_kilo_phone),
                context.getString(R.string.food_kilo_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.kilo
        ));

        list.add(new Location(
                context.getString(R.string.food_Friction_name),
                context.getString(R.string.food_Friction_description),
                context.getString(R.string.food_Friction_address),
                context.getString(R.string.food_Friction_phone),
                context.getString(R.string.food_Friction_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.food
        ));

        list.add(new Location(
                context.getString(R.string.food_pho_name),
                context.getString(R.string.food_pho_description),
                context.getString(R.string.food_pho_address),
                context.getString(R.string.food_pho_phone),
                context.getString(R.string.food_pho_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.food
        ));

        list.add(new Location(
                context.getString(R.string.food_Decode_name),
                context.getString(R.string.food_Decode_description),
                context.getString(R.string.food_Decode_address),
                context.getString(R.string.food_Decode_phone),
                context.getString(R.string.food_Decode_schedule),
                context.getString(R.string.food_price_four),
                R.drawable.decode
        ));


    }
}
