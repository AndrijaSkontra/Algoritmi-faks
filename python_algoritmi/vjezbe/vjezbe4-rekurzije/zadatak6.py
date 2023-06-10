from typing import List


def reverse_list(eggs: List, start, end):
    if start >= end:
        return eggs
    else:
        eggs[start], eggs[end] = eggs[end], eggs[start]
        start += 1
        end -= 1
        return reverse_list(eggs, start, end)


if __name__ == '__main__':
    spam = [9, 86, 54, 97, 51, 3, 21, 32]
    print(reverse_list(spam, 0, len(spam) - 1))




