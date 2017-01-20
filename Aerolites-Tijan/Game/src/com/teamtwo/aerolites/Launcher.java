package com.teamtwo.aerolites;

import com.teamtwo.aerolites.States.MenuState;
import com.teamtwo.engine.Engine;
import com.teamtwo.engine.Launcher.LauncherConfig;

import java.io.IOException;

public class Launcher {

    public static void main(String[] args) throws IOException {
        LauncherConfig config = new LauncherConfig();

        config.width = 600;
        config.height = 600;
        config.title = "ExampleGame";

        new Engine(new ExampleGame(), config);
     //   new Engine(new MenuState()),
    }
}
