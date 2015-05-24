package com.kithio.thallus.handler;

import com.kithio.thallus.Thallus;
import com.kithio.thallus.reference.Reference;
import com.kithio.thallus.util.TLog;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class UpdateHandler {

    private static String curVersion = Reference.VERSION;
    private static String newVersion;

    public static String status = "NULL";

    public static boolean show = false;

    public static void init() {

        getNewestVersion();

        if (newVersion != null) {
            if (newVersion.equalsIgnoreCase(curVersion)) {
                status = "[Thallus] is up to date!";
                TLog.info("Thallus is up to date!");
            } else {
                show = true;
                status = String.format("[Thallus] out of date! Your Version: %s Latest Version: %s", curVersion, newVersion);
                TLog.info(String.format("Thallus out of date! Your Version: %s Latest Version: %s", curVersion, newVersion));
            }
        } else {
            show = true;
            status = "[Thallus] Failed to connect to check if update is available!";
            TLog.info("Failed to connect to check if update is available!");
        }
    }

    private static void getNewestVersion() {
        try {
            URL url = new URL("http://kithio.com/minecraft/version.txt");
            Scanner s = new Scanner(url.openStream());
            newVersion = s.next();
            s.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
            TLog.info("Could not connect to determine if mod was up to date!");
        }
    }
}
