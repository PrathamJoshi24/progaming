class node {
    int  data;
    node link;
    node(int d){
        data=d;
        link = null;
    }
}
class llist{
    node ob;
    llist(int x){
        ob = new node(x);
    }
    void add(int x){
      node current = ob;
      while(current.link != null) current = current.link;
      
      current.link = new node (x);
    }
    
    void printlist(){
        node current = ob;
        while(current != null){
            System.out.println(current.data);
            current = current.link;
        }
    }
}

 
public class Main
{
	public static void main(String[] args) {
		llist list = new llist(12);
		list.add(25);
		list.add(6);
		list.add(34);
		list.add(59);
		list.add(99);
		
		list.printlist();
	}
}