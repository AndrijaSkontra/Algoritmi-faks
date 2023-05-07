from typing import List, Tuple


def read_data_as_list(file_name: str) -> List[str]:
    my_file = open(file_name, "r")
    return my_file.readlines()


def convert_to_numbers(slst: List[str]) -> List:
    converted_list = []
    for element in slst:
        element = element.strip()
        if '.' in element:
            converted_list.append(float(element))
        else:
            converted_list.append(int(element))
    return converted_list


def eliminate_duplicates(iflst: List) -> List:
    my_set = set(iflst)
    return list(my_set)


def find_pos_neg_ints(filst: List) -> Tuple:
    pos_ints = []
    neg_ints = []
    for elem in filst:
        if isinstance(elem, int) and elem > 0:
            pos_ints.append(elem)
        elif isinstance(elem, int) and elem < 0:
            neg_ints.append(elem)
    return tuple(pos_ints), tuple(neg_ints)


if __name__ == '__main__':
    # read data
    lst = read_data_as_list("data.txt")
    # convert to floats and numbers
    lst = convert_to_numbers(lst)
    # eliminate duplicates
    lst = eliminate_duplicates(lst)
    # find positive and negative integers
    pos, neg = find_pos_neg_ints(lst)
    print("Positive integers: ", pos)
    print("Negative integers: ", neg)