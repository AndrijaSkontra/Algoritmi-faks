from typing import List


def sort_odd_even(eggs: List):
    start = 0
    for i in range(len(eggs)):
        if eggs[i] % 2 == 1:
            swap_2_in_list(eggs, start, i)
            start += 1


def swap_2_in_list(eggs, first, second):
    if first != second and first < len(eggs) and second < len(eggs):
        eggs[first], eggs[second] = eggs[second], eggs[first]
    else:
        pass


if __name__ == '__main__':
    spam = [23,2,4,40,15,7,200,10,5,8,9]
    sort_odd_even(spam)
    print(spam)