
/**
 * Write a description of class LetraA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LetraA
{
    public String array [] = new String[]{"Chale","abeja","Ahora","no","aguacate"};
    public void Letras(){
        int Total=0;
        for(int i=0;i<array.length;i++){
                if(array[i].charAt(0)=='a'||array[i].charAt(0)=='A'){
                    Total++;
                }
        }
        System.out.println("Hay: "+ Total +" palabras que empizan por a");
    }
    public static void main(String [] args){
        LetraA  prueba = new LetraA();
        prueba.Letras();
    }
}
