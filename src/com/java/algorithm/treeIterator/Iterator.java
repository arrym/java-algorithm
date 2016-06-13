package com.java.algorithm.treeIterator;
/**
 * 这个接口我们有2个方法，hasNext()是否还有下一条数据，next返回具体的Object 这里也就是树。
 * 我们先不必要忙着做他的实现类，我们现在要来做的是这个容器（不是JAVA中容器，与arraylist什么的无关），正所谓树的容器是什么，是山也！
 * 我们想想山应该具有什么呢！？ 首先它要有种植树的功能，这里可以看作添加树。我们可以想像山的功能是和
 * 树相互关联的，那么他们之间是什么关系呢，我们给他们一种聚合的关系，聚合的关系大家可以参考UML图，
 * 我在这里给出它的一种程序表现形式。
 * 
 * @author soul
 * 
 */
public interface Iterator {
	public boolean hasNext();
	public Object next();
}
