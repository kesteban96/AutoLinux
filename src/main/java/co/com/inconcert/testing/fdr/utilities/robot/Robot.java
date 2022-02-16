package co.com.inconcert.testing.fdr.utilities.robot;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.awt.*;
import java.awt.event.KeyEvent;

import static co.com.inconcert.testing.fdr.utilities.datos.DatosPrueba.obtener;

public class Robot implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        try{
            java.awt.Robot robot = new java.awt.Robot();
            robot.keyPress(KeyEvent.VK_H);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }catch (AWTException e){
            e.printStackTrace();
        }
    }


    public static Robot conRobot(){
        return Tasks.instrumented(Robot.class);
    }
}
