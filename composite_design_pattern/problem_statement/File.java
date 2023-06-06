package com.composite_design_pattern.problem_statement;

public class File {
    private String filename;
    public File(String filename) {
        this.filename = filename;
    }

    public void ls() {
        System.out.println("file name is : " + filename);
    }

}
