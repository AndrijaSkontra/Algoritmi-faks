from typing import List, Tuple, Callable
from random import randint
from copy import deepcopy
from timeit import default_timer as stoperica


def execution_time(func: Callable):
    def wrapper(*args, **kwargs):
        start = stoperica()
        result = func(*args, **kwargs)
        end = stoperica()
        els_time = end - start
        # print(f"{func.__name__}- Elapsed time: {els_time} sec")
        return els_time

    return wrapper


# def bubble_sort(lst: List):
#     for j in range(len(lst)):
#         for i in range(len(lst) - (j + 1)):
#             if lst[i] > lst[i + 1]:
#                 lst[i], lst[i + 1] = lst[i + 1], lst[i]
#
#     print(f"Sorted with my function: {lst}")

@execution_time
def bubble_sort_class(lst: List, sort_type: str = "asc"):
    assert sort_type in ["asc", "desc"]
    while True:
        action = 0
        for i in range(len(lst) - 1):
            if lst[i] > lst[i + 1]:
                lst[i], lst[i + 1] = lst[i + 1], lst[i]
                action += 1
        if action == 0:
            print(f"Sorted list: {lst}")
            break


@execution_time
def selection_sort(lst: List, sort_type: str = "asc"):
    assert sort_type in ["asc", "desc"]
    if sort_type == "asc":
        for i in range(len(lst) - 1):
            for j in range(i + 1, len(lst)):
                if lst[i] > lst[j]:
                    lst[i], lst[j] = lst[j], lst[i]
    else:
        for i in range(len(lst) - 1):
            for j in range(i + 1, len(lst)):
                if lst[i] < lst[j]:
                    lst[i], lst[j] = lst[j], lst[i]
    print(f"Sorted with selection: {lst}")


def execution_time_lab(arr: List, algs: List):
    num_times = len(algs)
    tms = []
    for k in range(num_times):
        tms.append([])
    for lst in arr:
        for k in range(len(tms)):
            tms[k].append(algs[k](lst))

    return tms


@execution_time
def binary_search(ar: List[int], item: int) -> bool:
    sarr = sorted(ar)
    in_arr = False
    mp = len(ar) // 2
    left = 0
    right = len(ar) - 1
    while left <= right:
        if item == sarr[mp]:
            in_arr = True
            print(f"item in array at {mp}")
            return in_arr
        elif item > sarr[mp]:
            left = mp + 1
        elif item < sarr[mp]:
            right = mp - 1
        mp = (left + right) // 2
    print(f"{item} not in array...")
    return in_arr


if __name__ == '__main__':
    algs = [bubble_sort_class, selection_sort]
    all_arr = [[randint(0, 1000) for i in range(1000)] for j in range(100)]
    tms = execution_time_lab(all_arr, algs)
    print("--------------------------------")
    for time in tms:
        print(time)
    for el in tms:
        avg = sum(el) / len(el)
        print(f"Avg time of {el.__ne__} is {avg}")

    #
    # lista2 = deepcopy(lista1)
    # lista3 = deepcopy(lista1)
    #
    # _, tm1 = bubble_sort_class(lista1)
    # _, tm2 = selection_sort(lista2)
    #
    #
    # print(avg1)
    #
    # print(f"Time bubble: {tm1}\nTime selection: {tm2}")
    # start1 = timer()
    # bubble_sort_class(lista1)
    # end1 = timer()
    #
    # print(f"Time for professor function: {end1 - start1}")
    #
    # start2 = timer()
    # bubble_sort(lista2)
    # end2 = timer()
    #
    # print(f"Time fot professor function: {end2 - start2}")
    #
    # print("\n\n\n")
    # print(lista3)
    # selection_sort(lista3, sort_type="desc")
