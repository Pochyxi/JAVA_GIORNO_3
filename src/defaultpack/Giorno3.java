package defaultpack;
import giorno3.epicode.util.MyArray;

import java.util.Scanner;

public class Giorno3 {
     public static void main(String[] args) {
//         MyArray arr = new MyArray( new int[] { 2 , 3 , 4 , 5 } );
//         arr.push( 6 ); // metodo push()
//         arr.consoleLog("eseguito push ");
//         arr.pop(); // metodo pop()
//         arr.consoleLog("eseguito pop ");
//         arr.unShift( 44 ); // metodo unshift()
//         arr.consoleLog("eseguito unShift ");
//         arr.shift();
//         arr.consoleLog( "eseguito shift" );

         Scanner scanner = new Scanner( System.in );
         System.out.println("Quanti numeri vuoi inserire?");

         int arrLen = Integer.parseInt( scanner.nextLine() );
         int[] arrGet = new int[arrLen];

         for ( int i = 0; i < arrGet.length; i++ ) {
             System.out.println("Inserisci un numero alla posizione " + i);
             arrGet[i] = (Integer.parseInt( scanner.nextLine() ));
         }
        MyArray arr = new MyArray( arrGet );
         arr.consoleLog( "ecco a te! " );

         String menu = """
                 che operazione vuoi compiere?\r
                 1 aggiungi in coda (poi chiedere valore)\r
                 2 aggiungi in testa  (poi chiedere valore)\r
                 3 rimuovi in coda\r
                 4 rimuovi in testa\r
                 5 esci""";

         System.out.println(menu);

         int command = Integer.parseInt( scanner.nextLine() );

         while(command != 5) {

             switch (command) {

                 case 1:
                     System.out.println("quale elemento vuoi interire?");
                     arr.push( Integer.parseInt( scanner.nextLine() ) );
                     arr.consoleLog( "eseguito push" );

                     System.out.println("Vuoi continuare? si, no");
                     String input1 = scanner.nextLine();
                     if (input1.equals ( "no" )) {
                         System.out.println ( menu );
                         command = Integer.parseInt( scanner.nextLine() );
                     } else if (input1.equals ( "si" )) {
                         command = 1;
                     } else {
                         command = 5;
                     }


                     break;
                 case 2:
                     System.out.println("quale elemento vuoi interire?");
                     arr.unShift( Integer.parseInt( scanner.nextLine() ) );
                     arr.consoleLog( "eseguito unShift" );

                     System.out.println("Vuoi continuare? si, no");
                     String input2 = scanner.nextLine();
                     if (input2.equals ( "no" )) {
                         System.out.println ( menu );
                         command = Integer.parseInt( scanner.nextLine() );
                     } else if (input2.equals ( "si" )) {
                         command = 2;
                     } else {
                         command = 5;
                     }
                     break;
                 case 3:
                     arr.pop( );
                     arr.consoleLog( "eseguito pop" );

                     System.out.println("Vuoi continuare? si, no");
                     String input3 = scanner.nextLine();
                     if (input3.equals ( "no" )) {
                         System.out.println ( menu );
                         command = Integer.parseInt( scanner.nextLine() );
                     } else if (input3.equals ( "si" )) {
                         command = 3;
                     } else {
                         command = 5;
                     }
                     break;
                 case 4:
                     arr.shift( );
                     arr.consoleLog( "eseguito shift" );

                     System.out.println("Vuoi continuare? si, no");
                     String input4 = scanner.nextLine();
                     if (input4.equals ( "no" )) {
                         System.out.println ( menu );
                         command = Integer.parseInt( scanner.nextLine() );
                     } else if (input4.equals ( "si" )) {
                         command = 4;
                     } else {
                         command = 5;
                     }
                     break;
                 case 5:
                     System.out.println("arrivederci!");
                     scanner.close();
                     break;
                 default:
                     System.out.println("Non barare da 1 a 5 ho detto ;)");
                     break;
             }
         }
    }


}






