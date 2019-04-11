﻿// <auto-generated />
using System;
using Database_project;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

namespace Database_project.Migrations
{
    [DbContext(typeof(ApplicationContext))]
    partial class ApplicationContextModelSnapshot : ModelSnapshot
    {
        protected override void BuildModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "2.1.8-servicing-32085")
                .HasAnnotation("Relational:MaxIdentifierLength", 128)
                .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

            modelBuilder.Entity("Database_project.Models.Assignee", b =>
                {
                    b.Property<int>("AssigneeId")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Name");

                    b.HasKey("AssigneeId");

                    b.ToTable("Assignees");
                });

            modelBuilder.Entity("Database_project.Todo", b =>
                {
                    b.Property<long>("Id")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<int?>("AssigneeFK");

                    b.Property<int?>("AssigneeeAssigneeId");

                    b.Property<string>("Description");

                    b.Property<bool>("IsDone");

                    b.Property<bool>("IsUrgent");

                    b.Property<string>("Title");

                    b.HasKey("Id");

                    b.HasIndex("AssigneeeAssigneeId");

                    b.ToTable("Todos");
                });

            modelBuilder.Entity("Database_project.Todo", b =>
                {
                    b.HasOne("Database_project.Models.Assignee", "Assigneee")
                        .WithMany("Todos")
                        .HasForeignKey("AssigneeeAssigneeId");
                });
#pragma warning restore 612, 618
        }
    }
}
