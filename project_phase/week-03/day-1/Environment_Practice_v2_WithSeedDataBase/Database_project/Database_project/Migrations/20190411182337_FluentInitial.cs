using Microsoft.EntityFrameworkCore.Migrations;

namespace Database_project.Migrations
{
    public partial class FluentInitial : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Todos_Assignees_AssigneeFK",
                table: "Todos");

            migrationBuilder.RenameColumn(
                name: "AssigneeFK",
                table: "Todos",
                newName: "Idegenkulcs");

            migrationBuilder.RenameIndex(
                name: "IX_Todos_AssigneeFK",
                table: "Todos",
                newName: "IX_Todos_Idegenkulcs");

            migrationBuilder.AddForeignKey(
                name: "FK_Todos_Assignees_Idegenkulcs",
                table: "Todos",
                column: "Idegenkulcs",
                principalTable: "Assignees",
                principalColumn: "AssigneeId",
                onDelete: ReferentialAction.Restrict);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Todos_Assignees_Idegenkulcs",
                table: "Todos");

            migrationBuilder.RenameColumn(
                name: "Idegenkulcs",
                table: "Todos",
                newName: "AssigneeFK");

            migrationBuilder.RenameIndex(
                name: "IX_Todos_Idegenkulcs",
                table: "Todos",
                newName: "IX_Todos_AssigneeFK");

            migrationBuilder.AddForeignKey(
                name: "FK_Todos_Assignees_AssigneeFK",
                table: "Todos",
                column: "AssigneeFK",
                principalTable: "Assignees",
                principalColumn: "AssigneeId",
                onDelete: ReferentialAction.Restrict);
        }
    }
}
