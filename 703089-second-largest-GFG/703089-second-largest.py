class Solution:
    def getSecondLargest(self, l):
        # code here
        max1 = float('-inf')
        max2 = float('-inf')
        for i in range (len(l)):
               if(l[i]>max1):
                    max2 = max1
                    max1 = l[i]
               elif(l[i]>max2 and l[i]<max1):
                     max2 = l[i]

        if(max2==float('-inf')): 
            return -1
        return max2

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna