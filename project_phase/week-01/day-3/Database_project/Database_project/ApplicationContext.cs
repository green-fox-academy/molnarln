﻿using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Database_project.Models;

namespace Database_project
{
    public class ApplicationContext : DbContext
    {
        public ApplicationContext(DbContextOptions options) : base(options){}

        public DbSet<Todo>Todos { get; set; }
        public DbSet<Assignee> Assignees { get; set; }
    }
}
