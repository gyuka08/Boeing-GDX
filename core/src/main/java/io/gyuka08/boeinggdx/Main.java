package io.gyuka08.boeinggdx;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;

import java.awt.event.TextEvent;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    SpriteBatch batch;
    FitViewport viewport;

    Texture planeTexture;
    Texture bottomBuildingTexture;
    Texture topBuildingTexture;
    Texture newYorkTexture;
    Texture floorTexture;
    Texture roofTexture;

    Sound deadSound;
    Sound explosionSound;

    Music backgroundMusic;

    Sprite planeSprite;

    Array<Sprite> buildingSprites;

    @Override
    public void create() {
        batch = new SpriteBatch();
        viewport = new FitViewport(9, 16);

        planeTexture = new Texture("texture/spr_boeing767.png");
        bottomBuildingTexture = new Texture("texture/spr_bottombuilding.png");
        topBuildingTexture =  new Texture("texture/spr_topbuilding.png");
        newYorkTexture = new Texture ("texture/spr_newyork.png");
        floorTexture = new Texture("texture/spr_floor.png");
        roofTexture = new Texture("texture/spr_roof.png");

        deadSound = Gdx.audio.newSound(Gdx.files.internal("sound/snd_dead.wav"));
        explosionSound = Gdx.audio.newSound(Gdx.files.internal("sound/snd_explosion.wav"));

        backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("musik/mus_background.wav"));

        planeSprite = new Sprite(planeTexture);
        planeSprite.setSize(3, 1);
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void render() {
        draw();
    }

    private void input() {
        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)) {

        }
    }

    private void logic() {
        int velocityX = -5;
        int velocityY = 0;
        int gravity = 1;

        float worldWidth = viewport.getWorldWidth();
        float worldHeight = viewport.getWorldHeight();


    }

    private void draw() {
        ScreenUtils.clear(Color.SKY);
        batch.begin();
        batch.setProjectionMatrix(viewport.getCamera().combined);

        batch.draw(newYorkTexture, -4, 1, 18, 6);
        batch.draw(floorTexture, 0, 0, 9, 1);
        batch.draw(roofTexture, 0, ( viewport.getWorldHeight() - viewport.getWorldHeight() / 8 ), viewport.getWorldWidth(), viewport.getWorldHeight() / 8);
        planeSprite.draw(batch);
        planeSprite.setPosition(1, 8);

        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
