package MinusMayus;

public class CambiaStrings
{

    //
    public String mayusMinus(String prueba) {

        String resultado = "";     // StringBuilder
        for (int i=0;i<prueba.length();i++) {
            if(i%2==0) {
                prueba=prueba.toUpperCase();
                char letra='c';
                letra=prueba.charAt(i);
                resultado += letra;
            }

            else {
                prueba=prueba.toLowerCase();
                char letra2='f';
                letra2=prueba.charAt(i);
                resultado += letra2;

            }
        }

        return resultado;
    }

    String centrar(String str) {
        return "";
    }

}
