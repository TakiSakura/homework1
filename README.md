# 作业:求立体空间两点距离
## 实验目的
* 掌握构造方法的用法
* 理解类中属性和方法的使用
## 实验要求
* 组织类
* 定义类的属性、方法
## 实验步骤
* 步骤一:根据本周课堂中讲述的求取平面坐标内两点间的距离示例，编写程序.
* 步骤二:求三维立体空间中两点的距离。
## 实验方法
根据课上所给的代码,在属性中添加z周,并在构造方法和和实例化中添加z轴的参数,在get distance方法中,添加z-p.z.最后进行输出所得值
## 关键代码
### 构造方法和其实例化
```
public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
 ```
 ```
 Point origin = new Point(1.0, 12.0, 9.0);
 ```
 ### 计算两点间距离的方法
 ```
 public double getDistance(Point p) {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z));
    }
  ```
## 实验结果
  ![结果](https://github.com/TakiSakura/homework1/blob/96748c525aca6e3d65ed09061d21488587d57307/%E6%88%AA%E5%B1%8F2021-10-24%20%E4%B8%8B%E5%8D%8810.56.31.png)
---
* 定义类中的属性x y z后为其使用构造方法的重栽进行实例化.
* 创造一个普通方法,用其计算两点间距离
* 在main方法中实例化两点,对象名分别叫origin和dest
* 以对象origin对detdistance进行调用,其参数为dest
* get distance方法计算完后,返回值进行输出
---
## 实验感想
在课上的习题中,通过老师的讲解,对这串代码有了初步了解.明白了在同一个类中,各个属性和方法的关系,和其中的联系.并且理解了对象的使用,
例如源代码19行,调用了对象origin的getdistance方法,将dest实参传值给形参Point p.
