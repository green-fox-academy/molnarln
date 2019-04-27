using Database_project.Models;
using Microsoft.EntityFrameworkCore;


namespace Database_project
{
    public class ApplicationContext : DbContext
    {
        public ApplicationContext(DbContextOptions options) : base(options){}

        public DbSet<Todo>Todos { get; set; }
        public DbSet<Assignee> Assignees { get; set; }

        public DbSet<Library> Badges { get; set; }
        public DbSet<User> Users { get; set; }
        public DbSet<Archetype> Archetypes { get; set; }
        public DbSet<Pitch> Pitches { get; set; }



        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            
            modelBuilder.Entity<Assignee>().HasMany(i => i.Todos).WithOne(i => i.Assigneee).HasForeignKey(i=>i.AssigneeFK);

            modelBuilder.Entity<Todo>().Property(i => i.AssigneeFK).HasColumnName("Idegenkulcs");
        }
    }
}
