package io.gyuka08.boeinggdx.scene;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import io.gyuka08.boeinggdx.Window;

public class GameScene extends Scene{

    Texture planeTexture;

    protected GameScene(SceneManager sceneManager) {
        super(sceneManager);
        planeTexture = new Texture("texture/spr_boeing767.png");
        camera.setToOrtho(false, Window.WINDOW_WIDTH / 2, Window.WINDOW_HEIGHT / 2);
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void render(SpriteBatch batch) {
        batch.begin();
        batch.setProjectionMatrix(camera.combined);
        batch.draw(planeTexture, 0, 0, 105, 35);
        batch.end();
    }

    @Override
    public void dispose() {

    }
}
