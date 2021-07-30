package com.test.avianca.utils;

import java.util.Map;
import java.util.TreeMap;

public class CaptureBasicinformation {
    private static Map<Integer, Map<Integer, String>> dataDrive = new TreeMap<>();


    private static String cityOrigin;
    private static String cityDestination;
    private static String codCityOrigin;
    private static String codCityDestination;

    public static String getCityOrigin() {
        return cityOrigin;
    }

    public static String getCityDestination() {
        return cityDestination;
    }

    public static String getCodCityOrigin() {
        return codCityOrigin;
    }

    public static String getCodCityDestination() {
        return codCityDestination;
    }

    public static Map<Integer, Map<Integer, String>> getDataDrive() {
        return dataDrive;
    }

    public static Map<Integer, Map<Integer, String>> loadDataDrive(int sheetNumber) {
        DataDriveExcel document = new DataDriveExcel();
        return document.loadDataDrive("data.xlsx", sheetNumber);
    }

    public static void getBasicInformation(int sheetNumber, int rowNumber) {
        dataDrive = loadDataDrive(sheetNumber);
        cityOrigin = dataDrive.get(rowNumber).get(0);
        cityDestination = dataDrive.get(rowNumber).get(1);
        codCityOrigin = dataDrive.get(rowNumber).get(2);
        codCityDestination = dataDrive.get(rowNumber).get(3);
    }


}
