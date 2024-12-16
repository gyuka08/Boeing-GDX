package io.gyuka08.boeinggdx.sprite;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

public class Plane {
        public static final int GRAVITY = -10;
        private Vector3 position;
        private Vector3 velocity;

        private Texture planeTexture;

        public Plane(int x, int y) {
            position = new Vector3(x, y, 0);
            velocity = new Vector3(0, 0, 0);
            planeTexture = new Texture("texture/spr_boeing767.png");
        }

        public void update(float delta) {
            velocity.add(0, GRAVITY, 0);
            velocity.add(delta);
            position.add(0, velocity.y, 0);

            velocity.scl(1/delta);
        }

    public Texture getPlaneTexture() {
        return planeTexture;
    }

    public Vector3 getPosition() {
        return position;
    }
}
