import java.util.Scanner;
class BinarySearch{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int a[]={2,3,4,5,6,7,8};
    int mid,start=0,end=a.length-1;
    System.out.println("Enter the element to be searched");
    int key=s.nextInt();
    while(true){
      mid=(start+end)/2;
      if(a[mid]==key){
        System.out.println("Element is found at "+mid+"th position");
        break;
      }
      else if(a[mid]<key){
        start=mid+1;
      }
      else{
        end=mid-1;
      }
    }
  }
}
    
