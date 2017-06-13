<html>
    <head>
        <title>Online Library</title>
        <style>
            body{
            background-color: #da9f6c;
            width: 100%;
            }
            #main{
            margin: 0, auto;
            margin-top: 100px;
            }
            h1, #footer{
            text-align: center;
            color: #7d3f2e;
            font-weight: bold;
            }
            .title{
            font-weight: bold;
            }
            a.button {
            -webkit-appearance: button;
            -moz-appearance: button;
            appearance: button;

             background-color: #e7e7e7;
             border: 2px solid #7d3f2e;
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
        <div id ="main">
             <table width = "100%">
                 <tr width = "100%">
                    <td width = "80%">
                        <h1>The list of books</h1>
                    </td>
                    <td width = "20%">
                        <p> <a href='${springMacroRequestContext.getContextPath()}/book/new' class="button">New Book</a> </p>
                    </td>
                 </tr>
            </table>
            </br>
            <#list booksList as books>
                <div>
                    <table width = "100%">
                        <tr width = "100%">
                            <td width = "10%">
                            </td>
                            <td width = "90%", colspan="3">
                                <p class="title">${books.title}  by ${books.author}, ${books.yearOfPublishing}</p>
                            </td>
                        </tr>
                        <tr width = "100%">
                            <td width = "10%">
                            </td>
                            <td width = "70%">
                                <p>${books.description}</p>
                            </td>
                            <td width = "20%">
                                <p id="p01"> <a href='${springMacroRequestContext.getContextPath()}/book/remove/${books.id}' class="button">Remove</a> </p>
                            </td>
                        </tr>
                    </table>
                </div>
                </br>
                </br>
            </#list>
            </br>
            </br>
            </br>
            </br>
            <p id = "footer">Iryna Gaiduk &copy; 2017</p>
        <div>
    </body>
</html>