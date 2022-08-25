package com.dp.creational.builder;

/**
 * @author k 2022/8/26 00:07
 */
public class BuilderMain {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String result = htmlBuilder.getResult();
            System.out.println(result + "文件编写完成");
        } else {
            usage();
            System.exit(0);
        }

    }

    private static void usage() {
        System.out.println("Usage : java Main plain ");
        System.out.println("Usage : java Main html ");
    }
}
