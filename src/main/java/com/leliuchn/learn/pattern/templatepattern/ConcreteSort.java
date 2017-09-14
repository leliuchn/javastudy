package com.leliuchn.learn.pattern.templatepattern;

/**
 * Created by leliuchn on 16/11/24.
 */
public class ConcreteSort extends AbstractSort{
    @Override
    protected void sort(int[] array) {
        for(int i = 0; i < array.length; i++)
        {
            selectSort(array,i);
        }
    }

    private void selectSort(int[] array,int index)
    {
        int MinValue = Integer.MAX_VALUE;
        int indexMin = 0;
        int tmp;
        for(int i = index; i < array.length; i++)
        {
            if(array[i] < MinValue)
            {
                MinValue = array[i];
                indexMin = i;
            }
        }

        tmp = array[index];
        array[index] = array[indexMin];
        array[indexMin] = tmp;
    }
}
