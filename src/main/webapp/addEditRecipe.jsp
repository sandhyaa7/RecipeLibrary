<<%@include file="taglib.jsp"%>
<c:set var="title" value="Add/Edit Recipe" />
<%@include file="head.jsp"%>


<html>

<body>

<p><p></p>
<div class="container-fluid">
  <h2>Add/Edit Recipe</h2><br/>
  <form id="editRecipeForm" role="form" data-toggle="validator"
        class="form-horizontal"
        action="addEditRecipe"
        method="POST">

    <input type="hidden" id="id"
           name="id"
           value = ${recipe.id}>

    <div class="form-group">
      <label class="control-label col-sm-2" for="title">Title</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="title"
               name="title"
               value = "${recipe.recipeTitle}"
               data-error="Please enter the recipe's title." required>
      </div>
      <div class="help-block with-errors"></div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="description">Recipe Description</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="description"
               name="description"
               value = "${recipe.recipeDescription}"
               data-error="Please enter the description."
               required>
      </div>
      <div class="help-block with-errors"></div>
    </div>







    <button type="submit" class="btn btn-default col-sm-offset-3"
            data-disable="true">Add
    </button>
    <button type="reset" class="btn btn-default">Clear</button>
    <a href ="searchRecipe?searchTerm=&submit=viewAll"><button type="button" class="btn btn-default">Cancel</button></a>
  </form>
</div>
</body>
</html>
