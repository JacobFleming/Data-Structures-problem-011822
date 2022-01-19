package com.apolis.demo.ds1;

public class TreeSearch {
	public static void runner() {
		System.out.println("===================================================================");
		System.out.println("Tree Search");
		System.out.println("===================================================================");
		Node root = new Node(5);
		root.add(9);
		root.add(7);
		root.add(2);
		root.add(4);
		root.add(8);
		root.add(6);
		root.add(7);
		root.add(3);
		root.add(9);

		search(root, 4, 7);
	}

	private static void search(Node node, int lower, int upper) {
		if (node == null)
			return;
		int value = node.getValue();
		if (value >= lower)
			search(node.getLeft(), lower, upper);
		if (value >= lower && value <= upper)
			System.out.print(" " + node.getValue());
		if (value <= upper)
			search(node.getRight(), lower, upper);
	}
}
