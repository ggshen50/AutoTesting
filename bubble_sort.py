# encoding:utf-8
# 冒泡排序，时间复杂度：NlogN
def bubble_sort(lst):
    for i in range(len(lst) + 1):
        for j in range(len(lst) - i - 1):
            if lst[j] > lst[j + 1]:
                lst[j], lst[j + 1] = lst[j + 1], lst[j]

if __name__ == '__main__':
    lst = [73, 18, 9, 32, 73, 99, 53]
    bubble_sort(lst)
    print('排序后的列表为：{}'.format(lst))


