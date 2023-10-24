package org.example;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class NewWorkbook {
    private static final String PATH = System.getProperty("user.dir") + File.separator + "workbook";
    private static final String FILENAME = "workbook.xlsx";

    public static void main(String[] args) throws Exception{

        Workbook wb = new HSSFWorkbook();
        try (OutputStream fileOut = new FileOutputStream(PATH + File.separator + FILENAME)) {
            wb.write(fileOut);
        }
    }
}
