import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    double startTime = 0;
    double endTime = 0;
    boolean runSorting = true;
    while(runSorting)
    {
      String explanation = "";
      String complexity = "";
      int[] array20 = new int[20];
      fill(array20);
      double time20 = 0;
      int[] array100 = new int[100];
      fill(array100);
      double time100 = 0;
      int[] array500 = new int[500];
      fill(array500);
      double time500 = 0;
      int[] array1000 = new int[1000];
      fill(array1000);
      double time1000 = 0;
      System.out.println("Chose sorting method: 1-5");
      System.out.println("1. Selection Sort");
      System.out.println("2. Insertion Sort");
      System.out.println("3. Bubble Sort");
      System.out.println("4. Quick Sort");
      System.out.println("5. Radix Sort");
      int methodNum = scan.nextInt();
      if(methodNum == 1)
      {
        startTime = System.nanoTime();
        array20 = selectionSort(array20);
        endTime = System.nanoTime();
        time20 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array100 = selectionSort(array100);
        endTime = System.nanoTime();
        time100 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array500 = selectionSort(array500);
        endTime = System.nanoTime();
        time500 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array1000 = selectionSort(array1000);
        endTime = System.nanoTime();
        time1000 = (endTime - startTime) / 1000000;
        explanation = "Selection sorting works by finding the lowest unsorted value and putting it in the correct space repeatedly until the entire list is sorted.";
        complexity = "O(n^2)";
      }
      if(methodNum == 2)
      {
        startTime = System.nanoTime();
        array20 = insertionSort(array20);
        endTime = System.nanoTime();
        time20 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array100 = insertionSort(array100);
        endTime = System.nanoTime();
        time100 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array500 = insertionSort(array500);
        endTime = System.nanoTime();
        time500 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array1000 = insertionSort(array1000);
        endTime = System.nanoTime();
        time1000 = (endTime - startTime) / 1000000;
        explanation = "Insertion sorting works by creating a subset within the array and continuously adding each number into its correct spot in the subset.";
        complexity = "O(n^2)";
      }
      if(methodNum == 3)
      {
        startTime = System.nanoTime();
        array20 = bubbleSort(array20);
        endTime = System.nanoTime();
        time20 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array100 = bubbleSort(array100);
        endTime = System.nanoTime();
        time100 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array500 = bubbleSort(array500);
        endTime = System.nanoTime();
        time500 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array1000 = bubbleSort(array1000);
        endTime = System.nanoTime();
        time1000 = (endTime - startTime) / 1000000;
        explanation = "Bubble sorting works by continuously checking and fixing each pair in the array until reaching the end, then the same process happens repeatly while checking one less pair than the previous run until it's sorted.";
        complexity = "O(n^2)";
      }
      if(methodNum == 4)
      {
        startTime = System.nanoTime();
        array20 = quickSort(array20, 0, array20.length - 1);
        endTime = System.nanoTime();
        time20 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array100 = quickSort(array100, 0, array100.length - 1);
        endTime = System.nanoTime();
        time100 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array500 = quickSort(array500, 0, array500.length - 1);
        endTime = System.nanoTime();
        time500 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array1000 = quickSort(array1000, 0, array1000.length - 1);
        endTime = System.nanoTime();
        time1000 = (endTime - startTime) / 1000000;
        explanation = "Quick sorting continuously splits the array into two smaller arrays while partitioning them around a value, which then sort each partition.";
        complexity = "O(n log(n))";
      }
      if(methodNum == 5)
      {
        startTime = System.nanoTime();
        array20 = radixSort(array20);
        endTime = System.nanoTime();
        time20 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array100 = radixSort(array100);
        endTime = System.nanoTime();
        time100 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array500 = radixSort(array500);
        endTime = System.nanoTime();
        time500 = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        array1000 = radixSort(array1000);
        endTime = System.nanoTime();
        time1000 = (endTime - startTime) / 1000000;
        explanation = "Radix sorting consists of sorting each digit starting with the ones place of every number, doing this sort in all layers with that order will sort the numbers after going through all digits.";
        complexity = "O(nk)";
      }
      System.out.print("Array with 20 numbers: ");
      printArray(array20);
      System.out.println("This took " + time20 + " ms to sort.\n");
      System.out.print("Array with 100 numbers: ");
      printArray(array100);
      System.out.println("This took " + time100 + " ms to sort.\n");
      System.out.print("Array with 500 numbers: ");
      printArray(array500);
      System.out.println("This took " + time500 + " ms to sort.\n");
      System.out.print("Array with 1000 numbers: ");
      printArray(array1000);
      System.out.println("This took " + time1000 + " ms to sort.\n");
      System.out.println(explanation);
      System.out.println("The time complexity is: " + complexity);
      System.out.println("\nWould you like to run another sorting method?");
      boolean invalid = true;
      String rerun = "";
      while(invalid)
      {
        invalid = false;
        rerun = scan.next();
        if(rerun.toLowerCase().equals("no"))
        {
          runSorting = false;
        }
        else if(!rerun.toLowerCase().equals("yes"))
        {
          System.out.println("Invalid answer, please enter yes or no");
          invalid = true;
        }
      }
    }
  }

  public static int[] selectionSort(int[] originArray)
  {
    for(int i = 0; i < originArray.length; i++)
    {
      int minIndex = i;
      for(int j = i + 1; j < originArray.length; j++)
      {
        if(originArray[j] < originArray[minIndex])
        {
          minIndex = j;
        }
      }
      int temp = originArray[i];
      originArray[i] = originArray[minIndex];
      originArray[minIndex] = temp;
    }
    return originArray;
  }

  public static int[] insertionSort(int[] originArray)
  {
    for(int i = 1; i < originArray.length; i++)
    {
      int newNum = originArray[i];
      int comparingIndex = i;
      while(comparingIndex > 0 && originArray[comparingIndex - 1] > newNum)
      {
        originArray[comparingIndex] = originArray[comparingIndex - 1];
        comparingIndex--;
      }
      originArray[comparingIndex] = newNum;
    }
    return originArray;
  }

  public static int[] bubbleSort(int[] originArray)
  {
    int ending = originArray.length;
    while(ending > 0)
    {
      for(int i = 0; i < ending - 1; i++)
      {
        if(originArray[i] > originArray[i + 1])
        {
          int temp = originArray[i];
          originArray[i] = originArray[i + 1];
          originArray[i + 1] = temp;
        }
      }
      ending--;
    }
    return originArray;
  }

  public static int[] quickSort(int[] originArray, int start, int end)
  {
    if(start < end)
    {
      int center = (start + end) / 2;
      int arrNum = originArray[center];
      swap(originArray, center, start);
      int left = start;
      int right = end;
      while(left < right)
      {
        while(left < right && originArray[left] <= arrNum)
        {
          left++;
        }
        while(originArray[right] > arrNum)
        {
          right--;
        }
        if(left < right)
        {
          swap(originArray, left, right);
        }
      }
      swap(originArray, start, right);
      int partitionIndex = right;
      quickSort(originArray, start, partitionIndex - 1);
      quickSort(originArray, partitionIndex + 1, end);
    }
    return originArray;
  }

  public static int[] radixSort(int[] originArray)
  {
    int highestDigit = 0;
    for(int i = 1; i < originArray.length; i++)
    {
      while(Math.pow(10, highestDigit) <= originArray[i])
      {
        highestDigit++;
      }
    }
    for(int o = 0; o < highestDigit; o++)
    {
      int[][] sortingList = new int[10][originArray.length];
      for(int i = 0; i < sortingList.length; i++)
      {
        for(int j = 0; j < sortingList[i].length; j++)
        {
          sortingList[i][j] = -1;
        }
      }
      for(int i = 0; i < originArray.length; i++)
      {
        int digit = (int)(originArray[i] / Math.pow(10, o)) % 10;
        if(Math.pow(10, o) > originArray[i])
        {
          digit = 0;
        }
        sortingList[digit][i] = i;
      }
      int[] tempArray = new int[originArray.length];
      int counter = 0;
      for(int i = 0; i < sortingList.length; i++)
      {
        for(int j = 0; j < sortingList[i].length; j++)
        {
          if(sortingList[i][j] != -1)
          {
            tempArray[counter] = originArray[sortingList[i][j]];
            counter++;
          }
        }
      }
      originArray = tempArray;
    }
    return originArray;
  }

  public static void swap(int[] arr, int index1, int index2)
  {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }

  public static void fill(int[] arr)
  {
    for(int i = 0; i < arr.length; i++)
    {
      arr[i] = (int)(Math.random() * 999);
    }
  }

  public static void printArray(int[] arr)
  {
    for(int i = 0; i < arr.length; i++)
    {
      System.out.print(arr[i]);
      if(i < arr.length - 1)
      {
        System.out.print(", ");
      }
      else
      {
        System.out.println("");
      }
    }
  }
}