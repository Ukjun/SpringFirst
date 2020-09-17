package polymorphism;

public class TvTest {
   public static void main(String[] args) {
      BeanFactory bean = new BeanFactory();
      
      TV tv = (TV)bean.getBean(args[0]);
      tv.powerOn();
      tv.volumeUp();
      tv.volumeUp();
      tv.powerOff();
   }
}