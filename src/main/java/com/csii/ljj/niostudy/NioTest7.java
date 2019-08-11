package com.csii.ljj.niostudy;

import org.jboss.netty.util.internal.ByteBufferUtil;

import java.nio.ByteBuffer;

/**
 * 我们可以随时讲一个Buffer转为只读buffer，单反之不行
 */
public class NioTest7 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        // HeapByteBuffer
        System.out.println(buffer.getClass());
        for (int i=0; i<buffer.capacity();++i){
            buffer.put((byte) i);

        }
        ByteBuffer readOnlyByteBuffer = buffer.asReadOnlyBuffer();
        // HeapByteBufferR
        System.out.println(readOnlyByteBuffer.getClass());

    }
}
