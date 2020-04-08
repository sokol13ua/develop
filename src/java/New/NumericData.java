package New;

import java.lang.String;

public class NumericData {
    public static void main(String[] args) {
        byte num; // диапазон допустимых значений от -128 до 127 (целые числа, 1 байт)
        byte num_1 = 100;
        byte num_2 = -120;
        System.out.println(num_1);
        System.out.println(num_2);
        int nammber; //диапазон допустимых значений от -2147483648 до 2147483647 (целые числа, 4 байта)
        int nammber_1 = 15025;
        int nammber_2 = -25869526;
        int nammber_3 = 256987456;
        System.out.println(nammber_1);
        System.out.println(nammber_2);
        System.out.println(nammber_3);
        long its; // диапазон допустимых значений от -9223372036854775808 до 9223372036854775807 (целые числа, 8 байтов)
        long its_1 = 256988435;
        long its_2 = 65498489;
        long its_3 = -968799541;
        System.out.println(its_3);
        System.out.println(its_1);
        System.out.println(its_2);
        short am; //диапазон допустимых значений от -32768 до 32767  (целые числа, 2 байта)
        short am_2= 32568;
        short am_1 = -32568;
        System.out.println(am_2);
        System.out.println(am_1);
        float at; //  диапазон допустимых значений от ~1,4*10-45 до ~3,4*1038 (вещественные числа, 4 байта)
        float at_3 = 24.45f;
        float at_1 = -2486.458f;
        float at_2 = 256987.236f;
        System.out.println(at_3);
        System.out.println(at_1);
        System.out.println(at_2);
        double et; //диапазон допустимых значений от ~4,9*10-324  до ~1,8*10308 (вещественные числа, 8 байтов)
        double et_1 = 245.6489489498498d;
        double et_2 = -2568.5495489489489d;
        double et_3 = 1d;
        System.out.println(et_3);
        System.out.println(et_1);
        System.out.println(et_2);
        boolean fals; // предназначен для хранения логических значений.
        // Переменные этого типа могут принимать только одно из 2х возможных значений true или false.
        //(значение истина/ложь, 1 байт)
        boolean isTru = true;
        boolean isTru_1 = false;
        System.out.println(isTru);
        System.out.println(isTru_1);
        char sym; // cимвольный тип данных представляет собой один 16-битный Unicode символ(символ Unicode, 2 байта).
        char sym_1 = 'r';
        char sym_2 = 'o';
        System.out.println(sym_2);
        System.out.println(sym_1);
        String st; //Тип String не является примитивным типом данных,
        // однако это один из наиболее используемых типов в Java.
        String str = "Helloy world!";
        String str_1 = "Helloy Ukraine!";
        String str_2 = "Apple ";
        System.out.println(str);
        System.out.println(str_1);
        System.out.println(str_2);
        System.out.println(str + str_2);
        System.out.println("Helloy" + " " + "Peaple");
        System.out.println( "My telephone is " + str_2);
    }

}










