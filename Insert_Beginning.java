public class Main
{
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int x){
            data = x;
            next= null;
            prev = null;
        }
    }
	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		
		head.next = temp1;
		temp1.prev = head;
		temp1.next=temp2;
		temp2.prev = temp1;
		head = insertBegin(head,5);
		printlist(head);
		
	}
	static Node insertBegin(Node head,int x){
	    Node temp = new Node (x);
	    
	    if(head == null){
	        temp.next =head ;
	        return temp;
	        }
	     temp.next = head;
	     head.prev = temp;
	     return temp;
	}
	public static void printlist(Node head){
	     Node curr=head;
	     while(curr!=null){
	         System.out.print(curr.data+" ");
	         curr = curr.next;
	     }
	}
}
