package CursoSE.src.cursose;

public class App {
    public static void main(String[] args) throws Exception {

        for(int i=0;i<10;i=i+2){
            System.out.println(i);
        }
        System.out.println("//////////////////");
        for(int i=0;i<5;i++){
            if (i==2) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("//////////////////");
        for(int i=0;i<5;i++){
            if (i==2) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("//////////////////");
        String[] array={"FACEBOOK","YOUTUBE","TWITER"};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println("//////////////////");
        String[] array2={"FACEBOOK","YOUTUBE","TWITER"};
        for(String s:array2){
            System.out.println(s);
        }

    }
}
