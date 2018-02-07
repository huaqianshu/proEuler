package pro30;

public class Pro30 {
	public static void main(String[] args) {
		
		int sum =0;
		for(int a =0;a<4;a++){
			for(int b =0;b<10;b++){
				for(int c =0;c<10;c++){
					for(int d =0;d<10;d++){
						for(int e =0;e<10;e++){
							for(int f =0;f<10;f++){
								int num = a*100000+b*10000+c*1000+d*100+e*10+f;
								int num1 = (int) (Math.pow(a, 5)+Math.pow(b, 5)+Math.pow(c, 5)+Math.pow(d, 5)+Math.pow(e, 5)+Math.pow(f, 5));
								if(num==num1){
									sum+=num;
								}
							}
						}
					}
				}
			}
		
		}
		System.out.println(sum);
//		System.out.println(Math.pow(4, 5)+Math.pow(1, 5)+Math.pow(5, 5)+Math.pow(0, 5));
//		System.out.println(Math.pow(4, 5)+Math.pow(1, 5)+Math.pow(5, 5)+Math.pow(1, 5));
//		System.out.println(Math.pow(5, 5)+Math.pow(4, 5)+Math.pow(7, 5)+Math.pow(4, 5)+Math.pow(8, 5));
//		System.out.println(7*Math.pow(9, 5));
		
	}
}
