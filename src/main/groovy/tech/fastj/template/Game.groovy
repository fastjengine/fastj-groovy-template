package tech.fastj.template

import tech.fastj.engine.FastJEngine
import tech.fastj.graphics.display.FastJCanvas
import tech.fastj.graphics.display.RenderSettings
import tech.fastj.graphics.game.Text2D
import tech.fastj.systems.control.SimpleManager

class Game extends SimpleManager {

    @Override
    void init(FastJCanvas canvas) {
        /* Some crispy anti-aliasing for the road. */
        canvas.modifyRenderSettings(RenderSettings.Antialiasing.Enable)

        /* A very simple Text2D object, welcoming you to FastJ! */
        Text2D helloFastJText = Text2D.fromText('Hello, FastJ 1.6.0!')
        helloFastJText.translate(canvas.getCanvasCenter())
        drawableManager.addGameObject(helloFastJText)
    }

    @Override
    void update(FastJCanvas canvas) {
    }

    static void main(String[] args) {
        FastJEngine.init('FastJ Groovy Template', new Game())
        FastJEngine.run()
    }
}
