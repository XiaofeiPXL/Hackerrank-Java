import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

/*
methood 1
*/
class Singleton{
    private static final Singleton instance=null;

    private Singleton() {

    }

    public static Singleton getSingleInstance() {
        if (instance == null)
            return new Singleton();
        return instance;
    }
}

/*
method 2 静态初始化类，推荐使用
*/

class Singleton{

	private static Singleton(){};

	private static class SingletonHolder{
		private static Singleton.instance = new Singleton();
	}

	public Singleton getInstance(){
		return SingletonHolder.instance;
	}
}

/*
method 3 双重检测，但某些情况下会出现小问题，谨慎使用
*/

class Singleton{
	private volatile static Singleton instance = null;

	private Singleton(){};

	public static Singleton getInstance(){
		if(instance==null){
           synchronized(Singleton.class){
               if(instance==null){
                   instance = new Singleton();
               }
           }
		}
		return insatnce;
	}
}










