package com.composite_design_pattern.solution1;

public class File implements FileSystem {
    private String filename;
    public File(String filename) {
        this.filename = filename;
    }
    public void ls() {
        System.out.println("file name is : " + filename);
    }
}
