using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AccountApp.Model
{
    internal class Account
    {
        public long Id { get; set; }
        public string Iban { get; set; }

        public string Firstname { get; set; }

        public string Lasname { get; set; }

        public string Ssn { get; set; }

        public decimal Balance { get; set; }

        public override string ToString()
        {
            return base.ToString();
        }

        public void Deposit(decimal amount)
        {
            try
            {
                if (amount >= 0)
                {
                    Balance += amount;
                }
                else
                {
                    throw new Exception();
                }
            }
            catch(Exception e)
            {
                //Logger(e);
                Console.WriteLine(e);
                throw; 
            }
        }

        public void Withdraw(decimal amount)
        {
            try
            {
                if (amount <= Balance)
                {
                    Balance -= amount;
                }
                else
                {
                    throw new Exception();
                }
            }
            catch (Exception e)
            {
                Logger(e);
                Console.WriteLine(e);
                throw;
            }
        }

        internal static void Logger(Exception e)
        {
            FileStream fs = new FileStream(@"C:\tmp\log.txt", FileMode.Append);
            StreamWriter sw = new StreamWriter(fs);
            sw.AutoFlush = true;
            sw.WriteLine($"{DateTime.Now:dd/MM/yyyy HH:mm:ss}, {e}");
        }
    }
}
