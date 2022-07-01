# a = list(range(10))

# for i in range(10):
#   a[i] = i**2

# print(a)


def multiplyMe(values:list):
  total = 1
  for number in values:
    total = total * values
  return total


print(multiplyMe([2,3,4,5]))
