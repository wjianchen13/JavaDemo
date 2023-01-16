package com.example.javademo.reflect;

import com.example.module.IFlavor;

public class Flavor implements IFlavor {

    @Override
    public String getName() {
        return "app";
    }
}
