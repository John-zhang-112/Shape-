/*
 * Copyright 2019 tu.cn All right reserved. This software is the
 * confitdental and proprietary information of tu.cn("Confidenal
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */

package com.apple.Shape;

/**
 * @author John-zhang
 * @program classproject1
 * @Description
 * @date 2019/11/4 21:03
 */
public class Shape {
    public static Shape0 randShape(){
        switch ((int)(Math.random()*3)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
    public static void main(String[] args){
        Shape0[]s = new Shape0[9];
        for (int i=0;i<s.length;++i)
            s[i]=randShape();
        for (int i=0;i<s.length;++i)
            s[i].draw();
    }
}
