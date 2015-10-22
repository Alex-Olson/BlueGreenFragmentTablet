package com.example.angel.bluegreenfragmenttablet.colordata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ColorContent {


    public static List<ColorItem> ITEMS = new ArrayList<ColorItem>();

    public static Map<String, ColorItem> ITEM_MAP = new HashMap<String, ColorItem>();

    static {
        // Add some sample items.
        addItem(new ColorItem("1", "Blue"));
        addItem(new ColorItem("2", "Green"));
    }

    private static void addItem(ColorItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class ColorItem {
        public String id;
        public String color;

        public ColorItem(String id, String color) {
            this.id = id;
            this.color = color;
        }

        @Override
        public String toString() {
            return color;
        }
    }
}
