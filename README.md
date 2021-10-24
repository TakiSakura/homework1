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
public Point(double _x, double _y, double _z) {
        x = _x;
        y = _y;
        z = _z;
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
