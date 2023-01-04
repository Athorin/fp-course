package utils;

import menu.Menu;
import menu.MenuBuilder;

import java.util.Scanner;

/**
 * Menu añadido posteriormente para unificar y simplificar todos los archivos de ejercicios
 */
public class MenuEjercicios {

    private Menu menu;

    public static void mainMenu() {

        Menu battleshipMenu = MenuBuilder.createSubMenu("Unidad 2. Principios basicos", 2)
                .addSimpleOption(6, "Perimetro")
                .addSimpleOption(7, "Edad")
                .addSimpleOption(8, "Masa")
                .addSimpleOption(9, "Segundos")
                .addExitOption(0, "Volver a menu principal")
                .build();

        Menu conway = MenuBuilder.createSubMenu("Unidad 3. Sentencias de control", 3)
                .addSimpleOption(1, "OpciónS2 1")
                .addSimpleOption(2, "OpciónS2 2")
                .addSimpleOption(3, "OpciónS2 3")
                .addSimpleOption(4, "OpciónS2 4")
                .addExitOption(0, "SalirS2")
                .build();

        Menu crucigramarius = MenuBuilder.createSubMenu("Unidad 4. Documentacion externa", 4)
                .addSimpleOption(1, "OpciónS2 1")
                .addSimpleOption(2, "OpciónS2 2")
                .addSimpleOption(3, "OpciónS2 3")
                .addSimpleOption(4, "OpciónS2 4")
                .addExitOption(0, "SalirS2")
                .build();

        Menu duelcards = MenuBuilder.createSubMenu("Unidad 5. Clases y objetos", 5)
                .addSimpleOption(1, "OpciónS2 1")
                .addSimpleOption(2, "OpciónS2 2")
                .addSimpleOption(3, "OpciónS2 3")
                .addSimpleOption(4, "OpciónS2 4")
                .addExitOption(0, "SalirS2")
                .build();

        Menu megamind = MenuBuilder.createSubMenu("Unidad 6. Arrays y Strings", 6)
                .addSimpleOption(1, "OpciónS2 1")
                .addSimpleOption(2, "OpciónS2 2")
                .addSimpleOption(3, "OpciónS2 3")
                .addSimpleOption(4, "OpciónS2 4")
                .addExitOption(0, "SalirS2")
                .build();

        Menu tetris = MenuBuilder.createSubMenu("Unidad 7. Herencia", 7)
                .addSimpleOption(1, "OpciónS2 1")
                .addSimpleOption(2, "OpciónS2 2")
                .addSimpleOption(3, "OpciónS2 3")
                .addSimpleOption(4, "OpciónS2 4")
                .addExitOption(0, "SalirS2")
                .build();


        Menu mainMenu = MenuBuilder.createMainMenu("Menu principal - Elige unidad")
                .addSubMenuOption("Unidad 2. Principios basicos", battleshipMenu)
                .addSubMenuOption("Unidad 3. Sentencias de control", conway)
                .addSubMenuOption("Unidad 4. Documentacion externa", crucigramarius)
                .addSubMenuOption("Unidad 5. Clases y objetos", duelcards)
                .addSubMenuOption("Unidad 6. Arrays y Strings", megamind)
                .addSubMenuOption("Unidad 7. Herencia", tetris)
                .addSubMenuOption("Unidad 8. Excepciones", conway)
                .addSubMenuOption("Unidad 10. Bases de datos", crucigramarius)
                .addSubMenuOption("Unidad 11. Hilos", duelcards)
                .addSubMenuOption("Unidad 13. Servlets", megamind)
                .addSubMenuOption("Unidad 14. JSP", tetris)
                .addExitOption(0, "Salir")
                .build();

        System.out.println(mainMenu.play());
    }

    public static int chooseOption() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

}
