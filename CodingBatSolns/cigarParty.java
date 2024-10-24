public boolean cigarParty(int cigars, boolean isWeekend) {

  if (isWeekend == true)
  {
    if (cigars>=40)
    {
      return true;
    }
  }
  else
  {
     if(cigars>=40 && cigars <61)
     {
         return true;
     }

      else
     {
        return false;
      }
  }
  return false;
}
