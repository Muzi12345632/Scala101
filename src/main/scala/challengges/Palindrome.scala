package challengges

object Palindrome {
  def  isPalindrome(word:String): Boolean ={
    val lower = word.toLowerCase
    lower.reverse == lower
  }

}
