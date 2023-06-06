package com.composite_design_pattern.problem_statement;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object> objectList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        objectList = new ArrayList<>();
    }
    public void ls() {
        System.out.println("directory name is : " + directoryName);

        for(Object object : objectList) {
            if(object instanceof File) {
                ((File) object).ls();
            } else if(object instanceof Directory) {
                ((Directory) object).ls();
            }
        }
    }
}
