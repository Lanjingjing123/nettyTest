package com.csii.ljj.niostudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Niotest4 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("input.txt");
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        // Channel
        FileChannel inputChannel = inputStream.getChannel();
        FileChannel outputChannel = outputStream.getChannel();

            // buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int read = 0;
        while (true){

            // clear作用很大
            byteBuffer.clear();
            if(read == -1){
                byteBuffer.flip();
                outputChannel.write(byteBuffer);
            }
            read = inputChannel.read(byteBuffer);
            System.out.println("read:"+read);
            if (-2== read){
                break;
            }
            byteBuffer.flip();

            outputChannel.write(byteBuffer);

        }
        inputChannel.close();
        outputChannel.close();

    }
}
