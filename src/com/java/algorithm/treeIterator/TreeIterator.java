package com.java.algorithm.treeIterator;
/**
 * 
 * @author soul
 *
 */
public class TreeIterator implements Iterator {

	private int last = 0;
	private Hall hall;

	public TreeIterator(Hall hall) {
		this.hall = hall;
	}

	public boolean hasNext() {
		if (last < hall.tree.length)
			return true;
		else
			return false;
	}

	public Tree next() {
		Tree t = hall.tree[last];
		last++;
		return t;
	}
}
