using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace Database_project.Models
{
    public class Assignee
    {
        public string Name { get; set; }
        public int AssigneeId { get; set; }

        public ICollection<Todo> Todos { get; set; }
    }
}
