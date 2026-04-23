n  = int(input("Enter the number of Elements: "))
k = int(input("Enter the Target Elements: "))
numbers = []
for i in range(n):
    numbers.append(int(input("Enter the number: ")))
print(numbers)
print(k)
for i in range(n):
    
    for j in range(i+1, n):
        if numbers[i] + numbers[j] == k:
            print(numbers[i], numbers[j])