public String firstTwo(String str) {
  int string =  str.length();

    if (string < 2)
    {
      return str;
    }
    else
    {
      return str.substring(0,2);
    }
    
}
