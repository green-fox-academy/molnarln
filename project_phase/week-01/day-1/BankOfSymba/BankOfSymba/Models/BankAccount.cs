using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BankOfSymba.Models
{
    public class BankAccount
    {
        private static int GlobalId { get; set; }

        public int Id { get; set; }
        public string Name { get; set; }
        public int BalanceInt { get; set; }
        public string AnimalType { get; set; }
        public bool IsKing { get; set; }

        public BankAccount(string name, int balance, string animalType)
        {
            Name = name;
            BalanceInt = balance;
            AnimalType = animalType;
            this.Id = GlobalId;
            GlobalId++;
        }
        public BankAccount()
        {
            this.Id = GlobalId;
            GlobalId++;
        }

        public override string ToString()
        {
            return this.BalanceInt.ToString("F");
        }
    }
}
