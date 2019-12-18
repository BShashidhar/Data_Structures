package stack;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class myStack {
    int arr[],top,len,size;
    public myStack(int n)
    {
        size=n;
        len=0;
        arr=new int[n];
        top=-1;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public boolean isFull()
    {
        return top==size-1;
    }
    public int getSize()
    {
        return len;
    }
    public void push(int i){
        if(top+1<size)
        {
            arr[++top]=i;
            len++;
         }   else{
                throw new IndexOutOfBoundsException("index Exception");
            }
    }
    public int pop(){
        if(isEmpty())
            throw new NoSuchElementException("ele not found exp");
            return arr[top];
    }
    public int peek(){
        if(isEmpty())
        throw new NoSuchElementException("ele not found exp");
        len--;
        return arr[top--];
    }
    public void display()
    {
       System.out.print("Stack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
		for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[]) 
    {
    	Scanner scan = new Scanner(System.in); 
		System.out.println("Enter Size of Integer Stack ");
        int n = scan.nextInt();
		myStack s=new myStack(n);
		char ch;
        do{            
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. size");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to push");
                try 
                {
                    s.push( scan.nextInt() );
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }                         
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = " + s.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 :         
                try
                {
                    System.out.println("Peek Element = " + s.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = " + s.isEmpty());
                break;                
            case 5 :
                System.out.println("Full status = " + s.isFull());
                break;                 
            case 6 : 
                System.out.println("Size = " + s.getSize());
                break;                         
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            /* display stack */
            s.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');                 
    }	
}