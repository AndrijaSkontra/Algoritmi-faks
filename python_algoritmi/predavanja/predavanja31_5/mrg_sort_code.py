from typing import List
from random import randint
from time import sleep


def merge_sort(arl: List, sort_type: str):
    assert sort_type in ["asc", "desc"]
    if len(arl) == 1:
        return arl
    else:
        left, right = split_in_middle(arl)
        right = merge_sort(right, sort_type)
        left = merge_sort(left, sort_type)
    input("Press enter to continue...")
    return merge(left, right, sort_type)


def split_in_middle(arl):
    middle = len(arl) // 2
    left = arl[:middle]
    right = arl[middle:]
    print(f"Left in split: {left}\nRight in split: {right}")
    sleep(0.5)

    print("-" * 50)
    return left, right


def merge(left: List, right: List, sort_type: str):
    merged = []
    print(f"Left in merging part: {left}\nRight in merging part: {right}")
    sleep(0.5)
    print("-" * 50)
    lip, rip = 0, 0
    while lip < len(left) and rip < len(right):
        if sort_type == "asc":
            if left[lip] < right[rip]:
                merged.append(left[lip])
                lip += 1
            else:
                merged.append(right[rip])
                rip += 1
        else:
            if left[lip] > right[rip]:
                merged.append(left[lip])
                lip += 1
            else:
                merged.append(right[rip])
                rip += 1

    merged.extend(left[lip:])
    merged.extend(right[rip:])
    print(f"merging in this step: {merged}")
    sleep(0.5)
    # input("Enter to continue...")
    return merged


if __name__ == '__main__':
    ar = [randint(1, 20) for _ in range(9)]
    print(merge_sort(ar, "desc"))
