from zadatak4 import *

def binary_search(lst, value):
    lst = sorted(lst)
    middle_index = len(lst)  // 2
    if lst[middle_index] == value:
        return True
    elif lst[middle_index] > value:
        lst = lst[middle_index:]
        if len(lst) > 1:
            return binary_search(lst, value)
        else:
            return False


if __name__ == '__main__':
    our_list = generate_array_random_nums(10, 12, 14)
    print(our_list)
    print(binary_search(our_list, 13))