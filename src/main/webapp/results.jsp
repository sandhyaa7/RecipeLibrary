<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results" />
<%@include file="head.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#recipeTable').DataTable();
    } );
</script>
<html>
<body>

<div class="container-fluid">
    <h2>Search Results: </h2>
    <table id="recipeTable" class="display" cellspacing="0" width="100%">
        <thead>
        <th>Recipe Title</th>
        <th>Recipe Description</th>
        <th>Users</th>
        </thead>
        <tbody>
        <c:forEach var="recipe" items="${recipes}">
            <tr>
                <td>${recipe.recipeTitle}</td>
                <td>${recipe.recipeDescription}</td>
                <td>${recipe.user.firstName} ${recipe.user.lastName}</td>

            </tr>


        </c:forEach>
        </tbody>
    </table>
</div>
<a href="index.jsp" >Go Back <<----</a>

</body>
</html>