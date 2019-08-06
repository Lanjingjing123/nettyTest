package com.csii.ljj.niostudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest8 {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("input.txt");
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        // Channel

        FileChannel inputChannel = inputStream.getChannel();
        FileChannel outputChannel = outputStream.getChannel();

        // buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        int read = 0;
        while (true) {

            // clear作用很大
            byteBuffer.clear();

            read = inputChannel.read(byteBuffer);
            System.out.println("read:" + read);
            if (-1 == read) {
                break;
            }
            byteBuffer.flip();

            outputChannel.write(byteBuffer);

        }
        inputChannel.close();
        outputChannel.close();


    }
}
