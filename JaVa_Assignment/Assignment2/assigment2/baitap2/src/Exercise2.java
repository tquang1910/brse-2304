import java.time.LocalDateTime;

public class Exercise2 {
  public static void question1(){
      int i = 5;
      System.out.printf("i = %d%n", i);
  }

  public static int question2(){
      int x = 100000000;
      System.out.printf("x = %,d%n" , x);
      return x;
  }
  public static void question3(){
      float f = 5.567098F;
      System.out.printf("f= %.4f%n", f);
  }

  public static void question4(){
      String hoVaTen = "Nguyễn Văn A";
      System.out.printf("Tên tôi là \"%S\" và tôi đang độc thân%n", hoVaTen);
  }

/*  Lỗi
    public static void question5(){
      LocalDateTime time = LocalDateTime.now();
      System.out.printf("Thời gian hiện tại là %t%n", time);
      }*/



}
