<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jokes</title>
</head>
<body bgcolor="#C3FFFC">
<h1>${jokeQuestion}</h1>
<p><strong>${jokeAnswer}</strong></p>
<button type="button" onclick="window.location.reload();">Show another joke</button>
<div style="padding-top:30px;">
    <form action="/joke/" method="POST">
        <label for="reaction">Did you like the joke?</label><br>
        <input type="radio" id="yes" name="reaction" value="yes">
        <label for="yes">Yes</label><br>
        <input type="radio" id="no" name="reaction" value="no">
        <label for="no">No</label><br>
        <label for="feedback">More feedback (Optional):</label><br>
        <input type="text" id="feedback" name="feedback"><br>
        <input type="submit" value="Submit">
    </form>
</div>
<p><small>${serviceInfo}</small></p>
</body>
</html>
