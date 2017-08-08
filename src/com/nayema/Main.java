package com.nayema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle2DMenu triangle2DMenu = new Triangle2DMenu();
        Triangle3DMenu triangle3DMenu = new Triangle3DMenu();
        MenuHelper menuHelper = new MenuHelper("Trigonometry Calculator");

        menuHelper.displayWelcomeMessage();

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Type: '2D' for 2D TriangleCalculator");
        System.out.println("Type: '3D' for 3D TriangleCalculator");
        String command = scanner.next();

        switch (command) {
            case "2D":
                menuHelper.registerCommand("Calculate distance of each side of the triangle", triangle2DMenu::calculateDistances);
                menuHelper.registerCommand("Calculate angles of each point of the triangle", triangle2DMenu::calculateAngles);
                menuHelper.registerCommand("Calculate area of triangle", triangle2DMenu::calculateArea);
                menuHelper.registerCommand("Determine triangle type based on sides", triangle2DMenu::determineDistanceType);
                menuHelper.registerCommand("Determine triangle type based on angles", triangle2DMenu::determineAngleType);
                menuHelper.registerCommand("All of the above", triangle2DMenu::calculateAll);
                menuHelper.runInLoop();
                break;
            case "3D":
                menuHelper.registerCommand("Calculate distance of each side of the triangle", triangle3DMenu::calculateDistances);
                menuHelper.registerCommand("Calculate angles of each point of the triangle", triangle3DMenu::calculateAngles);
                menuHelper.registerCommand("Calculate area of triangle", triangle3DMenu::calculateArea);
                menuHelper.registerCommand("All of the above", triangle3DMenu::calculateAll);
                menuHelper.runInLoop();
                break;
            default:
                System.out.println("Goodbye.");
                break;
        }
    }
}

