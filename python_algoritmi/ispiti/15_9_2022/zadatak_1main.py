from zadatak_1aux import *
from random import randint

def sum_stacks(stog1: Stack, stog2: Stack) -> Stack:
    final_stog = Stack()

    while True:
        if (not stog1.is_empty()) and not stog2.is_empty():
            final_stog.push(stog1.pop() + stog2.pop())
        elif not stog1.is_empty():
            final_stog.push(stog1.pop())
        elif not stog2.is_empty():
            final_stog.push(stog2.pop())
        else:
            break

    return final_stog


if __name__ == '__main__':

    # making stogs...
    stog1 = Stack()
    stog2 = Stack()

    for i in range(10):
        stog1.push(randint(0, 10))
        stog2.push(randint(0, 20))

    stog2.push(21)
    stog2.push(22)
    print(stog1)
    print(stog2)

    # testing aalgorithm
    print(sum_stacks(stog1, stog2))

