namespace CompareApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Product> products = new List<Product>()
            { 
                new Product() {Description="Milk", Price=12.6, Quantity=10},
                new Product() {Description="Honey", Price=12.6, Quantity=10},
                new Product() {Description="Milk", Price=12.6, Quantity=10}


            };

            var honeyProducts = from product in products where product.Description == "Honey" select product;

            foreach (var product in honeyProducts)
            {
                Console.WriteLine(product);
            }

            var sortedProducts = from product in products orderby product.Quantity select product;

            foreach (Product product in sortedProducts)
            {
                Console.WriteLine(product);
            }

            IEnumerable<Product> sorted = products.OrderBy(product => product.Price));

            List<Product> sortedList = products.OrderBy(product => product.Price).ToList;

            sortedList.ForEach(p => Console.WriteLine(p));

            var sum = products.Where(p => p.Description == "Milk").Select(p => p.Price).Sum();

            var sum2 = (from p in products select p.Quantity).Sum();

            products.Sort();
            products.ForEach(p => Console.WriteLine(p));
            Console.WriteLine();

            products.Sort((p1, p2) => p1.Price.CompareTo(p2.Price));
            products.ForEach(p => Console.WriteLine(p));
            Console.WriteLine();

            products.ForEach(delegate (Product p)
            {
                Console.WriteLine(p);
            });
        }
    }
}