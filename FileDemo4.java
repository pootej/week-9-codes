class FileDemo4{
  public static void main(String args[]){

    try{
      FileOutputStream fw=new FileOutputStream("xyz.txt");
      String str="Its My Yard";
       byte bytes[]=str.getBytes();
      
       fw.write(bytes);
       fw.close();
     }
     catch(Exception e){
       System.out.println(e);
     }
    
  }
}