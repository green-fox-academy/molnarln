using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using FirstWebApp.Models;
using System.Threading;

namespace FirstWebApp.Controllers
{
    [Route("api")]
    public class RestController : Controller
    {
        private static int PageCounter { get; set; }

        [Route("greeting")]
        [HttpGet]
        // can replace with [HttpGet("greeting")
        public Greeting greet([FromQuery]string name)
        {
            PageCounter++;
            Greeting greeting = new Greeting(1, $"number of reloads: {PageCounter}, your name: {name}");
            return greeting;
        }
    }
}