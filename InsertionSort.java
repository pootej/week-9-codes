class InsertionSort{
  public static void main(String args[]){
    int arr[]={1,6,78,45,17};
    for(int i=1;i<arr.length;i++){
      for(int j=i;j>0 && arr[j-1]>arr[j];j--){
        int temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
      
      }
    }
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
    }
  }
}