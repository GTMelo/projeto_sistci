package com.github.gtmelo.sistci_api.main;

import com.github.gtmelo.sistci_api.controller.DataManager;
import com.github.gtmelo.sistci_api.data.Tables;
import com.github.gtmelo.sistci_api.data.tables.AutoridadeRatificadora;
import com.github.gtmelo.sistci_api.data.tables.Cargo;
import com.github.gtmelo.sistci_api.data.tables.Tci;
import com.github.gtmelo.sistci_api.json.JsonElement;
import com.github.gtmelo.sistci_api.json.JsonFactory;
import com.github.gtmelo.sistci_api.json.JsonList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;

/**
 * Created by 02364114110 on 09/11/2016.
 */
public class Main {

    public static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        test_jooq();

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

    public static void test_logging() {

        Logger logger = LogManager.getLogger(Main.class.getName());

        logger.info("Info");
        logger.warn("warn");
        logger.error("error");
        logger.debug("debug");

    }

    public static void test_jooq() {

        Connection c = DataManager.getInstance().getConnection();

        DSLContext create = DSL.using(c, SQLDialect.MYSQL);
        

    }
}
