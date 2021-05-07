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
                    <a class="nav-link" href="third.jsp">MoneyChange</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="fourth.jsp">UnitConversion</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<form action="fourth.jsp" method="post">
<div class="row">
    <div class="col-sm-6">
        <div class="card">
            <div class="card-body">
                <div class="row">
                    <div class="col-sm-4">
                        <label for="number" class="form-label">Number</label>
                        <input type="text" class="form-control" pattern="^-?[0-9]\d*(\.\d+)?$" id="number" name="number" required>
                    </div>
                    <div class="col-sm-3">
                        <label for="select" class="form-label">Converter Type</label>
                        <select class="form-select" aria-label="Default select example" id="select" name="select" required>
                            <option value="">ConverterType</option>
                            <option value="ttomg">t->mg</option>
                            <option value="ttog">t->g</option>
                            <option value="ttodkg">t->dkg</option>
                            <option value="ttokg">t->kg</option>
                            <option value="kgtomg">kg->mg</option>
                            <option value="kgtog">kg->g</option>
                            <option value="kgtodkg">kg->dkg</option>
                            <option value="kgtot">kg->t</option>
                            <option value="dkgtomg">dkg->mg</option>
                            <option value="dkgtog">dkg->g</option>
                            <option value="dkgtokg">dkg->kg</option>
                            <option value="dkgtot">dkg->t</option>
                            <option value="gtomg">g->mg</option>
                            <option value="gtodkg">g->dkg</option>
                            <option value="gtokg">g->kg</option>
                            <option value="gtot">g->t</option>
                            <option value="mgtog">mg->g</option>
                            <option value="mgtodkg">mg->dkg</option>
                            <option value="mgtokg">mg->kg</option>
                            <option value="mgtot">mg->t</option>
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
                            Double num;
                            String operation;
                            num = Double.parseDouble(request.getParameter("number"));
                            operation = request.getParameter("select");
                            if (request.getParameter("number") != null && !operation.equals("")) {
                                if (operation.contains("ttomg")) {
                                    out.println(num + " t to mg");
                                } else if (operation.contains("ttog")) {
                                    out.println(num + " t to g");
                                } else if (operation.contains("ttodkg")) {
                                    out.println(num + " t to dkg");
                                } else if (operation.contains("ttokg")) {
                                    out.println(num + " t to kg");
                                } else if (operation.contains("kgtomg")) {
                                    out.println(num + " kg to mg");
                                } else if (operation.contains("kgtog")) {
                                    out.println(num + " kg to g");
                                } else if (operation.contains("kgtodkg")) {
                                    out.println(num + " kg to dkg");
                                } else if (operation.contains("kgtot")) {
                                    out.println(num + " kg to t");
                                } else if (operation.contains("dkgtomg")) {
                                    out.println(num + " dkg to mg");
                                } else if (operation.contains("dkgtog")) {
                                    out.println(num + " dkg to g");
                                } else if (operation.contains("dkgtokg")) {
                                    out.println(num + " dkg to kg");
                                } else if (operation.contains("dkgtot")) {
                                    out.println(num + " dkg to t");
                                } else if (operation.contains("gtomg")) {
                                    out.println(num + " g to mg");
                                } else if (operation.contains("gtodkg")) {
                                    out.println(num + " g to dkg");
                                }  else if (operation.contains("gtokg")) {
                                    out.println(num + " g to kg");
                                } else if (operation.contains("gtot")) {
                                    out.println(num + " g to t");
                                } else if (operation.contains("mgtog")) {
                                    out.println(num + " mg to g" );
                                } else if (operation.contains("mgtodkg")) {
                                    out.println(num + " mg to dkg");
                                } else if (operation.contains("mgtokg")) {
                                    out.println(num + " mg to kg");
                                } else if (operation.contains("mgtot")) {
                                    out.println(num + " mg to t");
                                }
                            }
                        } catch (Exception e){
                            out.println("Nincs meg muvelet!");
                        } %>
                    </div>
                    <div class="col-sm-1">
                        <br><br>
                        <button type="button" class="btn btn-secondary btn-lg" disabled>=</button>
                    </div>
                    <div class="col-sm-5">
                        <label class="form-label"><h3>Result</h3></label><br>
                        <% try{
                            double num;
                            String operation;
                            num = Double.parseDouble(request.getParameter("number"));
                            operation = request.getParameter("select");
                            if (request.getParameter("number") != null && !operation.equals("")) {
                                if (operation.contains("ttomg")) {
                                    out.println(num * 1000000000 + " mg");
                                } else if (operation.contains("ttog")) {
                                    out.println(num * 1000000 + " g");
                                } else if (operation.contains("ttodkg")) {
                                    out.println(num * 100000 + " dkg");
                                } else if (operation.contains("ttokg")) {
                                    out.println(num * 1000 + " kg");
                                } else if (operation.contains("kgtomg")) {
                                    out.println(num * 1000000 + " mg");
                                } else if (operation.contains("kgtog")) {
                                    out.println(num * 1000 + " g");
                                } else if (operation.contains("kgtodkg")) {
                                    out.println(num * 100 + " dkg");
                                } else if (operation.contains("kgtot")) {
                                    out.println(num / 1000 + " t");
                                } else if (operation.contains("dkgtog")) {
                                    out.println(num * 10 + " g");
                                } else if (operation.contains("dkgtomg")) {
                                    out.println(num * 10000 + " mg");
                                } else if (operation.contains("dkgtokg")) {
                                    out.println(num / 100 + " kg");
                                } else if (operation.contains("dkgtot")) {
                                    out.println(num / 100000 + " t");
                                } else if (operation.contains("gtomg")) {
                                    out.println(num * 1000 + " mg");
                                } else if (operation.contains("gtodkg")) {
                                    out.println(num / 10 + " dkg");
                                }  else if (operation.contains("gtokg")) {
                                    out.println(num / 1000 + " kg");
                                } else if (operation.contains("gtot")) {
                                    out.println(num / 1000000 + " t");
                                } else if (operation.contains("mgtog")) {
                                    out.println(num / 1000 + " g");
                                } else if (operation.contains("mgtodkg")) {
                                    out.println(num / 10000 + " dkg");
                                } else if (operation.contains("mgtokg")) {
                                    out.println(num / 1000000 + " kg");
                                } else if (operation.contains("mgtot")) {
                                    out.println(num / 1000000000 + " t");
                                }
                            }
                        } catch (Exception e){
                            out.println("Nincs meg muvelet!");
                        } %>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</form>
</body>
</html>