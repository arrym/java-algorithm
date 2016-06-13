package com.java.algorithm.treeIterator;
/**
 * 这里我们定义的山可以抽象出Hall类来，Tree[] tree 可以看作是山和树之间的一种聚合关系。add方法就是添加树。问题来了，山
 * 
 * 和树有了关系，那么山和迭代器有什么关系呢。它们之间肯定有一种关系。我们有了这个容器（山），就要把这个容器来实现迭代的方法：hasNext()和Next()
 * .恩这里我们可以看
 * 
 * 出，山和迭代器之间也是一种关联关系。我们就把它看成是一种聚合关系（TIP：聚合关系一种特殊的关联关系）。
 * 我们可以通过一个connectIterator方法来链接山和迭代器，接下来
 * 
 * 我们要去做一个具体的迭代类，这个具体的类中间有了hasNext()和Next()的具体实现方法 这里Hall hall
 * 就可以看作是一种关联关系，我们要把山和迭代器联系起来就通过构造函数来实现，hasNext和next实现方法就体现出来了
 * 有了山，有了迭代器，可是树还没有定义，不过这个树的方法还很好解决！树不关联其他的事务，我们可以简单的这么写：
 * 
 * @author soul
 * 
 */
public class Hall {
	Tree[] tree; // 这里可以看作是聚合关系
	private int index; // 指向Tree[]的标签
	public Hall(int maxNumber) {
		tree = new Tree[maxNumber];
		index = 0;
	}
	public void add(Tree tree) {
		this.tree[index] = tree;

		index++;
	}

	public Iterator connectIterator() {
		return new TreeIterator(this);
	}

}
