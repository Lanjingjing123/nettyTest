# io流
- 1. java.io最为核心的一个概念是流（Stream），面向流的编程，Java中，一个流要么是输入流，要么是输出流
- 2. 而java.nio中是面向一个快（block）的,由selctor,channel,buffer构成;buffer本身是一块内存，底层实现上他实际是一个数组，数据的读、写都是通过buffer来实现的
- 3. java.nio中的Buffer 有java原生的buffer类型除了Boolean型，其他类型都有
- 4. Channel 指的是可以向写入数据或从中读取数据的对象，永远不会出现直接向Channel写入数据的情况，或是直接从Channel中读数据的情况
- 5. 与Stream不同的是，Channel是双向的，一个流只能是Inputstream或是OutputStream，Channel打开后则可以进行读取、写入或是读写
- 6. 由于Channel 是双向的，更能表示操作系统底层