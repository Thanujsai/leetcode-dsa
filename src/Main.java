
import datastructures.LinkedList;
import datastructures.Stack;
import datastructures.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import datastructures.BinarySearchTree;
import datastructures.DoublyLinkedList;
import datastructures.DoublyLinkedList.Node;
import datastructures.HashTable;

public class Main {

  public static boolean itemInCommon(int[] array1, int[] array2) {
    HashMap<Integer, Boolean> hm = new HashMap<>();
    for (int item : array1) {
      hm.put(item, true);// value doesn't matter, add the key i.e. the items of array1
    }
    for (int item : array2) {
      if (hm.get(item) != null) {// if item from array2 is found in hashmap, then there is a common item, since
                                 // all keys in hashmap are from array1 and values are true
        return true;
      }
    }
    return false;
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> anagramMap = new HashMap<>();
    for (String str : strs) {
      char[] charArray = str.toCharArray();
      java.util.Arrays.sort(charArray);
      String sortedStr = new String(charArray);

      if (!anagramMap.containsKey(sortedStr)) {
        anagramMap.put(sortedStr, new ArrayList<>());
      }
      anagramMap.get(sortedStr).add(str);
    }
    return new ArrayList<>(anagramMap.values());
  }

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hm = new HashMap<>();

    int[] result = new int[] {};
    for (int i = 0; i < nums.length; i++) {
      if (hm.containsKey(target - nums[i])) {
        result = new int[] { hm.get(target - nums[i]), i };
      } else {
        hm.put(nums[i], i);
      }
    }

    return result;
  }

  public static int[] subarraySum(int[] nums, int target) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    hm.put(0, -1); // Handle case where subarray starts at index 0

    int cumulativeSum = 0;
    for (int i = 0; i < nums.length; i++) {
      cumulativeSum = cumulativeSum + nums[i];
      if (hm.containsKey(cumulativeSum - target)) {
        return new int[] { hm.get(cumulativeSum - target) + 1, i };
      }
      hm.put(cumulativeSum, i);
    }

    return new int[] {};
  }

  private static String formatResult(int[] result) {
    return result.length == 0 ? "[]" : Arrays.toString(result);
  }

  public static List<Integer> findDuplicates(int[] a) {
    List<Integer> duplicates = new ArrayList<>();
    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int item : a) {
      if (hm.get(item) != null) {
        hm.put(item, hm.get(item) + 1);
      } else {
        hm.put(item, 1);
      }
    }

    for (int item : hm.keySet()) {
      if (hm.get(item) > 1) {
        duplicates.add(item);
      }
    }

    return duplicates;
  }

  public static char firstNonRepeatingCharacter(String str) {
    HashMap<Character, Integer> charCountMap = new HashMap<>();

    for (char c : str.toCharArray()) {
      charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
    }

    for (char c : str.toCharArray()) {
      if (charCountMap.get(c) == 1) {
        return c;
      }
    }

    return 0;
  }

  public static List<Integer> removeDuplicates(List<Integer> myList) {
    Set<Integer> uniqueSet = new HashSet<>(myList);
    return new ArrayList<>(uniqueSet);
  }

  private static String formatResult(List<Integer> list) {
    List<Integer> sorted = new ArrayList<>(list);
    Collections.sort(sorted); // for consistent print order
    return sorted.toString();
  }

  public static void main(String[] args) {
    HashTable ht = new HashTable();

    ht.set("paint", 20);
    ht.set("bolts", 40);
    ht.set("nails", 100);
    ht.set("tile", 50);
    ht.set("lumber", 80);

    System.out.println("get paint: " + ht.get("paint"));
    System.out.println("get tile: " + ht.get("tile"));

    ht.printTable();

    System.out.println("keys");
    System.out.println(ht.keys());

    int[] array1 = { 1, 3, 5 };
    int[] array2 = { 2, 4, 6 };

    System.out.println("item in common : ");
    System.out.println(itemInCommon(array1, array2));

    // Test 3: Multiple duplicates
    System.out.println("Test 3: Multiple Duplicates");
    int[] nums3 = { 1, 2, 2, 3, 3, 4 };
    System.out.println("Expected: [2, 3] (order may vary)");
    System.out.println("Actual: " + findDuplicates(nums3));
    System.out.println();

    // Test 4: All elements are duplicates
    System.out.println("Test 4: All Elements Duplicates");
    int[] nums4 = { 5, 5, 5, 5 };
    System.out.println("Expected: [5]");
    System.out.println("Actual: " + findDuplicates(nums4));
    System.out.println();

    String testStr = "aabbcddeff";
    char result = firstNonRepeatingCharacter(testStr);
    System.out.println("result : " + result);
    if (result != 0) {
      System.out.println("First non-repeating character in \"" + testStr + "\": " + result);
    } else {
      System.out.println("All characters are repeating in \"" + testStr + "\"");
    }

    String testStr2 = "aabbcc";
    char result2 = firstNonRepeatingCharacter(testStr2);
    if (result2 != 0) {
      System.out.println("First non-repeating character in \"" + testStr2 + "\": " + result2);
    } else {
      System.out.println("All characters are repeating in \"" + testStr2 + "\"");
    }

    // Test 3: Multiple groups
    System.out.println("Test 3: Multiple Groups");
    String[] input3 = { "eat", "tea", "tan", "ate", "nat", "bat" };
    System.out.println("Expected: [[eat, tea, ate], [tan, nat], [bat]]");
    System.out.println("Actual: " + groupAnagrams(input3));
    System.out.println();

    // Test 4: Duplicate words
    System.out.println("Test 4: Duplicate Words");
    String[] input4 = { "bat", "tab", "bat" };
    System.out.println("Expected: [[bat, bat, tab]]");
    System.out.println("Actual: " + groupAnagrams(input4));
    System.out.println();

    // Test 1: Basic pair
    System.out.println("Test 1: Basic Pair");
    int[] nums1 = { 2, 7, 11, 15 };
    int target1 = 9;
    System.out.println("Expected: Indices of 2 and 7 (any valid order)");
    System.out.println("Actual: " + formatResult(twoSum(nums1, target1)));
    System.out.println();

    // Test 2: Multiple pairs exist
    System.out.println("Test 2: Multiple Pairs");
    int[] nums2 = { 1, 3, 2, 4, 6 };
    int target2 = 5;
    System.out.println("Expected: Any valid pair summing to 5");
    System.out.println("Actual: " + formatResult(twoSum(nums2, target2)));
    System.out.println();

    // Test 2: Multiple possible subarrays
    System.out.println("Test 2: Multiple Possible Subarrays");
    int[] numss2 = { 1, 2, 2, 3, 1 };
    int targett2 = 5;
    System.out.println("Expected: Any valid subarray summing to 5");
    System.out.println("Actual: " + formatResult(subarraySum(numss2, targett2)));
    System.out.println();

    // Test 3: Includes negative numbers
    System.out.println("Test 3: Handles Negative Numbers");
    int[] numss3 = { 3, 4, -7, 5, 1 };
    int target3 = 5;
    System.out.println("Expected: Any valid subarray summing to 5");
    System.out.println("Actual: " + formatResult(subarraySum(numss3, target3)));
    System.out.println();

    // Test 4: Entire array is the subarray
    System.out.println("Test 4: Entire Array Matches");
    int[] numss4 = { 2, 2, 2, 2 };
    int target4 = 8;
    System.out.println("Expected: Indices for full array [0,3]");
    System.out.println("Actual: " + formatResult(subarraySum(numss4, target4)));
    System.out.println();

    // Test 5: No subarray found
    System.out.println("Test 5: No Subarray Found");
    int[] nums5 = { 1, 1, 1 };
    int target5 = 10;
    System.out.println("Expected: []");
    System.out.println("Actual: " + formatResult(subarraySum(nums5, target5)));
    System.out.println();

    // Test 1: Duplicates removed
    System.out.println("Test 1: Duplicates Removed");
    List<Integer> list1 = Arrays.asList(1, 2, 2, 3, 3, 4);
    System.out.println("Expected: [1, 2, 3, 4]");
    System.out.println("Actual: " + formatResult(removeDuplicates(list1)));
    System.out.println();

    // Test 2: No duplicates
    System.out.println("Test 2: No Duplicates");
    List<Integer> list2 = Arrays.asList(5, 6, 7);
    System.out.println("Expected: [5, 6, 7]");
    System.out.println("Actual: " + formatResult(removeDuplicates(list2)));
    System.out.println();

    // Test 3: All duplicates
    System.out.println("Test 3: All Duplicates");
    List<Integer> list3 = Arrays.asList(8, 8, 8, 8);
    System.out.println("Expected: [8]");
    System.out.println("Actual: " + formatResult(removeDuplicates(list3)));
    System.out.println();

  }

}