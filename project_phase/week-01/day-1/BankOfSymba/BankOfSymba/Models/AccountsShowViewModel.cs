using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BankOfSymba.Models
{
    public class AccountsShowViewModel
    {
        public List<BankAccount> BankAccounts { get; set; }

        public AccountsShowViewModel()
        {
            this.BankAccounts = new List<BankAccount>()
            {   new BankAccount("Symba", 12000, "Lion"){IsKing = true},
                new BankAccount("Pumba", 2000, "pig"),
                new BankAccount("Nala", 34000, "Lion")
            };


        }
    }
}
