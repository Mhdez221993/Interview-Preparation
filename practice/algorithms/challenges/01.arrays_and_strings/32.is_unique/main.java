// 1. Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
// cannot use additional data structures?

/*
build a hash table save every character init
Set the caracter to equal 0 if does not exist else return false
*/
import java.util.*;

public boolean isUnique(String str) {
  Dictionary unique = new Hashtable();
  for(chart c: str) {
    if(!unique[c]) {
      unique[c] = '0';
    } else {
      return false;
    }
  }
  return true;
}