using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;

namespace Database_project.Migrations
{
    public partial class AddAssigneeTable : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<int>(
                name: "AssigneeFK",
                table: "Todos",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.CreateTable(
                name: "Assignees",
                columns: table => new
                {
                    Name = table.Column<string>(nullable: true),
                    ID = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Assignees", x => x.ID);
                });

            migrationBuilder.CreateIndex(
                name: "IX_Todos_AssigneeFK",
                table: "Todos",
                column: "AssigneeFK");

            migrationBuilder.AddForeignKey(
                name: "FK_Todos_Assignees_AssigneeFK",
                table: "Todos",
                column: "AssigneeFK",
                principalTable: "Assignees",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Todos_Assignees_AssigneeFK",
                table: "Todos");

            migrationBuilder.DropTable(
                name: "Assignees");

            migrationBuilder.DropIndex(
                name: "IX_Todos_AssigneeFK",
                table: "Todos");

            migrationBuilder.DropColumn(
                name: "AssigneeFK",
                table: "Todos");
        }
    }
}
