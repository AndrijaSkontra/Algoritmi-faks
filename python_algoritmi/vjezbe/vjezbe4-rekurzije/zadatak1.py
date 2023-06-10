def print_hello(n):
    if n == 0:
        pass
    elif n == 1:
        print("Hello!")
    else:
        print("Hello!")
        return print_hello(n - 1)


if __name__ == '__main__':
    print_hello(3)
    print("-----------------------------------")
    print_hello(0)
