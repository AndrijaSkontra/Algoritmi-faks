from typing import List


def quick_sort(ar: List):
    if len(ar) < 1:
        return ar

    pivot = ar[len(ar) // 2]

    less, equal, greater = [], [], []

    for num in ar:
        if num < pivot:
            less.append(num)
        elif num == pivot:
            equal.append(num)
        else:
            greater.append(num)

    return quick_sort(less) + equal + quick_sort(greater)


if __name__ == '__main__':
    lst = [3, 5, 1, 2, 9, 7, 6]
    lst1 = quick_sort(lst)
    print(lst1)

