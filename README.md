# TowersofHanoi
Using recursion to solve this problem.
Divide the n items on the original stack to n-1 and 1.
Then the 1 at the bottom can be moved to the destination stack and then deal with n-1 recursively.
So the n-1 will move to the auxiliary stack recursively
And once that is achieved, they will then move to the destination stack.
