package pkg01_File;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class MainClass {

  /*
   * java.io.File
   * 1. 디렉터리, 파일을 관리하는 클래스이다.
   * 2. 디렉터리, 파일을 만들고 삭제할 수 있다.
   * 3. 디렉터리, 파일의 정보(이름, 경로, 크기, 최종수정일 등)를 확인할 수 있다.
   */
  
  /*
   * 경로 작성 방법
   * 1. 경로 구분자 (separator)
   *    1) 윈도우      : 역슬래시(\\)
   *    2) 리눅스, Mac : 슬래시(/)
   *    3) File.separator 필드를 사용하면 플랫폼에 따른 경로 구분자가 자동 삽입된다.
   * 2. 디렉터리
   *    1) 루트 : 경로 구분자로 시작하는 경로는 루트에서 시작하는 경로
   *    2) 상위 : ..
   *    3) 현재 : .
   */
  
  public static void method1() {
    
    // 디렉터리 만들기/삭제하기
    
    // File 객체 선언
    File dir;
    
    // File 객체 생성
    dir = new File("\\storage");
    
    // 디렉터리 유무에 따른 생성/삭제
    if(!dir.exists()) {       // 디렉터리가 없으면
      dir.mkdirs();
    } else {                  // 디렉터리가 있으면
      // dir.deleteOnExit();  // JVM 실행이 종료된 이후에 삭제한다.
      dir.delete();           // JVM 실행 중에 삭제한다.
    }
    
  }

  public static void method2() {
    
    // 파일 만들기/삭제하기
    
    // 파일이 저장될 디렉터리 작업
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File 객체로 생성
    File file = new File(dir, "sample.txt");
    
    // 파일 유무에 따른 생성/삭제
    if(file.exists()) {  // 파일이 있으면
      file.delete();
    } else {             // 파일이 없으면
      try {
        file.createNewFile();  // IOException 처리가 반드시 필요하다.(Checked Exception)        
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void method3() {
    
    /*
     * File 클래스 주요 메소드
     * 1. listFiles()    : 디렉터리 내의 모든 File 객체를 File[] 배열로 반환
     * 2. getName()      : 이름 반환
     * 3. getParent()    : 저장된 디렉터리 반환
     * 4. getPath()      : getParent() + getName()
     * 5. lastModified() : 최종수정일을 long 타입으로 반환
     * 6. length()       : 파일 크기를 long 타입으로 반환 (바이트 단위)
     * 7. isDirectory()  : 디렉터리이면 true 반환
     * 8. isFile()       : 파일이면 true 반환 
     */
    
    // JAVA_HOME 을 File 객체로 생성
    File javaHome = new File("\\Program Files\\Java\\jdk-17");
    
    // JAVA_HOME 에 있는 모든 디렉터리와 파일을 File 객체로 가져오기
    File[] files = javaHome.listFiles();
    
    // 하나씩 확인
    for(File file : files) {
      
      StringBuilder builder = new StringBuilder();
      
      // 이름
      builder.append(String.format("%-20s", file.getName().substring(0, Math.min(file.getName().length(), 20))));
      
      // 최종수정일
      String lastModified = new SimpleDateFormat("yyyy-MM-dd a h:mm").format(file.lastModified());
      builder.append(String.format("%-20s", lastModified));
      
      // 유형
      builder.append(String.format("%-10s", file.isDirectory() ? "파일 폴더" : "파일"));
      
      // 크기
      long byteSize = file.isDirectory() ? 0 : file.length();
      long kbSize = (byteSize / 1024) + (byteSize % 1024 != 0 ? 1 : 0);
      if(byteSize != 0)
        builder.append(String.format("%10s", new DecimalFormat("#,##0").format(kbSize) + "KB"));
      
      // 출력
      System.out.println(builder.toString());
      
    }
    
  }
  
  public static void main(String[] args) {
    method3();
  }

}
