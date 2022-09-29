namespace StringsDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string s1 = "AUEBAUEB";
            string s2 = "   aueb    ";

            bool equals = s1.Equals(s2);
            //bool equals2 = s1 == s2;

            bool eq = s1.CompareTo(s2) == 0;
            bool lt = s1.CompareTo(s2) == -1;
            bool gt = s1.CompareTo(s2) == 1;

            string s3 = s1 + s2;
            string s4 = s1.ToLower();
            string s5 = s2.ToUpper();

            int index = s1.IndexOf("A", 1);
            string s6 = s1.Substring(4);
            string s7 = s1.Substring(1, 3);

            char[] delim = new char[] { '$', '*', '%', ' ' };
            string s8 = s2.Trim(delim);
        }
    }
}