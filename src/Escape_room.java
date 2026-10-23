import java.util.Scanner;
public class Escape_room {
    public static void main(String[] args) {
        
        Scanner chino = new Scanner(System.in);
        int opciones = 0;
        do {
            System.out.println("\n=================================================================");
            System.out.println("  _____ ____   ____   _    ____  _____   ____   ___   ___  __  __ ");
            System.out.println(" | ____/ ___| / ___| / \\  |  _ \\| ____| |  _ \\ / _ \\ / _ \\|  \\/  |");
            System.out.println(" |  | \\___ \\| |    / _ \\ | |) |  |   | |) | | | | | | | |\\/| |");
            System.out.println(" | |___ ___) | |___/ ___ \\|  __/| |___  |  _ <| || | || | |  | |");
            System.out.println(" |_____|____/ \\____//   \\\\|   |_____| || \\\\\\___/ \\___/||  |_|");
            System.out.println("=================================================================");
            System.out.println("                    AYUDA A ESCAPAR A JULIAN                   ");
            System.out.println("=================================================================");
            System.out.println("  [1] Comenzar Escape Room");
            System.out.println("  [2] Ver Instrucciones");
            System.out.println("  [3] Salir");
            System.out.println("=================================================================");
            System.out.println(" Selecciona una opción (1-3): ");
            opciones = chino.nextInt();
            if (opciones == 1) {System.out.println("Julián Álvarez se encuentra encerrado en el vestuario, Simeone lo ha encerrado y la puerta requiere un codigo.\r\n" +
            "Arriba del panel hay una nota que dice: ¿Cual es el jugador favorito del entrenador? Para obtener la clave (XXXX), ordena a los siguientes futbolistas (de más a menos)\r\n" +
            "1. Guiliano Simeone (hijo del entrenador pero no es titular indiscutible) \r\n" +
            "2. Koke Resurreción (capitan del equipo y persona respetada) \r\n" +
            "3. Antoine Griezmann (maximo goleador y leyenda del equipo) \r\n" +
            "4. Thibaut Courtois (traidor del equipo) \r\n");
            int opciones2 = 0;
            int intentos = 0;
            
            for (intentos = 1; intentos <= 3; intentos++) {
            System.out.println("Introduce la combinación con el orden de más a menos querido:");
            opciones2= chino.nextInt();
            if(opciones2 == 3214){
            System.out.println("CLICK!, se abre la puerta. Avanzas al túnel de vestuarios.\r\n");
            
            
            System.out.println("Llegas al túnel y encuentras tres puertas:");
            System.out.println("1. Ir hacia el Gimnasio");
            System.out.println("2. Ir hacia la Sala de Prensa");
            System.out.println("3. Ir hacia el Campo de Juego");
            System.out.println("¿Qué camino eliges? (1-3):");
            
            int opciones3 = chino.nextInt();
            if (opciones3 == 2) {
                System.out.println("Os habeis escapado por la entrada de prensa. \r\n" + "Con tantos periodistas nadie se ha dado cuenta.");
                System.out.println("¡Julián ha logrado escapar del Metropolitano! \r\n" + "Ahora Julián podria ir a jugar al Barça.");
            } else {
                System.out.println("El Profe Ortega te estaba buscando ahi para hacer una revisión medica. \r\n" + "¡Te han encontrado!");
                System.out.println("--- GAME OVER ---");
            }
            intentos = 5;
            opciones = 3;
            }
            else{System.out.println("La respuesta es incorrecta. \r\n" + "Te quedan " + (3 - intentos) + " intentos. \r\n");}
            
          
            
            if (intentos == 3) {
            System.out.println("¡El Cholo te ha descubierto mientras probabas códigos!");
            System.out.println("Te ha atrapado y te ha encerrado junto a Julián.");
            System.out.println("--- GAME OVER ---");
            }
            }
            }
            else if (opciones == 2) {System.out.println("Julián Álvarez está atrapado en el Riyadh Air Metropolitano y necesita tu ayuda para escapar antes de que Diego Simeone lo atrape. El Cholo lo está vigilando y dejara que se vaya.\r\n"
                    + "\r\n"
                    + "Para conseguirlo, tendrás que superar diferentes pruebas, resolver enigmas y encontrar pistas escondidas por el estadio. Cada reto superado te acercará un poco más a la libertad.\r\n"
                    + "\r\n"
                    + "INSTRUCCIONES:\r\n"
                    + "\r\n"
                    + "Lee atentamente cada situación que aparezca en la pantalla.\r\n"
                    + "\r\n"
                    + "Resuelve los enigmas e introduce las respuestas correctas para avanzar.\r\n"
                    + "\r\n"
                    + "Busca pistas que te ayuden a encontrar la salida secreta.\r\n"
                    + "\r\n"
                    + "¡Ten cuidado! Si te equivocas, Simeone podría atraparlo.\r\n"
                    + "\r\n"
                    + "Supera todas las pruebas para que Julian pueda jugar en otro equipo.");
            }
            else if (opciones == 3) {System.out.println("Juego cerrado.");
            }
            else {System.out.println("Opción no valida.");
            }
             }
        while (opciones != 3);
        chino.close();
    }
}