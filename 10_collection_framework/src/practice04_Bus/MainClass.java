package practice04_Bus;

public class MainClass {

  public static void main(String[] args) {
    
    try {
      
      Bus bus = new Bus();
      
      bus.on(new Woman("제시카"));
      bus.on(new Woman("앨리스"));
      bus.on(new Woman("캐서린"));
      bus.on(new Woman("낸시"));
      bus.on(new Woman("엠마"));
      
      bus.info();
      
      bus.off(1);
      bus.off(2);
      bus.off(3);
      bus.off(4);
      
      bus.on(new Man("스티브"));
      bus.on(new Man("필립"));
      bus.on(new Man("톰"));
      bus.on(new Man("앤디"));
      bus.on(new Man("제임스"));
      
      bus.info();
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

}
