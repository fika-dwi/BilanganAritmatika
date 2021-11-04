/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmatikabilangan;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author fika.dwi
 */
public class AritmatikaBilangan {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException
    {
        String angka="";
        //InputStremReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int x=0;
        boolean flag = true;
        String javaClass="";
        do
        {
            System.out.println("hANYA MAUSKKAN BILANGAN 1 SAMAPAI 5 ");
            System.out.println("masukkan bilangan : ");
            try
            {
                angka = br.readLine();
                x = Integer.parseInt(angka);
                flag=true;
                switch(x){
                    case 1:
                        javaClass="aritmatikabilangan.tambah.Tambah";
                        break;
                    case 2:
                        javaClass="aritmatikabilangan.kurang.Kurang";
                        break;
                    case 3:
                        javaClass="aritmatikabilangan.kali.Kali";
                        break;
                    case 4:
                        javaClass="aritmatikabilangan.bagi.Bagi";
                        break;
                    case 5:
                        javaClass="aritmatikabilangan.pangkat.Pangkat";
                        break;
                }
                    
                ClassLoader classLoader = AritmatikaBilangan.class.getClassLoader();
                Class myClass = classLoader.loadClass(javaClass);
                Object myInstance = myClass.newInstance();
                Method myMethod = myClass.getMethod("getAngka", new Class[]{int.class});
                Object hasil = myMethod.invoke(myInstance,new Object[] { x });
                System.out.println(hasil.toString());
            }
            catch(IOException e)
            {
                flag=false;
                System.out.println("Inputan harus berupa angka");
            }
        }while(!flag);
    }
}
