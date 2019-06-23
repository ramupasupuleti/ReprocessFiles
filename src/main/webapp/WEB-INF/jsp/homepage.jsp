<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reprocess Files</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<!-- <link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css"> -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	
<script>
	$(document).ready(function() {
		$(function() {
			
		});
	});
</script>
</head>
<body>
	<h1>Reprocess Files</h1>
	<form:form name='reprocessFile' modelAttribute="ReprocessFileForm"
		action='/processFile' method='POST'>
		<div id="error_msg" class="yhplace"></div>
		<div class="form-group col-md-6">
			<div>
				<form:label path="fileTypes"
					class="col-sm-6 control-label text-right">Select type of File to process:</form:label>
				<form:select path="selectedFileType"
					class="form-control">
					<form:options items="${fileTypes}" />
				</form:select>
			</div>
			<div>
				<form:label path="inputParams"
					class="col-sm-6 control-label text-right">Enter params for File to process:</form:label>
				<form:textarea path="inputParams" rows="5" cols="30" />
			</div>
			<div class="col-sm-8">
				<div class="action_btns">
					<input type="submit" id="createvisit_btn" value="Submit"
						class="btn btn_red">
				</div>
			</div>
		</div>
	</form:form>

</body>
</html>