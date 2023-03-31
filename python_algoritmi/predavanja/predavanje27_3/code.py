def simple_func(a, b = 3):
    print(a)
    print(b)


def simple_args(*args):
    for el in args:
        print(el)


if __name__ == '__main__':
    simple_func(3)
    simple_args(2, 4, "argument")
    parms = [234, "neko", 21.21]
    simple_args(*parms)
    simple_args(parms)