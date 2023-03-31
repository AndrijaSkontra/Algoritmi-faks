from typing import *
from vjezbe.vjezbe1.zadatak_1_and_2 import *


def sorts_simple_cycling(lst: List, order: str = "desc") -> List:
    """
    Function that sorts list using simple cycling
    :param lst: unsorted list
    :param order: sortaj "desc" ili "asc"
    :return: sorted list
    """

    assert order in ["desc", "asc"]

    for i in range(len(lst)):
        for j in range(i + 1, len(lst)):
            temp = lst[i]
            if order == "desc":
                if lst[i] < lst[j]:
                    lst[i] = lst[j]
                    lst[j] = temp
            else:
                if lst[i] > lst[j]:
                    lst[i] = lst[j]
                    lst[j] = temp

    print("Sorted!")
    print(lst)
    return lst


def iterate_dict(dicti: Dict):
    for key, value in dicti.items():
        print(f"Key = {key} <-> Value = {value}")


def sorts_time(lst: List, alg: Callable) -> float:
    start_timer = timer()
    alg(lst)
    end_timer = timer()

    return end_timer - start_timer


if __name__ == '__main__':
    lista = generate_random_list(500)
    # print(lista)
    # sorts_simple_cycling(lista, "desc")
    # sorts_simple_cycling(lista, "asc")

    # dicty = {"a": 100, "b": 200, "c": [1, 2, 3]}
    # iterate_dict(dicty)

    # npr = dicty["b"] # dohvacanje value od b
    # print(npr)
    print("SORT BY PUSHING VALUES:\n")
    print(sorts_time(lista, sorts_simple_cycling))
    print("\nSORT BY SWAPING:\n")
    print(elapsed_time(sort_swap, lista))
