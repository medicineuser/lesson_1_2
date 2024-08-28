// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Завтрак");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();

        int areaOfSchool = calculateArea(6.0f,4.5f);
        System.out.println(areaOfSchool);
    }

    public static void makeTea(){
        System.out.println("Вскпяпитить воду");
        System.out.println("Насыпать заварку");
        System.out.println("Залить кипятком");
        System.out.println("Налить в чашку и добавить молоко сахар");
    }


    // re
    public static int calculateArea(float length , float width){
        int area = Math.round((length * width));
        return area;
    }
}