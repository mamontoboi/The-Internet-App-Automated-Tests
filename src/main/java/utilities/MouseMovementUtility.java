package utilities;

import java.awt.*;

public class MouseMovementUtility extends Utility{

    public static void MoveCursorToTheUpperLeftCorner(int size_x, int size_y) {
        try {
            Robot robot = new Robot();
            robot.mouseMove(size_x/2, size_y/2);
            robot.mouseMove(0, 0);
        } catch (AWTException e) {
            System.out.println("The mouse movement failed." + e.getMessage());
        }

    }
}
