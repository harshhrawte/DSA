//basic code structur of LL
// this is node class
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
};

//convert arr to LL here we pass arr and then convert it to LL
//public class arrtoLL
public class arrtoLL {
    private static Node ArrtoLL(int [] arr)
{
    Node head=new Node(arr[0]);
    Node mover=head;
    for(int i=1;i<arr.length;i++)
    {
        Node temp=new Node(arr[i]);
        mover.next=temp;
        mover=temp;
    }
    return head;
}


//delete head
private static Node deletenuddu(Node head)
{  if(head==null) return head;

   head=head.next;
   return head;
}

//delete tail
private static Node deletelast(Node head)
{
    Node temp=head;
    if(head==null || head.next==null)
    return null;

    while(temp.next.next!=null)
    {
        temp=temp.next;
    }
    temp.next=null;
    return head;
}


//this is main function 
//this main function which is in main class
    public static void main(String[] args) {
        int [] arr={2,4,6,8};
        Node head=ArrtoLL(arr);
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data + "");
            temp=temp.next;
        }
        head= deletenuddu(head);
        temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data + "");
            temp=temp.next;
        }
        head=deletelast(head);
        temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data + "");
            temp=temp.next;
        }
    }
}
