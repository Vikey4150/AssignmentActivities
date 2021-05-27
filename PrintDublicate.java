package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDublicate {

		public static void main(String[] args) 
		{
			int num[] = {1,3,8,3,11,5,6,4,7,6,7}, count=0;
			List<Integer> vig = new ArrayList<Integer>();
			for (int i = 0; i < num.length; i++)
			{
				vig.add(num[i]);
			}
			for(int i=0;i<vig.size();i++)
			{
				for(int j=i+1;j<vig.size();j++)
				{
					if(vig.get(i)==vig.get(j))
						count++;
				}
				if(count>0)
				{
					System.out.println(vig.get(i)+" ");
				}
				count=0;
			}
		}

	}