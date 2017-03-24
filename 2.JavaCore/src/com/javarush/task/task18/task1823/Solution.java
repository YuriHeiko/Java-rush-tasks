package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты

d:\_JavaRush\_Test\Dear Sir or Madam.txt
d:\_JavaRush\_Test\1111.txt
d:\_JavaRush\_Test\Dear Sir or Madam.docx
d:\_JavaRush\_Test\CSS-FOL-NBPNP-020E.pdf
d:\_JavaRush\_Test\letter.pdf
d:\_JavaRush\_Test\3_1.txt
exit

d:\_JavaRush\_Test\1111.txt 0
d:\_JavaRush\_Test\CSS-FOL-NBPNP-020E.pdf 32
d:\_JavaRush\_Test\3_1.txt 209
d:\_JavaRush\_Test\letter.pdf 217
d:\_JavaRush\_Test\Dear Sir or Madam.txt 32
d:\_JavaRush\_Test\Dear Sir or Madam.docx 0
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String fileName;
            while (!(fileName = reader.readLine()).equals("exit")) {
                ReadThread t = new ReadThread(fileName);
                t.start();
                t.join();
            }

            reader.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<String, Integer> m : resultMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (FileInputStream fis = new FileInputStream(fileName)) {
                Map<Integer, Integer> map = new TreeMap<>();

                int max = 0;
                int maxByte = 0;
                while (fis.available() > 0) {
                    int readByte = fis.read();
                    map.merge(readByte, 1, Integer::sum);
                    if (map.get(readByte) > max) {
                        max = map.get(readByte);
                        maxByte = readByte;
                    }
                }
/*                int[] arr = new int[256];
                int max = 0;
                int maxByte = 0;
                while (fis.available() > 0) {
                    int readByte = fis.read();
                    if (++arr[readByte] > max) {
                        max = arr[readByte];
                        maxByte = readByte;
                    }
                }*/

                resultMap.put(fileName, maxByte);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
