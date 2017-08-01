package com.nayema;

public class Main {

    public static void main(String[] args) {
        TriangleCalculateAll triangle = new TriangleCalculateAll();
        MenuHelper menuHelper = new MenuHelper("2D Trigonometry Calculator");

        menuHelper.registerCommand("Calculate distance of each side of the triangle", triangle::calculateDistances);
        menuHelper.registerCommand("Calculate angles of each point of the triangle", triangle::calculateAngles);
        menuHelper.registerCommand("Calculate area of triangle", triangle::calculateArea);
        menuHelper.registerCommand("Determine triangle type based on sides", triangle::determineTriangleType);
        menuHelper.registerCommand("Determine triangle type based on angles", triangle::determineAngleType);
        menuHelper.registerCommand("All of the above", triangle::calculateAll);

        menuHelper.displayWelcomeMessage();

        menuHelper.runInLoop();
    }
}
