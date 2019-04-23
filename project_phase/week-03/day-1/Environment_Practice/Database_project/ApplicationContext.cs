using Database_project.Models;
using Microsoft.EntityFrameworkCore;

namespace Database_project
{
    public class ApplicationContext : DbContext
    {
        public ApplicationContext(DbContextOptions options) : base(options){}

        public DbSet<Todo>Todos { get; set; }
        public DbSet<Assignee> Assignees { get; set; }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            
            modelBuilder.Entity<Assignee>().HasMany(i => i.Todos).WithOne(i => i.Assigneee).HasForeignKey(i=>i.AssigneeFK);

            modelBuilder.Entity<Todo>().Property(i => i.AssigneeFK).HasColumnName("Idegenkulcs");
        }
    }
}
