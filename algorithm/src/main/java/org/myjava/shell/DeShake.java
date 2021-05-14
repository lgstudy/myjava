package org.myjava.shell;


import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class DeShake {

    public static void main(String[] args) {
        String bin = "/Users/liugang/Downloads/ffmpeg/bin/" ;
        String source = "/Users/liugang/Downloads/source/sucai" ;
        for (int i = 1; i <13 ; i++) {
            callCMD(bin+"ffmpeg -y -i "+ i +".MP4 -vf vidstabdetect=result=transforms.trf:shakiness=10:tripod=1:show=1 -f null -",source);
            callCMD(bin+"ffmpeg -y -i "+ i +".MP4 -vf vidstabtransform=input=transforms.trf:tripod=1 -b:v 5518k "+ i +"out.mp4",source);
        }
    }

    private static void callCMD(String cmd, String... workspace) {
        try {
            File dir = null;
            if (workspace[0] != null) {
                dir = new File(workspace[0]);
            }
            Process process = Runtime.getRuntime().exec(cmd, null, dir);
            int status = process.waitFor();
            if (status != 0) {
                System.err.println("Failed to call shell's command and the return status's is: " + status);
            }
            System.err.println(cmd + "   " + "执行完成") ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
