package com.software_design.chain_responsibility_design_pattern;

public class Main {

    public static void main(String[] args) {
        InfoLogProcessor infoLogProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        infoLogProcessor.log(LogProcessor.DEBUG, "debug log");
        infoLogProcessor.log(LogProcessor.INFO, "info log");
        infoLogProcessor.log(LogProcessor.ERROR, "error log");
    }
}
