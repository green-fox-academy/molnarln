using Microsoft.EntityFrameworkCore.Migrations;

namespace Database_project.Migrations
{
    public partial class RemoveCascadeDeleteFunctionality : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Todos_Assignees_AssigneeFK",
                table: "Todos");

            migrationBuilder.AlterColumn<int>(
                name: "AssigneeFK",
                table: "Todos",
                nullable: true,
                oldClrType: typeof(int));

            migrationBuilder.AddForeignKey(
                name: "FK_Todos_Assignees_AssigneeFK",
                table: "Todos",
                column: "AssigneeFK",
                principalTable: "Assignees",
                principalColumn: "AssigneeId",
                onDelete: ReferentialAction.Restrict);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Todos_Assignees_AssigneeFK",
                table: "Todos");

            migrationBuilder.AlterColumn<int>(
                name: "AssigneeFK",
                table: "Todos",
                nullable: false,
                oldClrType: typeof(int),
                oldNullable: true);

            migrationBuilder.AddForeignKey(
                name: "FK_Todos_Assignees_AssigneeFK",
                table: "Todos",
                column: "AssigneeFK",
                principalTable: "Assignees",
                principalColumn: "AssigneeId",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
