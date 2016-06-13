package com.java.algorithm.treeIterator;
/**
 * 
 * @author soul
 *
 */
public class Pren {

	public Pren() {
	}
	public static void main(String[] args) {
		Hall hall = new Hall(4);
		hall.add(new Tree("苹果树"));
		hall.add(new Tree("梨树"));
		hall.add(new Tree("橘子树"));
		hall.add(new Tree("凤梨树"));
		for (Iterator i = hall.connectIterator(); i.hasNext();) {
			String Type = ((Tree) (i.next())).getName();
			if (Type == "苹果树") {
				System.out.println("洒苹果树的农药,");
			}
			if (Type == "梨树") {
				System.out.println("洒梨树的农药");
			}
			if (Type == "橘子树") {
				System.out.println("洒橘子树的农药,洒了也没用,还没到成熟日,现在没结果实");
			}
			if (Type == "凤梨树") {
				System.out.println("南风天，湿气大，让它烂在地里吧");
			}
		}
	}
}
