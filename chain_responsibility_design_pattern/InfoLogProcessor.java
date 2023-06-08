package com.software_design.chain_responsibility_design_pattern;

public class InfoLogProcessor extends LogProcessor {

    private LogProcessor logProcessor;
    public InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int loglevel, String message) {
        if(loglevel == LogProcessor.INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.log(loglevel, message);
        }
    }
}
