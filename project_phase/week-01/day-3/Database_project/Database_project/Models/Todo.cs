using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace Database_project
{
    public class Todo
    { 
        public long Id { get; set; }
        public string Title { get; set; }
        public bool IsUrgent { get; set; }
        public bool IsDone { get; set; }
    }
}
