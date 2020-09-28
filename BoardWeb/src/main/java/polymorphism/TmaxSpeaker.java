package polymorphism;

import org.springframework.stereotype.Component;

@Component("tMaxSpeaker")
public class TmaxSpeaker implements Speaker{
   public TmaxSpeaker() {
      System.out.println("===> TMaxSpeaker Create");


   }
   @Override
   public void volumeUp() {
      System.out.println("TmaxSpeaker --- Volume Up");
      
   }
   @Override
   public void volumeDown() {
      System.out.println("TmaxSpeaker --- Volume Down");
      
   }
}