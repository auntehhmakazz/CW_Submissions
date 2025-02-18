//has23
public boolean has23(int[] nums) {
  
  for(int i = 0; i<nums.length; i++)
  {
   if (nums[i] == 2 || nums[i] == 3)
   {
     return true;
   }
  }
  return false;
  
  
}

//no23
public boolean no23(int[] nums) {
  for(int i = 0; i<nums.length; i++)
  {
    if(nums[i] == 2 || nums[i] == 3)
    {
      return false;
    }
    
  }
  return true;
}

//makeLast
public int[] makeLast(int[] nums) {
  int[] arr = new int[2*nums.length];
  arr[arr.length-1] = nums[nums.length-1];
  return arr;
}

//double23
public boolean double23(int[] nums) {
  int counter1 = 0; 
  int counter2 = 0;
  
  for(int i=0; i<nums.length; i++)
  {
    if(nums[i] == 2)
    {
      counter1++;
    }
  
    if(nums[i] == 3)
    {
      counter2++;
    }
  }
  
  return counter1 >= 2 || counter2 == 2; 
  
}

//fix23
public int[] fix23(int[] nums) {
   if(nums[0] == 2 && nums[1] == 3)
   {
     nums[1] = 0;
     return nums;
   }
   if(nums[1] == 2 && nums[2] ==3)
   {
     nums[2] = 0;
     return nums;
   }
   else
   {
     return nums;
   }
}

//start1
public int start1(int[] a, int[] b) {
  int count = 0;
  
  if(a.length > 0 && a[0]==1)
  {
    count++;
  }
  if(b.length>0 && b[0]==1)
  {
    count++;
  }
  
  return count;
}

//biggerTwo
public int[] biggerTwo(int[] a, int[] b) {
  if(a[0] +a[1]<b[0] + b[1])
  {
    return b;
  }
  
  return a;
}

//makeMiddle
public int[] makeMiddle(int[] nums) {
    return new int[] {nums[nums.length/2-1], nums[nums.length/2]};
}

//plusTwo
public int[] plusTwo(int[] a, int[] b) {
  return new int[] {a[0], a[1], b[0], b[1]};
}

//swapEnds
public int[] swapEnds(int[] nums) {
  int copy = nums[0];
  nums[0]=nums[nums.length-1];
  nums[nums.length-1] = copy;
  
  return nums;
}

//midThree
public int[] midThree(int[] nums) {
  int[] arr = new int[3];
  arr[0] = nums[nums.length/2-1];
  arr[1] = nums[nums.length/2];
  arr[2] = nums[nums.length/2+1];
  return arr;
}

//maxTriple
public int maxTriple(int[] nums) {
  int max = nums[0];
  
  if(max<nums[nums.length/2])
  {
    max = nums[nums.length/2];
  }
  
  if(max < nums[nums.length-1])
  {
    max = nums[nums.length-1];
  }
  return max;
}

//frontPiece
public int[] frontPiece(int[] nums) {
   
   int[] arr;
   
   if (nums.length<2)
   {
     arr = new int[nums.length];
   }
   else 
   arr = new int[2];
   
   if(nums.length>0)
   {
     arr[0] = nums[0];
   }
   
   if(nums.length>1)
   {
     arr[1] = nums[1];
   }
   return arr;
}

//unlucky1
public boolean unlucky1(int[] nums) {
   
      if(nums.length >= 2&& nums[0]==1 && nums[1]==3 || nums[nums.length-2] ==1 && nums[nums.length-1]==3)
    {
      return true;
    }
    
    if(nums.length>=3 && nums[1] == 1 && nums[2] ==3)
    {
      return true;
    }
    return false;
}
