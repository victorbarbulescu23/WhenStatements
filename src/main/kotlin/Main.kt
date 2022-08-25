fun main() {
   var day = 1
   var dayString: String  = "x"

   when(day){
      1 -> dayString = "Sunday"
      2 -> dayString = "Monday"
      3 -> dayString = "Tuesday"
      4 -> dayString = "Wednesday"
      5 -> dayString = "Thursday"
      6 -> dayString = "Friday"
      7 -> dayString = "Saturday"
      !in 1..7 -> dayString = "Out of Bounds"
      else -> dayString = "Unknown Problem"
   }

   println("The day is: $dayString")
}