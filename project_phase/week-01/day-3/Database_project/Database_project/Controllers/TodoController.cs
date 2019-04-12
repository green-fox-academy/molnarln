using Database_project.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;

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
        public IActionResult Edit([FromRoute]int id)
        {
            Todo todoToUpdate = applicationContext.Todos.FirstOrDefault(i => i.Id == id);

            return Accepted("the todo to update from Edit action", todoToUpdate);
        }

        [HttpPut("{id}/edit")]

        public IActionResult UpdateTodo([FromRoute] int id, [FromForm] int assigneeId)
        {
            if (applicationContext.Todos.FirstOrDefault(i => i.Id == id) == null)
            {
                return NotFound();
            }
            else
            {

                Todo todoToUpdate = applicationContext.Todos.FirstOrDefault(i => i.Id == id);
                Assignee assigneeToAdd = applicationContext.Assignees.FirstOrDefault(i => i.AssigneeId == assigneeId);

                applicationContext.Todos.Update(todoToUpdate);
                applicationContext.SaveChanges();

                return Accepted("The entity has been updated!", todoToUpdate);
            }
        }

        [HttpPost("addassignee")]
        public IActionResult AddAssignee([FromBody] Assignee assignee)
        {
            applicationContext.Assignees.Add(assignee);

            applicationContext.SaveChanges();
            return Accepted(assignee);
        }

        [HttpGet("{id}/gettodos")]

        public IActionResult GetTodos([FromRoute] int id)
        {
            List<Todo> todos = applicationContext.Assignees.Include(a => a.Todos).FirstOrDefault(a => a.AssigneeId == id).Todos.ToList();
            Assignee assignee = applicationContext.Assignees.Include(a => a.Todos).FirstOrDefault(a => a.AssigneeId == id);
            
            return Accepted(assignee);
        }

        [HttpGet("geterror")]
        public IActionResult GetError()
        {
            return NotFound(new ErrorMessage("Page not found!"));
        }
    }
}