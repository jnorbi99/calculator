<html>
<head>
    <title>Calculator</title>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e3f2fd;">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Calculator</a>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Basic</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="second.jsp">Scientific</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="third.jsp">MoneyChange</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="fourth.jsp">UnitConversion</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <form action="index.jsp" method="post">
    <div class="row">
        <div class="col-sm-6">
            <div class="card">
                <div class="card-body">
                    <div class="row">
                        <div class="col-sm-4">
                            <label for="number1" class="form-label">Number 1</label>
                            <input type="text" class="form-control" pattern="^-?[0-9]\d*(\.\d+)?$" id="number1" name="number1" required>
                        </div>
                        <div class="col-sm-2">
                            <label for="select" class="form-label">Operator</label>
                            <select class="form-select" aria-label="Default select example" id="select" name="select" required>
                                <option value="">Operators</option>
                                <option value="+">+</option>
                                <option value="-">-</option>
                                <option value="*">*</option>
                                <option value="/">/</option>
                            </select>
                        </div>
                        <div class="col-sm-4">
                            <label for="number2" class="form-label">Number 2</label>
                            <input type="text" class="form-control" pattern="^-?[0-9]\d*(\.\d+)?$" id="number2" name="number2" required>
                        </div>
                        <div class="col-sm">
                            <br>
                            <button type="submit" class="btn btn-success btn-lg" id="equal">=</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="card">
                <div class="card-body">
                    <div class="row">
                        <div class="col-sm-5">
                            <label class="form-label"><h3>Calculation</h3></label><br>
                            <% try{
                                Double num1, num2;
                                String operation;
                                num1 = Double.parseDouble(request.getParameter("number1"));
                                num2 = Double.parseDouble(request.getParameter("number2"));
                                operation = request.getParameter("select");
                                if(request.getParameter("number1") != null && request.getParameter("number2") != null && !operation.equals("")) {
                                    if(operation.contains("+")) {
                                        out.println(num1 + " + " + num2);
                                    } else if(operation.contains("-")) {
                                        out.println(num1 + " - " + num2);
                                    } else if(operation.contains("*")) {
                                        out.println(num1 + " * " + num2);
                                    } else if(operation.contains("/")) {
                                        out.println(num1 + " / " + num2);
                                    }
                                }
                            } catch (Exception e){
                                out.println("Nincs meg muvelet!");
                            }
                            %>
                        </div>
                        <div class="col-sm-1">
                            <br><br>
                            <button type="button" class="btn btn-secondary btn-lg" disabled>=</button>
                        </div>
                        <div class="col-sm-5">
                            <label class="form-label"><h3>Result</h3></label><br>
                            <% try{
                                Double num1, num2;
                                String operation;
                                num1 = Double.parseDouble(request.getParameter("number1"));
                                num2 = Double.parseDouble(request.getParameter("number2"));
                                operation = request.getParameter("select");
                                if(request.getParameter("number1") != null && request.getParameter("number2") != null && !operation.equals("")) {
                                    if(operation.contains("+")) {
                                        out.println(num1 + num2);
                                    } else if(operation.contains("-")) {
                                        out.println(num1 - num2);
                                    } else if(operation.contains("*")) {
                                        out.println(num1 * num2);
                                    } else if(operation.contains("/")) {
                                        out.println(num1 / num2);
                                    }
                                }
                            } catch (Exception e){
                                out.println("Nincs meg muvelet!");
                            }
                            %>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </form>
</body>
</html>