A = int(input())
B = int(input())

odd = A if A % 2 != 0 else A + 1
even = B if B % 2 == 0 else B - 1

while odd <= B and even >= A:
    print(odd, even, end=" ")
    odd += 2
    even -= 2

while odd <= B:
    print(odd, end=" ")
    odd += 2

while even >= A:
    print(even, end=" ")
    even -= 2
