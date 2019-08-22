# wordstackmachine
Given an empty stack and a string containing space-separated elements, the element can be any of the following: a non-negative integer number, "DUP", "POP", "+", "-". When the program executes, every element is popped out of the string and a corresponding action is perfomed:
<ul>
  <li>If the element is an integer: the number is pushed in the stack</li>
  <li>If the element is the word DUP: the top number in the stack is duplicated and pushed in the stack</li>
  <li>If the element is the word POP: the top number in the stack is removed</li>
  <li>If the element is +: the 2 top numbers in the stack are popped out, added together then the result is pushed in the stack</li>
  <li>If the element is -: the 2 top numbers in the stack are popped out, the 2nd number is substracted from the 1st number, then the result is pushed in the stack</li>
</ul>

The value returned from the program is the top number in the stack (after all elements in the string are executed).
In the following cases, the program must return -1 as an indication of error:
<ul>
  <li>If there is not enough element in the stack to perform the corresponding action (e.g. no more element to POP or DUP, only 1 element to perform + or -)</li>
  <li>The + or - operation returns a negative value</li>
</ul>

Example:
Given the string "13 DUP 4 POP 5 DUP + DUP + -". An empty stack []
<ul>
  <li>13: pushing number 13 in stack, ------------------------- <b>[13]</b></li>
  <li>DUP: duplicating the top number in stack, --------------- <b>[13 13]</b></li>
  <li>4: pushing number 4 in stack, --------------------------- <b>[13 13 4]</b></li>
  <li>POP: removing the top number in stack, ------------------ <b>[13 13]</b></li>
  <li>5: pushing number 5 in stack, --------------------------- <b>[13 13 5]</b></li>
  <li>DUP: duplicating the top number in stack, --------------- <b>[13 13 5 5]</b></li>
  <li>+: removing 2 top numbers and adding them together, ----- <b>[13 13 10]</b></li>
  <li>DUP: duplicating the top number in stack, --------------- <b>[13 13 10 10]</b></li>
  <li>+: removing 2 top numbers and adding them together, ----- <b>[13 13 20]</b></li>
  <li>-: removing 2 top numbers and subtracting them together,  <b>[13 7]</b></li>
</ul>

The returned value is the top number in stack: 7.
