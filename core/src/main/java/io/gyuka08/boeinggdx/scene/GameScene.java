package io.gyuka08.boeinggdx.scene;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import io.gyuka08.boeinggdx.Window;
import io.gyuka08.boeinggdx.sprite.Plane;

public class GameScene extends Scene{
    private final Plane boeing;

    protected GameScene(SceneManager sceneManager) {
        super(sceneManager);
        boeing = new Plane(30, Window.WINDOW_HEIGHT / 4);
        camera.setToOrtho(false, (int)(Window.WINDOW_WIDTH / 2), (int)(Window.WINDOW_HEIGHT / 2) );
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float delta) {
        handleInput();
        boeing.update(delta);
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(boeing.getPlaneTexture(), boeing.getPosition().x, boeing.getPosition().y);
        batch.end();
    }

    @Override
    public void dispose() {

    }
}
