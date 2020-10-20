
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
        int carry=0;
        ListNode node = l1;
        ListNode prev = new ListNode();
        while(l1!=null)
        {
            int total=0;
            if(l2!=null)
            total = l1.val + l2.val + carry;
            
            else
            total = l1.val + carry;
            
            l1.val = total % 10;
            carry = total/10;
            prev = l1;
            l1 = l1.next;
            if(l2!=null)
            l2=  l2.next;
        
        }
        
        while(l1==null && l2!=null)
        {
            l1= new ListNode((l2.val + carry)%10);
            prev.next = l1;
            carry = (carry + l2.val) / 10;
            l1.next = null;
            prev = l1;
            l1=l1.next;
            l2=l2.next;
        }
        if(carry!=0)
        {
            l1 = new ListNode(carry);
            prev.next = l1;
        }
        return node;
    }
}
