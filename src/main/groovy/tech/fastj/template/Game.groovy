package tech.fastj.template

import tech.fastj.engine.FastJEngine
import tech.fastj.graphics.display.Display
import tech.fastj.graphics.display.RenderSettings
import tech.fastj.graphics.game.Text2D
import tech.fastj.systems.control.SimpleManager

class Game extends SimpleManager {

    @Override
    void init(Display display) {
        /* Some crispy anti-aliasing for the road. */
        display.modifyRenderSettings(RenderSettings.Antialiasing.Enable)

        /* A very simple Text2D object, welcoming you to FastJ! */
        Text2D helloFastJText = Text2D.fromText('Hello, FastJ 1.5.0!')
        helloFastJText.translate(display.getScreenCenter())
        drawableManager.addGameObject(helloFastJText)
    }

    @Override
    void update(Display display) {
    }

    static void main(String[] args) {
        FastJEngine.init('FastJ Groovy Template', new Game())
        FastJEngine.run()
    }
}
