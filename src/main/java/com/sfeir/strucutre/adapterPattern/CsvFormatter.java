package com.sfeir.strucutre.adapterPattern;

public class CsvFormatter implements CsvFormattable {
    @Override
    public String formatCsvText(String text) {
        return text.replace(".",",");
    }
}
