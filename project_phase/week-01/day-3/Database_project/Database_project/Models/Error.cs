using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Database_project.Models
{
    public class ErrorMessage
    {
        public string Error { get; set; }

        public ErrorMessage(String ErrorMessage)
        {
            this.Error = ErrorMessage;
        }
    }
}
