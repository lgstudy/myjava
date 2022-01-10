package org.myjava.shell;


import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class CallShell {

    public static void main(String[] args) {
        String bin = "/Users/liugang/Downloads/ffmpeg/bin/" ;
        String source = "/Users/liugang/Downloads/source" ;
        callCMD(bin+"ffprobe -print_format json -show_streams -i 2.mp4",source);
    }

    private static void callCMD(String cmd, String... workspace) {
        try {
            File dir = null;
            if (workspace[0] != null) {
                dir = new File(workspace[0]);
                System.out.println(workspace[0]);
            }
            Process process = Runtime.getRuntime().exec(cmd, null, dir);
            /*int status = process.waitFor();
            if (status != 0) {
                System.err.println("Failed to call shell's command and the return status's is: " + status);
            }*/
            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            StringBuilder sb = new StringBuilder();
            while ((line = input.readLine()) != null) {
                System.out.println(line);
                sb.append(line.trim()) ;
            }
            input.close();
            String json = sb.toString() ;

            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
