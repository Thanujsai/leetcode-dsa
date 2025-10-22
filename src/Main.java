
import datastructures.LinkedList;
import datastructures.Stack;
import datastructures.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
      }
      else{
        hm.put(nums[i], i);
      }
    }

    return result;
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

  }

}