n = int(input("Enter the number of Elements: "))
numbers = []
for i in range(n):
    numbers.append(int(input("Enter the number: ")))
print(max(numbers))
print(min(numbers))