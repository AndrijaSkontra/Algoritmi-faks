from typing import *
from timeit import default_timer as timer
from predavanja.predavanje27_3.zadatak_1 import *

def sorts_simple_cycling(lst: List, order: str = "desc") -> List:
    """
    Function that sorts list using simple cycling
    :param lst: unsorted list
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


def iterate_dict(dict: Dict) -> Dict:
    for key, value in dict.items():
        print(f"Key = {key} <-> Value = {value}")

def sorts_time(lst: List, alg: Callable) -> float:
    startTimer = timer()
    alg(lst)
    endTimer = timer()

    return endTimer - startTimer


if __name__ == '__main__':
    lst = generate_random_list(5000)
    print(lst)
    sorts_simple_cycling(lst, "desc")
    sorts_simple_cycling(lst, "asc")

    dicty = {"a": 100, "b": 200, "c": [1, 2, 3]}
    iterate_dict(dicty)

    npr = dicty["b"] # dohvacanje value od b
    print(npr)
    print(sorts_time(lst, sorts_simple_cycling))
    print(elapsed_time(sort_swap, lst))





