package com.anand.factory;
/*
   An InputStream is the base class to read bytes from a stream (network or file).
   It provides the ability to read bytes from the stream and detect the end of the stream.

   DataInputStream is a kind of InputStream to read data directly as primitive data types.

   BufferedInputStream is a kind of inputStream that reads data from a stream and uses a buffer to optimize speed access to data.
   data is basicaly read ahead of time and this reduces disk or network access.
 */


public class IOS implements OS{

    public void spec(){
        System.out.println("most secured OS");
    }
}
