package com.ashu.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class MainController {

    @RequestMapping("/")
    public String showIndex(){

        int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

        // Display the original (unsorted values)
        System.out.print("before: ");
        for ( int i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();
        int temp;


		for (int i =0 ;i <arr.length-1 ;i++ )
		{
			for (int j=0 ;j<arr.length-1 ;j++ )
			{
				if (arr[j]>arr[j+1] )
				{
				    temp=arr[j+1];
				    arr[j+1]=arr[j];// swap the values in two slots
				    arr[j]=temp;

				}
			}
		}


       //Display arrays sorted
        System.out.print("after : ");
        for ( int i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();
return Arrays.toString(arr);
    }


}
