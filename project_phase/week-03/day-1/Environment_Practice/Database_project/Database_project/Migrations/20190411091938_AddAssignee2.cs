using Microsoft.EntityFrameworkCore.Migrations;

namespace Database_project.Migrations
{
    public partial class AddAssignee2 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.RenameColumn(
                name: "ID",
                table: "Assignees",
                newName: "AssigneeId");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.RenameColumn(
                name: "AssigneeId",
                table: "Assignees",
                newName: "ID");
        }
    }
}
