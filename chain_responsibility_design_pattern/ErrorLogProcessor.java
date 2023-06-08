package com.software_design.chain_responsibility_design_pattern;

public class ErrorLogProcessor extends LogProcessor {

    private LogProcessor logProcessor;
    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int loglevel, String message) {
        if(loglevel == LogProcessor.ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(loglevel, message);
        }
    }
}
