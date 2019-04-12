using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;

namespace Database_project.Models
{
    public class Assignee
    {
        public string Name { get; set; }
        public int AssigneeId { get; set; }

        [ForeignKey("AssigneeFK")]
        public ICollection<Todo> Todos { get; set; }
    }
}
