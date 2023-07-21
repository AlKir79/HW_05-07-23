//Задание 10
//Напишите программу, которая будет считывать с консоли любое число (от 0 до 99999999) и
// выводить его цифры в
//виде «звёздочек»

import java.util.Scanner;

public class Task10 {
    static String line1="";
    static String line2="";
    static String line3="";
    static String line4="";
    static String line5="";
    static String line6="";
    static String line7="";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        String num=in.next();
        for (int i=0;i<num.length();i++){
                addDig(num.charAt(i));
        }
        printStr();
    }
    static void addDig(char dig){
        switch (dig) {
            case '1':
                line1+= "  *  ";
                line2+= " **  ";
                line3+= "  *  ";
                line4+= "  *  ";
                line5+= "  *  ";
                line6+= "  *  ";
                line7+= " *** ";
                break;
            case '2':
                line1+= "  ***  ";
                line2+= " *   * ";
                line3+= " *  *  ";
                line4+= "   *   ";
                line5+= "  *    ";
                line6+= " *     ";
                line7+= " ***** ";
                break;
            case '3':
                line1+= " ****  ";
                line2+= "     * ";
                line3+= "     * ";
                line4+= "  ***  ";
                line5+= "     * ";
                line6+= "     * ";
                line7+= " ****  ";
                break;
            case '4':
                line1+= "     *  ";
                line2+= "    **  ";
                line3+= "   * *  ";
                line4+= "  *  *  ";
                line5+= " ****** ";
                line6+= "     *  ";
                line7+= "     *  ";
                break;
            case '5':
                line1+= " ****  ";
                line2+= " *     ";
                line3+= " *     ";
                line4+= " ***   ";
                line5+= "     * ";
                line6+= "     * ";
                line7+= " ****  ";
                break;
            case '6':
                line1+= "  ****  ";
                line2+= " *      ";
                line3+= " *      ";
                line4+= " *****  ";
                line5+= " *    * ";
                line6+= " *    * ";
                line7+= "  ****  ";
                break;
            case '7':
                line1+= " ***** ";
                line2+= "     * ";
                line3+= "    *  ";
                line4+= "   *   ";
                line5+= "  *    ";
                line6+= " *     ";
                line7+= " *     ";
                break;
            case '8':
                line1+= "  ***  ";
                line2+= " *   * ";
                line3+= " *   * ";
                line4+= "  ***  ";
                line5+= " *   * ";
                line6+= " *   * ";
                line7+= "  ***  ";
                break;
            case '9':
                line1+= "  ***  ";
                line2+= " *   * ";
                line3+= " *   * ";
                line4+= "  **** ";
                line5+= "     * ";
                line6+= "     * ";
                line7+= "     * ";
                break;
            case '0':
                line1+= "   ***   ";
                line2+= "  *   *  ";
                line3+= " *     * ";
                line4+= " *     * ";
                line5+= " *     * ";
                line6+= "  *   *  ";
                line7+= "   ***   ";
                break;
            default:
                break;
        }
    }
static void printStr() {
    System.out.println(line1);
    System.out.println(line2);
    System.out.println(line3);
    System.out.println(line4);
    System.out.println(line5);
    System.out.println(line6);
    System.out.println(line7);
}
}
