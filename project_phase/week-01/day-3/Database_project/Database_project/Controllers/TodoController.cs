using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace Database_project.Controllers
{

    [Route("todo")]
    public class TodoController : Controller
    {
        private readonly ApplicationContext applicationContext;
        public TodoController(ApplicationContext applicationContext)
        {
            this.applicationContext = applicationContext;
        }

        [HttpGet]
        [Route("")]
        [Route("list")]
        public IActionResult List([FromQuery] string isActive="")
        {

            bool active;
            var todos = applicationContext.Todos;

            if (isActive.Equals("true", StringComparison.InvariantCultureIgnoreCase))
            {
                active = true;
                return View(todos.Where(i => !i.IsDone).ToList());
            };

            if (isActive.Equals("false", StringComparison.InvariantCultureIgnoreCase))
            {
                active = false;
                return View(todos.Where(i => i.IsDone).ToList());
            };

            Todo todoToAdd = new Todo() { Title = "Added todo", IsDone = false, IsUrgent = true };
            applicationContext.Add(todoToAdd);

            Todo todoToChange = applicationContext.Todos.FirstOrDefault(i => i.Title == "harmadik");
            todoToChange.Title = "harmadik updated";
            applicationContext.Update(todoToChange);

            applicationContext.SaveChanges();
            return View(todos);
        }
    }
}
