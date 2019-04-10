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
        public IActionResult List([FromQuery] string isActive = "")
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

            //Todo todoToAdd = new Todo() { Title = "Added todo", IsDone = false, IsUrgent = true };
            //applicationContext.Add(todoToAdd);

            ////Todo todoToChange = applicationContext.Todos.FirstOrDefault(i => i.Title == "negyedik");
            ////todoToChange.Title = "harmadik updated";
            ////applicationContext.Update(todoToChange);

            //applicationContext.SaveChanges();
            return View(todos);
        }

        [HttpPost("create")]
        public IActionResult Create(Todo todoToAdd)
        {
            applicationContext.Todos.Add(todoToAdd);
            applicationContext.SaveChanges();
            return Created("the todo has been created", todoToAdd);
        }

        [HttpGet("{id}/edit")]
        public IActionResult Edit(int id)
        {
            Todo todoToUpdate = applicationContext.Todos.FirstOrDefault(i => i.Id == id);

            return Accepted("the todo to update from Edit action", todoToUpdate);
        }
    }  
}
