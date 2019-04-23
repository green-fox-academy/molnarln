using Database_project.Models;
using Newtonsoft.Json;

namespace Database_project
{
    public class Todo
    { 
        public long Id { get; set; }
        public string Title { get; set; }
        public string Description { get; set; }
        public bool IsUrgent { get; set; }
        public bool IsDone { get; set; }
        [JsonIgnore]
        public Assignee Assigneee { get; set; }
        public int? AssigneeFK { get; set; }



    }
}
