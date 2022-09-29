namespace StudentLikeJava
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Student alice = new Student();
            Student bob = new();
            var julia = new Student();

            Student costas = new Student() { Id = 3, Firstname = "Costas", Lastname = "A." };

            alice.Id = 1;
            bob.Id = 2;

            alice.Firstname = "Alice";
            bob.Firstname = "Bob";

            alice.Lastname = "W";
            bob.Lastname = "M";

            Console.WriteLine($"{alice.Id}, {alice.Firstname}, {alice.Lastname}");
        }
    }
}