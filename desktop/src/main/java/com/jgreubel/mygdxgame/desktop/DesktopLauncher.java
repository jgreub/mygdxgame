package com.jgreubel.mygdxgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jgreubel.mygdxgame.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "My GDX Game";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new MyGdxGame(), config);
	}
}
