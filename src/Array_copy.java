package com.neuedu.Test;
/**
 * Created by 13930 on 2020/2/5.
 */
public class Array_copy {
    public int [] array;
    public int size;
    public  Array_copy(){
        size=0;
        array=new int[10];
    }
    public int getSize(){
        return size;
    }
    public  void add(int i){
        if(size>=array.length){
            int [] newarray= new int[size+size/2];
            for(int j=0;j<array.length;j++){
                newarray[j]=array[j];
            }
            array=newarray;
            System.out.println("扩容完成，扩容后数组长度为"+array.length);
        }

        array[size++]=i;
    }

}

