<html>
<body>

	<h1>${headerMessage}</h1>

	<h3> STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h3>

	<form action="/submitAdmissionForm.html" method="post">
	

			<p>Student's Name : </p><p>        <input type="text" name="studentName" /></p>

			<p>Student's Hobby : </p><p>       <input type="text" name="studentHobby" /></p>

			<p>Student's Mobile : </p><p>      <input type="text" name="studentMobile" /></p>

			<%--<p>Student's DOB : </p><p>     	   <input type="text" name="studentDOB" /></p>

			<p>Student's Skills set :</p><td>    <select name="studentSkills" multiple>
													<option value="Java Core">Java Core</option>
													<option value="Spring Core">Spring Core</option>
													<option value="Spring MVC">Spring MVC</option>
													</select><p>--%>
		<p><input type="submit" value="Submit this form by clicking here" /></p>
	</form>

</body>
</html>

