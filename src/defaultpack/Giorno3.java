package defaultpack;
import giorno3.epicode.util.MyArray;

public class Giorno3 {
     public static void main(String[] args) {
         MyArray arr = new MyArray( new int[] { 2 , 3 , 4 , 5 } );
         arr.push( 6 ); // metodo push()
         arr.consoleLog("eseguito push ");
         arr.pop(); // metodo pop()
         arr.consoleLog("eseguito pop ");
         arr.unShift( 44 ); // metodo unshift()
         arr.consoleLog("eseguito unShift ");
         arr.shift();
         arr.consoleLog( "eseguito shift" );
    }


}






