package com.composite_design_pattern.solution1;

public class Main {

    public static void main(String[] args) {

        Directory movieDir = new Directory("Movie");

        FileSystem border = new File("Border");
        movieDir.add(border);

        Directory comedyMovie = new Directory("Comedy");
        FileSystem hulchul = new File("Hulchul");
        comedyMovie.add(hulchul);
        movieDir.add(comedyMovie);

        movieDir.ls();

    }

}
