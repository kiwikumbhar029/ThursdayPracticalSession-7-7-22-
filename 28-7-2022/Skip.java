import java.io.FileInputStream;
import java.io.IOException;
public class Skip   
{
  public static void main(String[] args) 
   {
     try 
       {
         FileInputStream s = new FileInputStream("Favorite things.txt");
         int i = 0;
         s.skip(3);
         System.out.print("Printing text from index 5: ");
         while ((i=s.read()) != -1) 
          {
            System.out.print((char)i);
          }
        
         s.close();
       }
         catch (Exception e) 
           {
             System.out.println(e);
           }
   }
}