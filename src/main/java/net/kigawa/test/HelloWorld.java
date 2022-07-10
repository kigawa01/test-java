package net.kigawa.test;

import java.io.*;

public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");
        try {
            var in = new BufferedReader(new InputStreamReader(System.in));
            var out = new BufferedWriter(new OutputStreamWriter(System.out));
            while (true) {
                var str = in.readLine();
                out.write(str + "\n");
                out.flush();
                switch (str) {
                    case "stop":
                        return;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
