select dbo.Todos.Title, dbo.Assignees.Name from dbo.Todos
 full outer join  dbo.Assignees on dbo.Todos.Idegenkulcs = dbo.Assignees.AssigneeId
;