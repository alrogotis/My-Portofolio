namespace DictionaryStudentApp
{
    internal class Program
    {
        static IDictionary<int, Student> map = new Dictionary<int, Student>();

        static void Main(string[] args)
        {
            map.Add(1, new Student() { Id = 1, Firstname = "Th", Lastname = "And." });

            map.Remove(1);

            map[2] = new Student() { Id = 2, Firstname = "Bob", Lastname = "Marley" };

            if (map.ContainsKey(1)) 
            {
                Student studentOne = map[1];
            }

            Console.WriteLine("Size: " + map.Count);

            foreach(KeyValuePair<int, Student> kvp in map)
            {
                Console.WriteLine("Key: " + kvp.ToString());
            }
                

        }
    }
}