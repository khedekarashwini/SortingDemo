package com.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;




public class SortArraylist {

	public static void main(String[] args) {
           ArrayList l1=new ArrayList<>();
             l1.add(12);
             l1.add(90);
             l1.add(78);
             l1.add(10);
             System.out.println("Original list.."+l1);
             
          Comparator comp=Collections.reverseOrder();
            Collections.sort(l1,comp);
            System.out.println("Reverse String.."+l1);

	}

}
