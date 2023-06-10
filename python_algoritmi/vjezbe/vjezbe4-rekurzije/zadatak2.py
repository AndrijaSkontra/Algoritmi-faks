from timeit import default_timer as timer


def power_to(x, n):
    if n == 0:
        return 1
    else:
        return x * power_to(x, n - 1)


def power_to_loop(x, n):
    y = 1
    for i in range(n):
        y *= x
    return y


def elapsed_time(funct, lst):
    st_time = timer()
    for num in lst:
        funct(2, num)
    end_time = timer()
    return end_time - st_time


if __name__ == '__main__':
    our_list = [2, 5, 7, 11, 15, 25, 30, 50, 63]
    print(f"time passed to recursion = {elapsed_time(power_to, our_list):.7f}")
    print(f"time passed for loop = {elapsed_time(power_to_loop, our_list):.7f}")


# to get real elapsed time we should run the program many times and calculate the average time
