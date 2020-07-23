package com.timurradko.command_example2;

public enum CDType {
    ROCK("Led Zeppelin - \"Stairway To Heaven\""),
    CLASSIC("Frederic Chopin \"Etude in A minor"),
    JAZZ("Weather Report - \"Milky Way\""),
    POP("Michael Jackson - \"Billy Jean\""),
    ETHNIC("Thomas Hengelbrock - \"Recercada\"");
    private String name;

    CDType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
