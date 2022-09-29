using AccountApp.Exceptions;
using AccountApp.Model;

namespace AccountApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Account account = new() { Id = 1, Iban = "GR123", Firstname = "Th.", Lasname = "Andr.", Ssn = "123", Balance = 200M };

            try
            {
                account.Deposit(1000M);
                account.Withdraw(400M);
                Console.WriteLine(account);
            }
            catch(NegativeAmountException e1)
            {

                Console.WriteLine(e1.Message);
            }
            catch(InsufficientAmountException e2)
            {
                Account.Logger(e2);
                Console.WriteLine(e2.Message);
            }
        }
    }
}