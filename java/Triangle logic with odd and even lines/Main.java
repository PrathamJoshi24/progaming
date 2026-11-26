public class Main
{
	public static void main(String[] args) {
        int m = 0;
        int eve = 0;
        int odd = 1;
        for(int i = 1;i <= 5;i++){
            m++;
            System.out.println();
            for(int j = 1;j <= i;j++){
                if (m%2==0 && m!=1){
                    eve+=2;
                    System.out.print(eve+" ");
                }    
                else if((m%2!=0 && m>1)){
                    odd+= 2;
                    System.out.print(odd+" ");
                }
                else{
                    System.out.print(odd);
                }
            }
        }
	}
}