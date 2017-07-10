package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 7/10/2017.
 */
public class Container {
    private List<Goods> allgoods = new ArrayList<Goods>();
    public void add(Goods newGoods){
        allgoods.add(newGoods);
    }

    public int count(){
        return allgoods.size();
    }

    public Goods getIndex(int index){
        return allgoods.get(index);
    }

    void sortCost(){
        Collections.sort(allgoods);
    }

    public void print(){
        for (Goods a: allgoods
             ) {
            System.out.println(a);
            
        }
    }

}
