package io.gyuka08.boeinggdx;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import io.gyuka08.boeinggdx.scene.SceneManager;
import io.gyuka08.boeinggdx.scene.MainMenuScene;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Window extends ApplicationAdapter {
    public static final int WINDOW_WIDTH = 360;
    public static final int WINDOW_HEIGHT = 640;

    public static String windowTitle = "لعبة حرام";

    private SceneManager sceneManager;
    private SpriteBatch batch;

    @Override
    public void create() {
        sceneManager = new SceneManager();
        batch = new SpriteBatch();
        sceneManager.push(new MainMenuScene(sceneManager));
    }

    @Override
    public void render() {
        sceneManager.update(Gdx.graphics.getDeltaTime());
        sceneManager.render(batch);
    }
}
