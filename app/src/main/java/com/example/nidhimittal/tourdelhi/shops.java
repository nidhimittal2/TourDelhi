package com.example.nidhimittal.tourdelhi;

import android.content.Context;

import java.util.List;

/**
 * Created by Nidhi Mittal on 11-03-2018.
 */

public class shops {

    public static void initShopsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.shop_CITYWALK_name),
                context.getString(R.string.shop_CITYWALK_description),
                context.getString(R.string.shop_CITYWALK_address),
                context.getString(R.string.shop_CITYWALK_phone),
                context.getString(R.string.shop_CITYWALK_schedule),
                null,
                R.drawable.food
        ));

        list.add(new Location(
                context.getString(R.string.shop_pacific_name),
                context.getString(R.string.shop_pacific_description),
                context.getString(R.string.shop_pacific_address),
                context.getString(R.string.shop_pacific_phone),
                context.getString(R.string.shop_pacific_schedule),
                null,
                R.drawable.pacific
        ));

        list.add(new Location(
                context.getString(R.string.shop_dlf_name),
                context.getString(R.string.shop_dlf_description),
                context.getString(R.string.shop_dlf_address),
                context.getString(R.string.shop_dlf_phone),
                context.getString(R.string.shop_dlf_schedule),
                null,
                R.drawable.s
        ));


    }
}
