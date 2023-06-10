from typing import List


def mergesort(lst: List):
    if (len(lst) == 1):
        return lst

    lstOne = lst[len(lst) // 2:]
    lstTwo = lst[:len(lst) // 2]

    print(lstOne, "<- list ->", lstTwo)

    lstOne = mergesort(lstOne)
    lstTwo = mergesort(lstTwo)

    return merge(lstOne, lstTwo)


def merge(lst_a: List, lst_b: List):
    lst_c: List = []

    while (len(lst_a) > 0 and len(lst_b) > 0):
        if (lst_a[0] > lst_b[0]):
            lst_c.append(lst_b[0])
            lst_b.pop(0)
        else:
            lst_c.append(lst_a[0])
            lst_a.pop(0)

    while len(lst_a) > 0:
        lst_c.append(lst_a[0])
        lst_a.pop(0)

    while len(lst_b) > 0:
        lst_c.append(lst_b[0])
        lst_b.pop(0)

    return lst_c


if __name__ == '__main__':
    lst = [3, 6, 8, 123, 23, 432, 32, 12]
    lst = mergesort(lst)
    print(lst)
