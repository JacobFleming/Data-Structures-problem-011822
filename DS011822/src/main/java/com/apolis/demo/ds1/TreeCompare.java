package com.apolis.demo.ds1;

public class TreeCompare {
	public static void runner() {
		System.out.println("===================================================================");

		System.out.println("Tree compare");
		System.out.println("===================================================================");

		Node root = new Node(5);

		root.add(2);
		root.add(4);
		root.add(8);
		root.add(6);
		root.add(7);
		root.add(3);
		root.add(9);
		System.out.println("tree one IOT");
		root.traverseLevelOrder();
		System.out.println();
		Node root2 = new Node(5);

		root2.add(2);
		root2.add(4);
		root2.add(8);
		root2.add(6);
		root2.add(7);
		root2.add(3);
		root2.add(9);
		System.out.println("tree two IOT");
		root2.traverseLevelOrder();
		System.out.println();
		if (identicalTrees(root, root2)) {
			System.out.println("they are the same");

		} else {
			System.out.println("they different");
		}
		System.out.println();

		root = new Node(5);
		root.add(7);
		root.add(3);
		root.add(9);
		root.add(2);
		root.add(4);
		root.add(8);
		root.add(6);

		System.out.println("tree three IOT");
		root.traverseLevelOrder();
		System.out.println();
		if (identicalTrees(root, root2)) {
			System.out.println("they are the same");

		} else {
			System.out.println("they different");
		}
		System.out.println();
	}

	static boolean identicalTrees(Node a, Node b) {
		
		if (a == null && b == null)
			return true;


		if (a != null && b != null)
			return (a.getValue() == b.getValue() && identicalTrees(a.getLeft(), b.getLeft())
					&& identicalTrees(a.getRight(), b.getRight()));

	
		return false;
	}
}
