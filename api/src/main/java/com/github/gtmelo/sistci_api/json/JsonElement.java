package com.github.gtmelo.sistci_api.json;

/**
 * Created by 02364114110 on 09/11/2016.
 */
public class JsonElement {

    private String key;
    private String value;

    public JsonElement(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toJson() {

        String aspas = "\"";

        String result = aspas + this.getKey() + aspas + ":" + aspas + this.getValue() + aspas;

        //lets be silly
        if (result.contains("{")) {
            result = aspas + this.getKey() + aspas + ":" + this.getValue();
        }

        return result;

    }
}
