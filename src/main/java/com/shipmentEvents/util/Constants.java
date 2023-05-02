package com.shipmentEvents.util;

import com.sun.org.apache.bcel.internal.generic.PUSH;

import java.util.Arrays;
import java.util.List;

public final class Constants {

    public static final List<String> BUCKETS_TO_PROCESS = Arrays.asList("shipment-events-from-scanner", "shipment-events-from-mobile-app");
    public static final String SUMMARY_BUCKET = "shipment-events-summary";

    public static final String USERNAME = "root";
    public static final String PASSWORD = "P@ssw0rd";
}
