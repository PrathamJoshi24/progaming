import java.util.Scanner;

class Node {
	int data;
	Node link;


	Node(int d)
	{
		data = d;
		link = null;
	}
}

public class Main {
	Node START;
	int len = 0;
	
	void addF(int x) {
		Node nptr=new Node(x);
		if(START==null) {
			START=nptr;
			len++;
		}
		else {
			nptr.link=START;
			START=nptr;
			len++;
		}
	}

	void addB(int x) {
		Node nptr=new Node(x);
		Node ptr = START;
		if(START==null) {
			START=nptr;
			len++;
			return;
		}
		len++;

		while(ptr.link!=null) ptr = ptr.link;
		ptr.link = nptr;

	}

	void addP(int p, int x) {
		if (p<=len) {
			Node nptr=new Node(x);
			Node ptr = START;
			int n = 1;
			len++;
			while(n<p) {
				n++;
				ptr = ptr.link;
			}
			nptr.link = ptr.link;
			ptr.link = nptr;

		}
		else
			System.out.println("the position " +p+ " does not exist , in the link list");
	}

	void deleteF() {
		if (START != null) {
			START = START.link;
			len--;
		}
	}

	void deleteB() {
		if(START!=null) {
			Node ptr = START;
			if(START.link == null) {
				START = START.link;
				len--;
				return;
			}
			else if(START == null) return;
			while(ptr.link.link != null) ptr = ptr.link;
			ptr.link = null;
			len--;
		}
	}

	void deleteP(int p) {
		if(p<=len) {
			Node ptr = START;
			int n = 1;
			while(n<p) {
				n++;
				ptr = ptr.link;
			}

			ptr.link = ptr.link.link;
			len--;
		}
		else System.out.println("there is no object at the position "+p);
		
	}

	String display() {
		if(START==null) return "LL IS EMPTY";
		else {
			Node ptr=START;
			String st = "";
			while(ptr!=null) {
				st += (ptr.data+" ");
				ptr=ptr.link;
			}
			return st;
		}
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Main ob=new Main();
		int ch = -1;
		while(true) {
			System.out.println("\033[H\033[2J" + ob.display() +"\n\t**LINK LIST**\n1.add at front\n2.delete from front\n3.add at the back\n4.delete from the back\n5.add at a position\n6.delete from a position\n7.exit");
			System.out.print("enter the choice: ");
			ch = s.nextInt();
			switch(ch) {
			case 1:
				System.out.print("eter the element to be added: ");
				ob.addF(s.nextInt());
				break;
			case 2:
				ob.deleteF();
				break;
			case 3:
				System.out.print("eter the element to be added: ");
				ob.addB(s.nextInt());
				break;
			case 4:
				ob.deleteB();
				break;
			case 5:
				System.out.print("eter the element to be added: ");
				int x = s.nextInt();
				System.out.print("enter the position of the element to be added (1-"+ob.len+")");
				ob.addP(s.nextInt(), x);
				break;
			case 6:
				System.out.print("enter the position of the element to be removed (1-"+ob.len+")");
				ob.deleteP(s.nextInt());
				break;
			case 7:
				return;
			default:
				System.out.println("invalid choice: ");
			}
		}
	}
}
