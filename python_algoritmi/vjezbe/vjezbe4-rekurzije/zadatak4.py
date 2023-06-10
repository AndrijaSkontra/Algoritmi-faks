import random


def generate_array_random_nums(list_size, miny, maxy):
    our_list = [random.randint(miny, maxy + 1) for _ in range(list_size)]
    return our_list


def sum_of_first_n(lst, n):
    our_sum = 0
    if n < len(lst):
        for i in range(n):
            our_sum += lst[i]
    else:
        our_sum = "Input is not correct!"
    return our_sum


if __name__ == '__main__':
    print("making a list...")
    my_list = generate_array_random_nums(8, 3, 10)
    print(f"our list is -> {my_list}")
    print(f"sum of first 4 elements in our list is: {sum_of_first_n(my_list, 4)}")

