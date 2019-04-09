using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using BankOfSymba.Models;
using Microsoft.AspNetCore.Mvc;


namespace BankOfSymba.Controllers
{
    [Route("")]
    public class ShowController : Controller
    {
        static AccountsShowViewModel accountsShowView = new AccountsShowViewModel();

        [HttpGet("show")]
        public IActionResult Account()
        {
            BankAccount bankAccout = new BankAccount("Symba", 10000, "Lion");

            return View(bankAccout);
        }

        [HttpGet("escape")]

        public IActionResult Escaped()
        {
            return View();
        }

        [HttpGet("accounts")]
        public IActionResult Accounts()
        {
            List<string> listOfData = new List<string>() { "egy", "kettő", "három" };
            ViewData.Add("stringList", listOfData);
            //can be use: ViewData["stringList"] = listOfData;

            return View(accountsShowView);
        }

        [HttpPost("accounts")]
        public IActionResult AddAccount(BankAccount bankAccount)
        {
            Console.WriteLine(bankAccount.AnimalType);
            Console.WriteLine(bankAccount.Name);
            Console.WriteLine(bankAccount.BalanceInt);

            accountsShowView.AddAccount(bankAccount);
            return (Redirect("accounts"));
        }
    }
}