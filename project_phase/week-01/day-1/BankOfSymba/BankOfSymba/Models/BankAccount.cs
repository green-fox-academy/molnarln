using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BankOfSymba.Models
{
    public class BankAccount
    {
        public string Name { get; set; }
        public int BalanceInt { get; set; }
        public string AnimalType { get; set; }
        public string BalanceString { get; set; }

        public BankAccount(string name, int balance, string animalType)
        {
            Name = name;
            BalanceInt = balance;
            AnimalType = animalType;
            this.BalanceString = BalanceInt.ToString("F");
        }
    }
}
