namespace StackApp
{
    /// <summary>
    /// Stack is a LIFO.
    /// </summary>
    internal class Program
    {
        static int[] stack = new int[10];
        static int top = -1;
        static void Main(string[] args)
        {
            try
            {
                Push(1);
                Push(2);
                Push(3);
                Push(4);
                Push(5);

                int num = Pop();
                Console.WriteLine("{0}", num);
                Console.WriteLine();

                Traverse();

            } catch(StackIsEmptyException e1)
            {
                Console.WriteLine(e1);
            }catch(StackIsFullException e2)
            {
                Console.WriteLine(e2);
            }catch(Exception e3)
            {
                Console.WriteLine(e3);
            }
        }

        public static void Push(int num)
        {
            try
            {
                if (!IsFull())
                {
                    stack[++top] = num;
                }
                else
                {
                    throw new StackIsFullException();
                }

            } catch (StackIsFullException e)
            {
                throw e;
            } 
        }

        public static int Pop()
        {
            try
            {
                if (!IsEmpty())
                {
                    return stack[top--];
                }
                else
                {
                    throw new StackIsEmptyException();
                }
            }
            catch(StackIsEmptyException e)
            {
                throw e;
            }
            
        }

        public static bool IsFull()
        {
            return top == (stack.Length - 1);
        }

        public static bool IsEmpty()
        {
            return top == -1;
        }

        public static void Traverse()
        {
            try
            {
                if (!IsEmpty())
                {
                    throw new StackIsEmptyException();
                }
                for (int i = 0; i <= top; i++)
                {
                    Console.WriteLine($"{stack[i]} ");
                    Console.WriteLine();
                }
            }
            catch (StackIsEmptyException e)
            {
                throw e;
            }
            
        }
    }
}