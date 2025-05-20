package Step_1_The_Basics;

public class Count_Digit {
    public static int count_1(int num){
        int count=0;
        if(num<9) return 1;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
    public static int count_2(int num){
        num=Math.abs(num);
        return (int) Math.log10(num)+1;
    }
    public static int count_3(int num){
        num=Math.abs(num);
        if(num<10) return 1;
        return 1+count_3(num/10);
    }



public static void main(String[] args){
        System.out.println(count_1(12));
        System.out.println(count_2(1234));
        System.out.println(count_3(123456));
}
}
