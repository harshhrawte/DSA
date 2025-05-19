class Node{
    int data;
    Node next;

    Node(int data1,Node next1)
    {
        this.data=data1;
        this.next=next1;
    }
    Node(int data1)
    {
        this.data=data1;
        this.next=null;
    }
}
public class LL2{
    private static Node arr2ll(int [] arr)
    {
        int n=arr.length;
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<n;i++)
        {
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
          return head;  
    }

//insert in last
 private static Node insertinlast(Node head,int val)
{
    Node temp=head;
    while(temp.next!=null)
    {
      temp=temp.next;
    }
    Node naya=new Node(val);
    temp.next=naya;
    return head;
}


//print ll
private static void print(Node head)
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+ " ");
        temp=temp.next;
    }
    System.out.println();
}
    public static void main(String[] args) {
        int [] arr={2,4,6,8};
        Node head=  arr2ll(arr);
        print(head);
        head=insertinlast(head,100);
     print(head);
    }
}