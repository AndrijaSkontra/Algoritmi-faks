import random
import typing
from timeit import default_timer as timer

"""def find_max(lst: typing.List) -> int:
    k = 0
    max = lst[k]

    while k < len(lst):
        if lst[k] > max:
            max = lst[k]
        k += 1

    return max """


def find_max_idx(lst: typing.List) -> typing.Tuple:
    k = 0
    max_index = lst[k]
    idx = 0

    while k < len(lst):
        if lst[k] > max_index:
            max_index = lst[k]
            idx = k
        k += 1

    return max_index, idx


def find_min_idx(lst: typing.List) -> typing.Tuple:
    k = 0
    min_index = lst[k]
    idx = 0

    while k < len(lst):
        if lst[k] < min_index:
            max_index = lst[k]
            idx = k
        k += 1

    return min_index, idx


def swap_two(left: int, right: int, lst: typing.List):
    """
    funcion that swaps 2 elements in the list
    :param left: index postion of the left element
    :param right: index position of the right element
    :param lst: ulazna lista
    :return return: list with swapped elements
    """

    temp = lst[left]
    lst[left] = lst[right]
    lst[right] = temp

    return lst


def sort_swap(lst: typing.List) -> typing.List:
    """
    Funcion that swaps in descending order using a simple swapping procedure
    by getting max value and its position
    :param lst: unsorted list
    :return: sorted list
    """

    k = 0
    while k < len(lst) - 1:
        maxi, index = find_max_idx(lst[k:])
        lst = swap_two(k, index + k, lst)
        k += 1
    print(f"Sorted list:\n{lst}")
    return lst


def sort_swap_uzlazno(lst: typing.List) -> typing.List:
    k = 0
    while k < len(lst) - 1:
        maxi, index = find_min_idx(lst[k:])
        lst = swap_two(k, index + k, lst)
        k += 1
    print(f"Sorted list:\n{lst}")
    return lst


def generate_random_list(num_elems: int, mini: int = 10, maxi: int = 100) -> typing.List:
    lst = []
    for k in range(num_elems):
        rndint = random.randint(mini, maxi)
        lst.append(rndint)

    return lst


def elapsed_time(alg: typing.Callable, lst: typing.List) -> float:  # pozivamo funkciju kao parametar
    start = timer()
    alg(lst)
    end = timer()
    return end - start


def sorts(lst: typing.List, how: str = "asc"):
    assert how in ["desc", "asc"]  # nareduje da mora biti asc ili desc
    if how == "desc":
        sort_swap(lst)
    else:
        sort_swap_uzlazno(lst)


if __name__ == '__main__':
    primjer_lst = generate_random_list(5)
    # print(primjer_lst)
    # mx, index = find_max_idx(primjer_lst)
    # print(f"max is {mx}\nhis index is: {index}")
    # primjer_lst = swap_two(0, index, primjer_lst)
    print(primjer_lst)
    print(elapsed_time(sort_swap, primjer_lst))
    sort_swap_uzlazno(primjer_lst)
    lst2 = generate_random_list(5)
    print(f"-----------\n{lst2}")
    print(sorts(lst2, "desc"))
