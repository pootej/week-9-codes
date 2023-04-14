class SelectionSort{
  public static void main(String args[]){
    int arr[]={2,5,45,23,49,13,7};
    int temp;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp; 
        }   
      }
      System.out.print(arr[i]+"  ");
    }
  }
}