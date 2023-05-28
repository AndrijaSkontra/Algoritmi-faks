import random
from typing import List

def merge_sort(arr: List):
    if len(arr) <= 1:
        return arr
    middle = len(arr) // 2
    left = arr[:middle]
    right = arr[middle:]
    print(f"Middle point - {middle}")
    print(f"Left: {left}")
    print(f"Right: {right}")
    print("-" * 70)
    merge_sort(left)
    merge_sort(right)


def merge(ar_left: List, ar_right: List) -> List:
    print(f"Left in: {ar_left}")
    print(f"Right in: {ar_right}")
    p, q = 0, 0
    while p < len(ar_left) and q < len(ar_right):
        if ar_left[p] > ar_right[q]:
            ar_left[p], ar_right[q] = ar_right[q], ar_left[p]
            p += 1
        pass # todo here


if __name__ == '__main__':
    ar = [random.randint(-100, 100) for i in range(20)]
    merge_sort(ar)