class Solution {
    public Node copyRandomList(Node head) {
       if(head==null){
        return null;
       } 

       //clone nodes adding 
       Node temp = head;
       while(temp!=null){
        Node cloneNode = new Node(temp.val);
        cloneNode.next=temp.next;//link
        temp.next=cloneNode;//link
        temp = cloneNode.next;//move next node

       }
       //copy random pointers
       temp= head;
       while(temp!=null){
        Node oldNode = temp;
        Node newNode = temp.next;
       // technique used -> oldnode ka random ka next equal to newNode ke random,
        if(oldNode.random!=null){
            newNode.random = oldNode.random.next;
        }
        temp = newNode.next;
       }
      // saperate the list
       temp = head;
       Node resListHead = head.next;

       while(temp!=null){
        Node oldNode = temp;
        Node cloneNode = temp.next;

        oldNode.next = cloneNode.next;
        if(cloneNode.next!=null){
            cloneNode.next= cloneNode.next.next;

        }
        temp = temp.next;
    
       }
       return resListHead;

    }
}