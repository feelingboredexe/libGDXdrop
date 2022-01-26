package com.idiotswithsticks.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.idiotswithsticks.game.libGDXtest;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "andrea mom";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new libGDXtest(), config);
	}
}
