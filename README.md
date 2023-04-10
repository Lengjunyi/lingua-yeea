# lingua-yeea
yee语言，符合普通话口语习惯的编程语言


## 1
INPUT: 4

PROGRAM: 估算出租车价钱就是把公里数乘上三再加上五

OUTPUT: 17 #=> 3 * 4 + 5 = 17

PROGRAM:
```
def 估算出租车价钱(公里数):
	ans = (公里数 * 3) + 5
	return ans
```

COMMENT：输入是从函数定义里的未知值自动提取的，不需要额外标记

## 2
INPUT: [97, 95, 0, 99]

PROGRAM: 求班级平均成绩就是把分数全都加起来，然后把结果除以分数的长度，然后四舍五入

OUTPUT: 73

COMPILED:
```
def 求班级平均成绩(分数):
	ans = reduce(分数, lambda x, y: x + y)
	ans = ans / len(分数)
	ans = round(ans)
	return ans
```

COMMENT：这里多个“然后”模拟了stream的操作。

## 3
INPUT: [10, 30, 20, 40]

PROGRAM: 求最大身高差就是把数组按照降序排列，得到有序数组，从有序数组取出第一个，得到最大值，从有序数组取出倒数第一个，得到最小值，然后用最大值减最小值

OUTPUT:20

COMPILED:
```
def 求最大身高差(数组):
	有序数组 = sorted(数组, reversed = True) #=> this (sorted(..., reversed=True)) is a primitive?
	最大值 = 有序数组[0]
	最小值 = 有序数组[-1]
	ans = 最大值 - 最小值
	return ans
```

COMMENT:这里用“得到”关键字定义了多个变量，同时使用了降序排列这一可能在编译器里也可能在prelude里的函数

## 4
INPUT: "abandon barbarian choose dodge"

PROGRAM: 找一行里的最长单词就是把" "作为分隔符来让行内容被分割，把结果当作字符串列表来找一个列表里最长的单词

OUTPUT: barbarian

COMPILED:
```
def 找一行里的最长单词(行内容):
	ans = 行内容.split(" ")
	ans = 找一个列表里最长的单词(ans)
	return ans
```

COMMENT:调用对象函数用”让<对象名>去/被<函数名>“，调用普通函数直接用”来<函数名>“

## 5
PROGRAM: "
瓜就是有甜度（默认是十），有大小（默认是”小“），有颜色的东西

如果把一个瓜切开，就是瓜的甜度除以二，变成瓜的新甜度。
"

COMPILED:
```
class 瓜:
	def __init__(self):
		self.甜度 = 10
		self.大小 = "小"
		self.颜色 = None
	def 切开(self):
		ans = self.甜度 / 2
		self.甜度 = ans
```


# 开发配置

## 1. 安装Antlr环境
```
pip install antlr4-tools  
```