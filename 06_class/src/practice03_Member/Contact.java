package practice03_Member;

public class Contact {

  // field
  private String tel;
  private String mobile;
  
  // constructor
  public Contact() {
    
  }
  public Contact(String tel, String mobile) {
    super();
    this.tel = tel;
    this.mobile = mobile;
  }
  
  // method
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public String getMobile() {
    return mobile;
  }
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
  
}
