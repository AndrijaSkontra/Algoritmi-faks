import random

alphabet = "qwertzuiopasdghj123345&/()?!"
alphList = [letter for letter in alphabet]


def random_str_func(lenght=10, our_min=3, our_max=15):
    gen_list = []
    for i in range(lenght):
        gen_str = ""
        for j in range(random.randint(our_min, our_max)):
            gen_str += random.choice(alphList)
        gen_list.append(gen_str)
    return gen_list


def sort1(some_list, descending=False):
    sorted_list = sorted(some_list, key=len)
    if descending:
        sorted_list.reverse()
    return sorted_list


def sort2(some_list, descending=False):
    n = len(some_list)
    for i in range(n):
        for j in range(n - i - 1):  # -1 so we dont get out of bounds
            if len(some_list[j]) > len(some_list[j + 1]):
                some_list[j], some_list[j + 1] = some_list[j + 1], some_list[j]
    if descending:
        some_list.reverse()
    return some_list


if __name__ == '__main__':
    my_list = random_str_func()
    print("Test-default: ", sort1(my_list) == sort2(my_list))
    print("Test-desc one: ", sort1(my_list) == sort2(my_list, True))
    print("Test-desc all: ", sort1(my_list, True) == sort2(my_list, True))
