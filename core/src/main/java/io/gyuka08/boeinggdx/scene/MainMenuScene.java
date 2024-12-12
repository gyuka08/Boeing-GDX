package io.gyuka08.boeinggdx.scene;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import io.gyuka08.boeinggdx.Window;

public class MainMenuScene extends Scene{

    private Texture newYorkTexture;
    private Texture playButtonTexture;

    public MainMenuScene(SceneManager sceneManager) {
        super(sceneManager);

        newYorkTexture = new Texture ("texture/spr_newyork.png");
        playButtonTexture = new Texture("texture/spr_planeicon.png");
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()) {
            sceneManager.set(new GameScene(sceneManager));
            dispose();
        }
    }

    @Override
    public void update(float delta) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.begin();
        ScreenUtils.clear(Color.SKY);
        batch.draw(newYorkTexture, Window.WINDOW_WIDTH * -.25F, Window.WINDOW_HEIGHT * .1F, Window.WINDOW_WIDTH * 1.5F, Window.WINDOW_HEIGHT * .5F);
        batch.draw(playButtonTexture, Window.WINDOW_WIDTH * .5F - 32, Window.WINDOW_HEIGHT * .5F - 32, 64, 64);

        batch.end();
    }

    @Override
    public void dispose() {
        newYorkTexture.dispose();
        playButtonTexture.dispose();
    }
}
