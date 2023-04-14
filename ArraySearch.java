import java.util.Scanner;
class ArraySearch{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int count=0;
    int arr[]={18,23,7,54,6,27,111};
    System.out.println("Enter the number to check whether it is present in list or not: ");
    int num=s.nextInt();
    for(int i=0;i<arr.length;i++){
      if(num==arr[i]){
        count++;
      }
    }
    if(count>0){
      System.out.println("The number is present");
    }
    else{
      System.out.println("The number is not present");
    }
  }
}