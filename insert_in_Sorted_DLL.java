class GfG
{
    public static Node sortedInsert(Node head, int x)
    {
        // add your code here
        Node temp = new Node(x);
        if(head.data>x) {
            temp.next = head;
            head.prev = temp;
            return temp;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data<x){
         
          curr= curr.next;
        }
        temp.prev = curr;
        temp.next = curr.next;
        
        if(curr.next != null){
            curr.next.prev = temp;
        }
        
        curr.next = temp;
        
        return head;
    }
}
