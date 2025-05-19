class Node{
    int data;
    Node next;
    Node back;

    Node(int data1,Node next1,Node back1)
    {
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }

    Node(int data1)
    {
        this.data=data1;
        this.next=null;
        this.back=null;
    }
}


//arr2DLL
public class DLL {
  private static Node a2dll(int [] arr)
  {
     Node head=new Node(arr[0]);
     Node prev=head;

     if (arr.length == 0) return null;

     for(int i=1;i<arr.length;i++)
     {
        Node temp=new Node(arr[i]);
        prev.next=temp;
        temp.back=prev;
        prev=temp;
     }
     return head;
  }


//delete head

private static Node delhead(Node head)
{

    if(head==null || head.next==null) return null;
    Node prev=head;
    head=head.next;
    prev.next=null;
    head.back=null;

    return head;
}


//delete tail
private static Node deltail(Node head)
{
    Node tail=head;
    while(tail.next!=null)
    {
        tail=tail.next;
    }
    Node prev=tail.back;
    prev.next=null;
    tail.back=null;
    return head;
}

  //print function
  static void print(Node head)
  {
    while(head!=null)
    {
        System.out.print(head.data+" ");
        head=head.next;
    }
    System.out.println();
  }


  //main
    public static void main(String[] args) {
        int [] arr={2,4,6,8};
        Node head=a2dll(arr);
        print(head);
        head=delhead(head);
        print(head);
        head=deltail(head);
        print(head);
    }
}
