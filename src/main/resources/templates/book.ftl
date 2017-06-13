<html>
   <title>Online Library</title>
    <head>
        <style>
            body {
            background-color: #da9f6c;
            text-align: center;
            margin-top: 100px;
            }
            h1, #footer{
            text-align: center;
            color: #7d3f2e;
            font-weight: bold;
            }
            a.button, input.button {
            -webkit-appearance: button;
            -moz-appearance: button;
            appearance: button;
            background-color: #e7e7e7;
             color: #7d3f2e;
             padding: 5 5px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
             font-size: 16px;
             font-weight: bold;
             cursor: pointer;
             display: inline-block;
             }
        </style>
    </head>
    <body>
        <h1> Information about book:</h1>
        <div class="header">${title}</div>
        <form action="${springMacroRequestContext.getContextPath()}/book/add" method="post">
            <input name="author" type="text" size="100" placeholder="Author" value="${author}"/>
            <br>
            <input name="title" type="text" size="100" placeholder="Title" value="${title}"/>
            <br>
            <textarea name="description" placeholder="Content" rows="25" cols="102">${description}</textarea>
            <br>
            <input name="yearOfPublishing" type="text" size="100" placeholder="Year of publishing" value="${yearOfPublishing}"/>
            <br>
            <br>
            <p class="button"> <input class="button" type="submit" value="Save"></p>
            <p class="button"> <a href='${springMacroRequestContext.getContextPath()}/books_list' class="button">Return to Main Page</a> </p>
        </form>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <p id = "footer">Iryna Gaiduk &copy; 2017</p>
    </body>
</html>