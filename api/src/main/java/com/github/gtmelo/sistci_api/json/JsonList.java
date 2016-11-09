package com.github.gtmelo.sistci_api.json;

import java.util.ArrayList;

/**
 * Created by 02364114110 on 09/11/2016.
 */
public class JsonList {

    private ArrayList<JsonElement> jsonElements;

    private JsonList() {
        jsonElements = new ArrayList<JsonElement>();
    }

    public static JsonList build() {
        JsonList jsonList = new JsonList();
        return jsonList;
    }


    public ArrayList<JsonElement> getJsonElements() {
        return jsonElements;
    }

    public void setJsonElements(ArrayList<JsonElement> jsonElements) {
        this.jsonElements = jsonElements;
    }

    public void addJsonElement(JsonElement jsonElement) {
        this.jsonElements.add(jsonElement);
    }

    public void removeJsonElement(JsonElement jsonElement) {
        this.jsonElements.remove(jsonElement);
    }

    public JsonElement getJsonElement(int index) {
        return this.jsonElements.get(index);
    }
}
