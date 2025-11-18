class Solution:
    def evalRPN(self, tokens):
        stack = []
        
        for t in tokens:
            if t not in {"+", "-", "*", "/"}:
                stack.append(int(t))
            else:
                b = stack.pop()
                a = stack.pop()

                if t == "+":
                    stack.append(a + b)
                elif t == "-":
                    stack.append(a - b)
                elif t == "*":
                    stack.append(a * b)
                else:  # division
                    # must truncate toward zero (LeetCode requirement)
                    stack.append(int(a / b))
        
        return stack[0]
        