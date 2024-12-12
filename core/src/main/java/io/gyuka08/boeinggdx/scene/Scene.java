package io.gyuka08.boeinggdx.scene;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class Scene {
    protected OrthographicCamera camera;
    protected Vector3 cursor;
    protected SceneManager sceneManager;

    protected Scene(SceneManager sceneManager) {
        this.sceneManager = sceneManager;
        camera = new OrthographicCamera();
        cursor = new Vector3();

    }

    public abstract void handleInput();
    public abstract void update(float delta);
    public abstract void render(SpriteBatch batch);
    public abstract void dispose();

}
