using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace FirstWebApp.Controllers
{[Route("[controller]")]
    public class HomeController : Controller
    {
       public string Index()
        {
            return "Hello from the controller!";
        }
    }
}