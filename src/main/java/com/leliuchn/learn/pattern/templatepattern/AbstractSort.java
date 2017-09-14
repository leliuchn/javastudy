package com.leliuchn.learn.pattern.templatepattern;

/**
 * Created by leliuchn on 16/11/24.
 */
abstract public class AbstractSort {

    protected abstract void sort(int[] array);

    public void showSortResult(int[] array)
    {
        this.sort(array);
        System.out.println("排序结果：");
        for(int i = 0; i < array.length; i ++)
        {
            System.out.printf("%3s",array[i]);
        }
    }
}
