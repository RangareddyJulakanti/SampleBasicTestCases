package com.exception.checkedUncheked;

import java.io.*;

public class Test {
    public static void main(String[] args) {
       m1();

    }

    private static void m1() {
        File f = new File("/Part4.docx");
        if (!f.isDirectory()) {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(f));

            } catch (FileNotFoundException e) {
              throw new RuntimeException(e);
            } finally {
                try {
                    if(br!=null) {
                        br.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
