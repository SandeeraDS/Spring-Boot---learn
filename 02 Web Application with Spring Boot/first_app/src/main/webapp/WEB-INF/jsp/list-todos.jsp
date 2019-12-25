<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Todo's for ${name}</title>
</head>
<body>
	<table>
		<caption>Your todos are</caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>Target Date</th>
				<th>Is it Done?</th>
			</tr>
		</thead>
		<tbody>
			<!-- for(Todo todo:todos) -->
			<c:forEach items="${todos}" var="todo">
				<tr>
					<th>${todo.desc}</th>
					<th>${todo.targetDate}</th>
					<th>${todo.done }</th>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<a href="/add-todo">Add a Todo</a>
</body>
</html>
