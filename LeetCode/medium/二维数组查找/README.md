#TwoDimensionalArraySearch（二维数组查找）

从上到下，从左到右依次为递增，查找某个数

##二分法

看到递增，直接反映是二分查找，但是，**二维数组怎么二分**<br>
假设，第一个元素（m1 , n1），最后一个元素（m2 , n2）;<br>
中间元素（（m1+m2）/2,（n1 +n2）/2），逐步比较，直到最后一个（（m1+m2）/2,（n1 +n2）/2） = （m1 , n1）的元素为止；<br>
如果没找到，说明，比（m1 , n1）大，比（m2 , n2）小，那么在右上和左下继续进行递归查找。

参考：<a href="http://justjavac.iteye.com/blog/1310178">http://justjavac.iteye.com/blog/1310178</a>

##简单法
1.这种方法思路清楚：从右上或者左下元素开始比较;<br>
2.如果比右上大，则行+1，如果小，则列-1，直至找到为止。