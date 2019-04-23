using Microsoft.EntityFrameworkCore.Migrations;

namespace Database_project.Migrations
{
    public partial class teszt6 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "Teszt",
                table: "Todos");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<string>(
                name: "Teszt",
                table: "Todos",
                nullable: true);
        }
    }
}
