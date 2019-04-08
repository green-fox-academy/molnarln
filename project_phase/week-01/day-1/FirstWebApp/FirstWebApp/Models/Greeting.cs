using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using System.Threading;

namespace FirstWebApp.Models
{
    public class Greeting
    {
        public long Id{ get; set; }
        public string Content { get; set; }

        public Greeting(long id, string content)
        {
            Id = id;
            Content = content;
        }

    }

   
}
