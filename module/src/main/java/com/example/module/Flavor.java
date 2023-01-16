package com.example.module;

public class Flavor implements IFlavor{

    private static Flavor INSTANCE;
    IFlavor mFlavor;

    public static Flavor getInstance() {
        if (INSTANCE == null) {
            synchronized (Flavor.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Flavor();
                }
            }
        }
        return INSTANCE;
    }

    private IFlavor getFlavor() {
        if(mFlavor == null) {
            //方式三：
            //forName()方法会抛出异常
            Class<?> cls = null;
            try {
                cls = Class.forName("com.example.javademo.reflect.Flavor");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("======================> " + cls);

            try {
                //将构造好的对象向下转型为String类
                //newInstance()方法会抛异常
                mFlavor = (IFlavor) cls.newInstance();

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return mFlavor;
    }

    @Override
    public String getName() {
        return getFlavor() != null ? getFlavor().getName() : "";
    }
}
