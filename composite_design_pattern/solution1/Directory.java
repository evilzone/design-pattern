package com.composite_design_pattern.solution1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private String directoryName;
    private List<FileSystem> fileSystem;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        fileSystem = new ArrayList<>();
    }

    public void add(FileSystem filesystemObj) {
        fileSystem.add(filesystemObj);
    }
    @Override
    public void ls() {
        System.out.println("directory name is : " + directoryName);

        for(FileSystem fs : fileSystem) {
            fs.ls();
        }
    }
}
