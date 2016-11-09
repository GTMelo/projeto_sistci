package com.github.gtmelo.sistci_api.json;

import java.util.Iterator;

/**
 * Created by 02364114110 on 09/11/2016.
 */
public class JsonFactory {

    public static String output(JsonList jsonList) {

        String result = "{";

        Iterator<JsonElement> jsonElementIterator = jsonList.getJsonElements().iterator();

        while (jsonElementIterator.hasNext()) {

            JsonElement j = jsonElementIterator.next();
            result += j.toJson();
            if (jsonElementIterator.hasNext()) result += ",";
        }

        result += "}";

        return result;

    }

    public static String output(String key, String message) {

        String result = "{";

        JsonElement r = new JsonElement(key, message);
        JsonList l = JsonList.build();
        l.addJsonElement(r);

        result += JsonFactory.output(l);

        result += "}";

        return result;

    }

    public static String output(JsonElement... elements) {

        JsonList list = JsonList.build();

        for (JsonElement arg : elements) {
            list.addJsonElement(arg);
        }

        String result = JsonFactory.output(list);

        return result;

    }

}
