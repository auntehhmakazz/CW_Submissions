public int[] rotateLeft3(int[] nums) 
{

int[] tempArr = new int[nums.length];
tempArr[0] = nums[1];
tempArr[1] = nums[2];
tempArr[2] = nums[0];

return tempArr;

  
}

public int[] reverse3(int[] nums) 
{
  
  int[] copyArr = new int[nums.length];
  
  copyArr[0] = nums[2];
  copyArr[1] = nums[1];
  copyArr[2] = nums[0];
  
  return copyArr;
  
}

public int[] maxEnd3(int[] nums) 
{
  int[] copyArr = new int[nums.length];
  
  if(nums[0]<nums[2])
  {
    copyArr[1]=nums[2];
    copyArr[0]=nums[2];
    copyArr[2]=nums[2];
  }
  
  else
  {
    copyArr[0]=nums[0];
    copyArr[1]=nums[0];
    copyArr[2]=nums[0];
  }
  
  return copyArr;
  
}

public int sum2(int[] nums) 
{
  
  if(nums.length ==0)
  {
    return 0;
  }
  
  else if (nums.length ==1)
  {
    return nums[0];
  }
  
  else 
  {
    return nums[0]+nums[1];
  }
}


public int[] middleWay(int[] a, int[] b)
{
  
  int[] newArr = {a[1], b[1]};
  return newArr;
  
}

public int[] makeEnds(int[] nums) 
{
  int[] newArr = {nums[0], nums[nums.length-1]};
  return newArr;
}
