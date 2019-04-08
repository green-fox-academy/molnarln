using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using FirstWebApp.Controllers;
using FirstWebApp.Models;

namespace FirstWebApp.Controllers
{
    //can use [Route("Web")] also
    [Route("[controller]")]
    public class WebController : Controller
    {
        private static int PageCounter;


        [HttpGet("greeting")]
        
        public IActionResult Greeting([FromQuery] string name)
        {
            PageCounter++;
            var greeting = new Greeting()
            {
                Id = PageCounter,
                Content = name
            };


            return View(greeting);
        }
    }
}