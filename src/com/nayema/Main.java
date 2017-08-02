package com.nayema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle2D triangle2D = new Triangle2D();
        Triangle3D triangle3D = new Triangle3D();
        MenuHelper menuHelper = new MenuHelper("Trigonometry Calculator");

        menuHelper.displayWelcomeMessage();

        Scanner scanner = new Scanner(System.in);

            System.out.println(" ");
            System.out.println("Type: '2D' for 2D Triangle");
            System.out.println("Type: '3D' for 3D Triangle");
            String command = scanner.next();

            switch (command) {
                case "2D":
                    menuHelper.registerCommand("Calculate distance of each side of the triangle", triangle2D::calculateDistances);
                    menuHelper.registerCommand("Calculate angles of each point of the triangle", triangle2D::calculateAngles);
                    menuHelper.registerCommand("Calculate area of triangle", triangle2D::calculateArea);
                    menuHelper.registerCommand("Determine triangle type based on sides", triangle2D::determineTriangleType);
                    menuHelper.registerCommand("Determine triangle type based on angles", triangle2D::determineAngleType);
                    menuHelper.registerCommand("All of the above", triangle2D::calculateAll);
                    menuHelper.runInLoop();
                    break;
                case "3D":
                    menuHelper.registerCommand("Calculate distance of each side of the triangle", triangle3D::calculateDistances);
                    menuHelper.registerCommand("Calculate angles of each point of the triangle", triangle3D::calculateAngles);
                    menuHelper.registerCommand("Calculate area of triangle", triangle3D::calculateArea);
                    menuHelper.registerCommand("All of the above", triangle3D::calculateAll);
                    menuHelper.runInLoop();
                    break;
                default:
                    System.out.println("Goodbye.");
                    break;
            }
        }
    }

