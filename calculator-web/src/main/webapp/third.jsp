<%@ page import="org.example.controller.HufToEurController" %>
<%@ page import="org.example.controller.EurToHufController" %>
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
                    <a class="nav-link" href="second.jsp">Scientific</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">MoneyChange</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="fourth.jsp">UnitConversion</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<form action="third.jsp" method="post">
<div class="row">
    <div class="col-sm-6">
        <div class="card">
            <div class="card-body">
                <div class="row">
                    <div class="col-sm-4">
                        <label for="number" class="form-label">Value</label>
                        <input type="text" class="form-control" pattern="[0-9]*" id="number" name="number" required>
                    </div>
                    <div class="col-sm-3">
                        <label for="select" class="form-label">ChangeType</label>
                        <select class="form-select" aria-label="Default select example" id="select" name="select" required>
                            <option value="">ChangeType</option>
                            <option value="HUFTOEUR">HUF->EUR</option>
                            <option value="EURTOHUF">EUR->HUF</option>
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
                        <%
                            try{
                                Double number;
                                number = Double.parseDouble(request.getParameter("number"));
                                String operation;
                                operation = request.getParameter("select");
                                if(request.getParameter("number") != null && !operation.equals("")) {
                                    if(operation.contains("HUFTOEUR")) {
                                        out.println(number + " HUF To EUR");
                                    } else if(operation.contains("EURTOHUF")) {
                                        out.println(number + " EUR To HUF");
                                    }
                                }
                            } catch (Exception e) {
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
                        <%
                            try{
                                Class.forName("org.sqlite.JDBC");
                                double number;
                                number = Double.parseDouble(request.getParameter("number"));
                                String HufToEurString = HufToEurController.getInstance().change();
                                Double HufToEur = Double.parseDouble(HufToEurString) * number;
                                String EurToHufString = EurToHufController.getInstance().change();
                                Double EurToHuf = Double.parseDouble(EurToHufString) * number;
                                String operation;
                                operation = request.getParameter("select");
                                if(request.getParameter("number") != null && !operation.equals("")) {
                                    if(operation.contains("HUFTOEUR")) {
                                        out.println(String.format("%.2f", HufToEur) + " EUR");
                                    } else if(operation.contains("EURTOHUF")) {
                                        out.println(String.format("%.0f", EurToHuf) + " HUF");
                                    }
                                }
                            } catch (Exception e) {
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