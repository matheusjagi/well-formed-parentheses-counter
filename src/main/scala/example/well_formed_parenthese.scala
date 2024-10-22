package example

import scala.annotation.tailrec

@tailrec
def wellFormedParenthesesCounter(sequence: String, balance: Int = 0): Boolean =
    if sequence.isEmpty then 
        balance == 0
    else
        sequence.head match {
            case '(' => wellFormedParenthesesCounter(sequence.tail, balance + 1) 
            case ')' => wellFormedParenthesesCounter(sequence.tail, balance - 1) 
            case _ => wellFormedParenthesesCounter(sequence.tail, balance) 
        }
    