package practice03_Club;

import java.util.HashSet;
import java.util.Set;

public class Club {

  private Set<Person> pool;
  
  public Club() {
    pool = new HashSet<Person>();
  }
  
  public void enterClub(Person person) {
    pool.add(person);
  }
  
  public void leaveClub(Person person) {
    pool.remove(person);
  }
  
  public void poolList() {
    for(Person person : pool) {
      System.out.println(person);
    }
  }
  
}
