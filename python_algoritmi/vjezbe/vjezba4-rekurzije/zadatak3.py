from zadatak2 import *


def power_funct(x, n):
    if n == 0:
        return 1
    elif n > 0 and n % 2 == 1:
        return x * (power_funct(x, abs(n // 2)) * power_funct(x, abs(n // 2)))
    elif n > 0 and n % 2 == 0:
        return power_funct(x, abs(n // 2)) * power_funct(x, abs(n // 2))


def avarage_of_thousant_func(funct1, funct2):
    our_sum = 0
    for i in range(1_000):
        our_sum += funct1(funct2, [29])
    our_average = our_sum / 1_000
    return print(f"Average of calling FUNCTION --> {funct2.__name__} --> 1000 times is: {our_average:.7f} s")


if __name__ == '__main__':
    avarage_of_thousant_func(elapsed_time, power_to)
    avarage_of_thousant_func(elapsed_time, power_to_loop)
    avarage_of_thousant_func(elapsed_time, power_funct)
