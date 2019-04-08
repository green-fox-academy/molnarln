using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using FirstWebApp.Models;

namespace FirstWebApp.Controllers
{
    [Route("[controller]")]
    public class HelloController : Controller
    {

        public IActionResult Hello()
        {
            Hellos hellos = new Hellos();
            //default view name is the method name, but it is possible to add other name to is
            // eg. valami (the view must have the same name)
            return View("valami", hellos);
        }
    }
}