package practice03_Member;

public class Address {

  // field
  private String postCode;
  private String roadAddress;
  private String jibunAddress;
  private String detailAddress;
  private String extraAddress;
  private boolean isBasicAddress;
  
  // constructor
  public Address() {
    
  }
  public Address(String postCode, String roadAddress, String jibunAddress, String detailAddress, String extraAddress,
      boolean isBasicAddress) {
    super();
    this.postCode = postCode;
    this.roadAddress = roadAddress;
    this.jibunAddress = jibunAddress;
    this.detailAddress = detailAddress;
    this.extraAddress = extraAddress;
    this.isBasicAddress = isBasicAddress;
  }

  // method
  public String getPostCode() {
    return postCode;
  }
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }
  public String getRoadAddress() {
    return roadAddress;
  }
  public void setRoadAddress(String roadAddress) {
    this.roadAddress = roadAddress;
  }
  public String getJibunAddress() {
    return jibunAddress;
  }
  public void setJibunAddress(String jibunAddress) {
    this.jibunAddress = jibunAddress;
  }
  public String getDetailAddress() {
    return detailAddress;
  }
  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }
  public String getExtraAddress() {
    return extraAddress;
  }
  public void setExtraAddress(String extraAddress) {
    this.extraAddress = extraAddress;
  }
  public boolean isBasicAddress() {
    return isBasicAddress;
  }
  public void setBasicAddress(boolean isBasicAddress) {
    this.isBasicAddress = isBasicAddress;
  }
  
}
