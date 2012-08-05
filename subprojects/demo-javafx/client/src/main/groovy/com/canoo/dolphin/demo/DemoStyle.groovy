package com.canoo.dolphin.demo

import com.canoo.dolphin.logo.DolphinLogo
import groovyx.javafx.SceneGraphBuilder
import javafx.scene.Scene
import javafx.scene.layout.GridPane
import javafx.stage.Stage

import static javafx.geometry.HPos.LEFT
import static javafx.geometry.HPos.RIGHT
import static javafx.scene.layout.Priority.ALWAYS

class DemoStyle {

    static blueStyle(SceneGraphBuilder sgb){
        sgb.with {
            primaryStage.scene.fill = radialGradient(stops: [groovyblue.brighter(), groovyblue.darker()]).build()
            primaryStage.scene.stylesheets << 'demo.css'
        }
    }

    static style(SceneGraphBuilder sgb) {
        blueStyle(sgb)
        Stage frame = sgb.primaryStage
        Scene scene = frame.scene

        GridPane grid = scene.root
        grid.styleClass << 'form'
        grid.hgap = 5  // for some reason, the gaps are not taken from the css
        grid.vgap = 10
        grid.columnConstraints << sgb.columnConstraints(halignment: RIGHT, hgrow: ALWAYS)
        grid.columnConstraints << sgb.columnConstraints(halignment: LEFT,  hgrow: ALWAYS)

        sgb.translateTransition(1.s, node: grid, fromY: -100, toY: 0).play()
    }
}
