def reversing_with_stack(object):
    my_lst = []
    if isinstance(object, list):
        for i in range(len(object) - 1, -1, -1):
            my_lst.append(object[i])
        return my_lst
    elif isinstance(object, tuple):
        for i in range(len(object) - 1, -1, -1):
            my_lst.append(object[i])
        return tuple(my_lst)
    elif isinstance(object, str):
        for i in range(len(object) - 1, -1, -1):
            my_lst.append(object[i])
        return "".join(my_lst)
    else:
        return "Unsupported type"


if __name__ == '__main__':
    inp = [11, -23, 90, 87, 54, 78, 0, -12, 33, 45, 67, 89, 90, 11, 23, 45, 67, 89, 90]
    some_string = "ovo je neki string koji nam treba za testiranje"
    inpt = (1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    print()
    print(reversing_with_stack(inp))
    print(reversing_with_stack(some_string))
    print(reversing_with_stack(inpt))