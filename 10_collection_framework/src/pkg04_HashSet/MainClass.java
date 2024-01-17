package pkg04_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {

  public static void method1() {
    
    // HashSet 타입 선언
    Set<String> hobbies;
    
    // HashSet 객체 생성
    hobbies = new HashSet<String>();
    
    // 요소 추가하기 (순서 없이 저장되고, 중복 저장이 불가능하다.)
    hobbies.add("수영");
    hobbies.add("수영");
    hobbies.add("수영");
    hobbies.add("여행");
    hobbies.add("골프");
    hobbies.add("운전");
    hobbies.add("게임");
    
    // advanced for 문
    for(String hobby : hobbies) {
      System.out.println(hobby);
    }
    
  }

  public static void method2() {
    
    // 교집합
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));
    
    // set1 이 교집합 결과로 변환된다.
    set1.retainAll(set2);
    
    System.out.println(set1);
    
  }
  
  public static void method3() {
    
    // 합집합
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));
    
    // set1 이 합집합 결과로 변환된다.
    set1.addAll(set2);
    
    System.out.println(set1);
    
  }

  public static void method4() {
    
    // 차집합
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));
    
    // set1 이 차집합 결과로 변환된다.
    set1.removeAll(set2);
    
    System.out.println(set1);
    
  }
  
  public static void main(String[] args) {
    method4();
  }

}
