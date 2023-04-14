import java.util.*;

class Rectangle implements Comparable<Rectangle> {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public int compareTo(Rectangle r) {
       if(getPerimeter()>r.getPerimeter()){
         return 1;
       }
      else if(getPerimeter()<r.getPerimeter()){
        return -1;
      }
      else{
        return 0;
      }
    }
}

  class AreaComparator implements Comparator<Rectangle> {
        @Override
        public int compare(Rectangle rect1, Rectangle rect2) {
            if(rect1.getArea()>rect2.getArea()){
              return 1;
            }
          else if(rect1.getArea()<rect2.getArea()){
            return -1;
          }
          else{
            return 0;
          }
        }
    }

class RectangleDemo {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<3;i++){
        rectangles.add(new Rectangle(sc.nextInt(),sc.nextInt()));
      }
      
      System.out.println("Sorted Area");
      Collections.sort(rectangles,new AreaComparator());
      for(Rectangle r : rectangles){
        System.out.println(r.width+" x "+r.height+" = "+r.getArea());
      }

      System.out.println("Sorted Perimeter");
      Collections.sort(rectangles);
      for(Rectangle r : rectangles){
        System.out.println(r.width+" x "+r.height+" = "+r.getPerimeter());
      }
    }
}