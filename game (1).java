package game;


import java.util.*;


		public class game {

		    private static class Node {
		        int data;
		        Node next;

		        public Node(int data) {
		            this.data = data;
		            this.next = null;
		        }
		    }

		    public static void balonPozisyonuBul(int m, int n) {
		        Node head = new Node(1);
		        Node current = head;
		        for (int i = 2; i <= n; i++) {
		            Node node = new Node(i);
		            current.next = node;
		            current = current.next;
		        }
		        current.next = head;

		        while (current.next != current) {
		            for (int i = 1; i < m; i++) {
		                current = current.next;
		            }
		            Node temp = current.next;
		            current.next = temp.next;
		            temp = null;
		        }

		        System.out.println("Son kalan balonun pozisyonu: " + current.data);
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("N değerini girin: ");
		        int n = scanner.nextInt();

		        System.out.print("M değerini girin: ");
		        int m = scanner.nextInt();

		        balonPozisyonuBul(m, n);
		    }

	}



