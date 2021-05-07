<html>
<head>
    <title>Calculator</title>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e3f2fd;">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Calculator</a>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Basic</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page"  href="#">Scientific</a>
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
<form action="second.jsp" method="post">
<div class="row">
    <div class="col-sm-6">
        <div class="card">
            <div class="card-body">
                <div class="row">
                    <div class="col-sm-4">
                        <label for="number" class="form-label">Number</label>
                        <input type="text" class="form-control" pattern="^-?[0-9]\d*(\.\d+)?$" id="number" name="number" required>
                    </div>
                    <div class="col-sm-2">
                        <label for="select" class="form-label">Operator</label>
                        <select class="form-select" aria-label="Default select example" id="select" name="select" required>
                            <option value="">Operators</option>
                            <option value="1/x">1/x</option>
                            <option value="x^2">x^2</option>
                            <option value="sqrt">sqrt</option>
                            <option value="sin">sin</option>
                            <option value="cos">cos</option>
                            <option value="tan">tan</option>
                        </select>
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
                            double number;
                            String operation;
                            number = Double.parseDouble(request.getParameter("number"));
                            operation = request.getParameter("select");
                            if(request.getParameter("number") != null && !operation.equals("")) {
                                if(operation.contains("1/x")) {
                                    out.println("1 / " + number);
                                } else if(operation.contains("x^2")) {
                                    out.println(number + " ^2");
                                } else if(operation.contains("sqrt")) {
                                    out.println("sqrt (" + number +")");
                                } else if(operation.contains("sin")) {
                                    out.println("sin (" + number +")");
                                } else if(operation.contains("cos")) {
                                    out.println("cos (" + number +")");
                                } else if(operation.contains("tan")) {
                                    out.println("tan (" + number +")");
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
                            double number;
                            String operation;
                            number = Double.parseDouble(request.getParameter("number"));
                            operation = request.getParameter("select");
                            if(request.getParameter("number") != null && !operation.equals("")) {
                                if(operation.contains("1/x")) {
                                    if (number != 0) {
                                        out.println(1/number);
                                    } else {
                                        out.println("Nincs sajnos 1/0..");
                                    }
                                } else if(operation.contains("x^2")) {
                                    out.println(number*number);
                                } else if(operation.contains("sqrt")) {
                                    if (number > 0) {
                                        out.println(Math.sqrt(number));
                                    } else {
                                        out.println("0-nal nagyobb szamot kerek..");
                                    }
                                } else if(operation.contains("sin")) {
                                    double radian = Math.toRadians(number);
                                    out.println(Math.sin(radian));
                                } else if(operation.contains("cos")) {
                                    double radian = Math.toRadians(number);
                                    out.println(Math.cos(radian));
                                } else if(operation.contains("tan")) {
                                    double radian = Math.toRadians(number);
                                    out.println(Math.tan(radian));
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