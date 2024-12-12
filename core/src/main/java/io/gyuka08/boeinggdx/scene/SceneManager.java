package io.gyuka08.boeinggdx.scene;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class SceneManager {

    public Stack<Scene> sceneStack;

    public SceneManager() {
        sceneStack = new Stack<Scene>();
    }

    public void push(Scene scene) {
        sceneStack.push(scene);
    }

    public void pop(Scene scene) {
        sceneStack.pop();
    }

    public void set(Scene scene) {
        sceneStack.pop();
        sceneStack.push(scene);
    }

    public void update(float delta) {
        sceneStack.peek().update(delta);
    }

    public void render(SpriteBatch batch) {
        sceneStack.peek().render(batch);
    }

}
