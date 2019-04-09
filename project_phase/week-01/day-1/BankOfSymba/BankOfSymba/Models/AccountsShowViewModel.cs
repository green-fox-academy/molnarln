using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BankOfSymba.Models
{
    public class AccountsShowViewModel
    {
        public List<BankAccount> BankAccounts { get; set; }
        public BankAccount BankAccount { get; set; }

        public AccountsShowViewModel()
        {
            this.BankAccount = new BankAccount();

            BankAccounts = new List<BankAccount>()
            {   new BankAccount("Symba", 12000, "Lion"){IsKing = true},
                new BankAccount("Pumba", 2000, "pig"),
                new BankAccount("Nala", 34000, "Lion")
            };
        }

        public void AddAccount(BankAccount bankAccountToAdd)
        {
            BankAccounts.Add(bankAccountToAdd);
        }
    }
}
