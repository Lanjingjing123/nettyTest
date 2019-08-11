package com.csii.ljj.nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest3 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("NioTest3.txt");

        FileChannel fileChannel = fileOutputStream.getChannel();

        byte[] message = "hello world ,you are welcome!".getBytes();
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        for (int i = 0;i<message.length;i++){
            byteBuffer.put(message[i]);
        }
        byteBuffer.flip();

        fileChannel.write(byteBuffer);
        fileOutputStream.close();

    }
}
