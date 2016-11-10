package com.github.gtmelo.sistci_api.main;

import com.github.gtmelo.sistci_api.controller.TciManager;
import com.github.gtmelo.sistci_api.json.JsonElement;
import com.github.gtmelo.sistci_api.json.JsonFactory;
import com.github.gtmelo.sistci_api.json.JsonList;
import com.github.gtmelo.sistci_api.security.exception.DataNotFoundException;
import com.github.gtmelo.sistci_api.services.v1.Tci;
import com.github.gtmelo.sistci_api.services.v1.TciResource;

/**
 * Created by 02364114110 on 09/11/2016.
 */
public class Main {

    public static void main(String[] args) {

        test_post();

    }

    public static void test_json() {

        // create elements
        JsonElement element = new JsonElement("foo", "bar");
        JsonElement element1 = new JsonElement("foo1", "bar");

        // add, edit, update, remove elements
        JsonList list = JsonList.build();
        list.addJsonElement(element);
        list.addJsonElement(element1);

        // output final product
        System.out.println(JsonFactory.output(list));

    }

    public static void test_advJson() {

        // creates list
        JsonList list = JsonList.build();

        // create elements
        JsonElement element = new JsonElement("foo", "bar");
        JsonElement element1 = new JsonElement("foo1", "bar");
        JsonElement element2 = new JsonElement("foo2", "bar");

        // add, edit, update, remove elements
        list.addJsonElement(element);
        list.addJsonElement(element1);
        list.addJsonElement(element2);

        // changes element1 to have a different value
        list.getJsonElement(1).setValue(JsonFactory.output(list));

        //outputs product
        System.out.println(JsonFactory.output(list));

    }

    public static void test_crazyJson() {
        // creates list
        JsonList list = JsonList.build();

        // create elements
        JsonElement element = new JsonElement("foo", "bar");
        JsonElement element1 = new JsonElement("foo1", "bar");
        JsonElement element2 = new JsonElement("foo2", "bar");
        JsonElement element3 = new JsonElement("foo3", "bar");

        // add, edit, update, remove elements
        list.addJsonElement(element);
        list.addJsonElement(element1);
        list.addJsonElement(element2);

        // changes element1 to have a different value
        list.getJsonElement(1).setValue(JsonFactory.output(list));

        // makes the last one have even more stuff
        list.getJsonElement(2).setValue(JsonFactory.output(list));

        //outputs product
        System.out.println(JsonFactory.output(list));
    }

    public static void test_nowThatsJustSilly() {
        // creates list
        JsonList list = JsonList.build();

        // create elements
        JsonElement element = new JsonElement("foo", "bar");
        JsonElement element1 = new JsonElement("foo1", "bar");
        JsonElement element2 = new JsonElement("foo2", "bar");
        JsonElement element3 = new JsonElement("foo3", "bar");

        // add, edit, update, remove elements
        list.addJsonElement(element);
        list.addJsonElement(element1);
        list.addJsonElement(element2);
        list.addJsonElement(element3);


        // changes element1 to have a different value
        list.getJsonElement(1).setValue(JsonFactory.output(list));

        // makes the last one have even more stuff
        list.getJsonElement(2).setValue(JsonFactory.output(list));

        // what is even going on anymore
        list.getJsonElement(3).setValue(JsonFactory.output(list));
        list.getJsonElement(2).setValue(JsonFactory.output(list));
        list.getJsonElement(2).setValue(JsonFactory.output(list));
        list.getJsonElement(2).setValue(JsonFactory.output(list));

        //outputs product
        System.out.println(JsonFactory.output(list));
    }

    public static void test_varargsJson() {

        System.out.println(JsonFactory.output(new JsonElement("info", "this works fine"), new JsonElement("info2", "this one too")));

    }

    public static void test_tciFetch() {

        Tci tci = null;
        Tci tci_bad = null;

        try {
            tci = TciManager.getInstance().findTci("123456");
            tci_bad = TciManager.getInstance().findTci("12345");
        } catch (DataNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(tci.toString());
        try {
            System.out.println(tci_bad.toString());
        } catch (Exception e) {
            System.out.println("whatever");
        }

//        System.out.println(RequestValidator.getInstance().validarRequest("1234"));

    }

    public static void test_post() {

        String s = "{\"id\":2,\"orgaoId\":3,\"pessoaId\":2,\"categoriaId\":2,\"prazoId\":2,\"fundamentoId\":2,\"grau_sigiloId\":2,\"statusId\":2,\"cidicId\":2,\"nup\":\"nup2\",\"data_producao\":\"01/01/2020\",\"tipo\":\"Carta 1/2025\",\"razaoClassificacao\":\"Razão XYZZZZZ\"}";

        System.out.println(s);

        TciResource tciResource = new TciResource();
        System.out.println(tciResource.createTci(s).toString());

    }
}
