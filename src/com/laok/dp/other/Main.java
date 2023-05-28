package com.laok.dp.other;

import java.io.*;

/**
 * @author k 2022/8/26 11:24
 */
public class Main {


    public static void main(String[] args) {
//        String[] s = new String[]{
//                "E845350C464627EB46097E34BFC4EA6B",
//                "AB5BB0AB89AE8CC2D91A030CCB371E9F",
//                "204D968D133263F8DCB23A784D4CE10C"};
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(DesEncrypt.desString(s[i]));
//        }


//        String s = DesEncrypt.desString("042179BC9051E55FA2157D9EA17EB70C");
//        System.out.println(s);
        readAndWrite("a.txt");
    }

    public static void readAndWrite(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            FileOutputStream fileOutputStream = new FileOutputStream("b.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
            String s;
            while (((s = bufferedReader.readLine()) != null)) {
                String tempStr = DesEncrypt.desString(s);
                bufferedWriter.write(tempStr);
                bufferedWriter.newLine();
                System.out.println(tempStr);

            }
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


