//This is practice 1 - helloName
public String helloName(String name) {

return "Hello "+name+"!";
}

//this is practice 2 - makeAbba
public String makeAbba(String a, String b) {
  
  return a+b+b+a;
}

//thsi is practice 3 - makeTags
public String makeTags(String tag, String word){
  
  return "<"+tag+">"+word+"</"+tag+">";

//this si practice 4 - firstHalf
  public String firstHalf(String str) {
  
  int lengthOfString = str.length();
  int halfOfString = lengthOfString/2;
  return str.substring(0, halfOfString);
  
}

}
