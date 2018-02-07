package pro29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pro29 {
	public static ArrayList<Integer> list = new ArrayList(){{
		add(2);add(3);add(4);add(5);add(6);add(7);add(8);add(9);add(10);
	}};
	public static ArrayList<Integer> list2 = new ArrayList(){{
		add(2);add(4);add(8);add(16);add(32);add(64);
	}};
	public static ArrayList<Integer> list3 = new ArrayList(){{
		add(3);add(9);add(27);add(81);
	}};
	public static HashMap<Integer,List<Integer>> map = new HashMap();
	public static int num=0;
	public static void main(String[] args) {
		for(int a=2;a<101;a++){
			midder:for(int b=2;b<101;b++){
				if(map.containsKey(a)&&map.get(a).contains(b))
					continue;
				num++;
				if(list.contains(a)){
					List<Integer> factorList = getFactor(b);
					inner1:for(int i =0;i<factorList.size();i++){
						int c = factorList.get(i);
						Integer key = (int) Math.pow(a,c);
						if(key>100)
							break inner1;
						int val = b/c;
						if(map.containsKey(key)&&map.get(key).contains(val))
							continue;
						if(map.containsKey(key))
							map.get(key).add(val);
						else
							map.put(key, new ArrayList<Integer>(){{add(val);}});
					}
				}
				if(list2.contains(a)){
					int temp = 1;
					int tempa = a;
					while(tempa/2!=1){
						temp=temp+1;
						tempa=tempa/2;
					}
					int squ = b*temp;
					List<Integer> factorList = getFactor(squ);
					inner2:for(int i =0;i<factorList.size();i++){
						int c = factorList.get(i);
						Integer key = (int) Math.pow(2,c);
						if(key>100)
							break inner2;
						int val = squ/c;
						if(map.containsKey(key)&&map.get(key).contains(val))
							continue;
						if(map.containsKey(key))
							map.get(key).add(val);
						else
							map.put(key, new ArrayList<Integer>(){{add(val);}});
					}
						
				}
				if(list3.contains(a)){
					int temp = 1;
					int tempa = a;
					while(tempa/3!=1){
						temp=temp+1;
						tempa=tempa/3;
					}
					int squ = b*temp;
					List<Integer> factorList = getFactor(squ);
					inner3:for(int i =0;i<factorList.size();i++){
						int c = factorList.get(i);
						Integer key = (int) Math.pow(3,c);
						if(key>100)
							break inner3;
						int val = squ/c;
						if(map.containsKey(key)&&map.get(key).contains(val))
							continue;
						if(map.containsKey(key))
							map.get(key).add(val);
						else
							map.put(key, new ArrayList<Integer>(){{add(val);}});
					}
						
				}
			}
		}
		System.out.println(num);
	}
	public static List<Integer> getFactor(int num){
		List<Integer> list = new ArrayList<>();
		int half = (int) Math.floor(num/2);
		for( int i = 2;i<=half;i++){
			if(num%i!=0)
				continue;
			list.add(i);
		}
		list.add(num);
		return list;
	}
}
