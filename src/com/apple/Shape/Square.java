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
 * @date 2019/11/4 21:11
 */
public class Square extends Shape0 {
    @Override
    void draw(){
        System.out.println("Square.draw()");
    }
    @Override
    void erase(){
        System.out.println("Square.erase()");
    }
}
